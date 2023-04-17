#include <REGX52.H>
#include "Delay.h"

//引脚定义
sbit LCD_RS=P2^6;
sbit LCD_RW=P2^5;
sbit LCD_EP=P2^7;
#define LCD P0

/**********************************************************************
功能：LCD1602写命令
参数：command 要写入的命令
返回值：无
**********************************************************************/
void LCD_WriteCommand(unsigned char command)
{
	LCD_RS=0;
	LCD_RW=0;
	LCD=command;
	LCD_EP=1;
	Delay(20);
	LCD_EP=0;
	Delay(20);
}
/**********************************************************************
功能：LCD1602写数据
参数：datas 要写入的数据
返回值：无
**********************************************************************/
void LCD_WriteData(unsigned char datas)
{
	LCD_RS=1;
	LCD_RW=0;
	LCD=datas;
	LCD_EP=1;
	Delay(20);
	LCD_EP=0;
	Delay(20);
}
/********************************************************************************
功能：LCD1602液晶初始化
参数：无
返回值：无
********************************************************************************/
void LCD_Init(void)
{
	//工作方式设置:8位数据，2行显示，5x10点阵
	LCD_WriteCommand(0X3C);
	//显示状态设置：显示开、光标开、闪烁开
	LCD_WriteCommand(0X0C);
	//光标右移，AC值加1
	LCD_WriteCommand(0X14);
	//读写操作后，AC值自动加1
	LCD_WriteCommand(0X06);
	//归位
	LCD_WriteCommand(0X02);
	//清屏
	LCD_WriteCommand(0X01);
}

/**********************************************************************
功能：LCD1602液晶显示一个字符
参数：row 显示行位置，columns 显示列位置，character 要显示的字符
返回值：无
**********************************************************************/
void LCD_ShowChar(unsigned char row,unsigned char columns,unsigned char character)
{
	if(row==1){LCD_WriteCommand(0X80|(columns-1));}
	else if(row==2){LCD_WriteCommand(0X80|(columns-1+40));}
	LCD_WriteData(character);
}

/**********************************************************************
功能：LCD1602液晶显示一个字符串
参数：row 显示行位置，columns 显示列位置，string 要显示的字符
返回值：无
**********************************************************************/
void LCD_ShowString(unsigned char row,unsigned char columns,unsigned char* string)
{
	unsigned char i=0;
	
	for(i=0;string[i]!='\0';i++)
	{
		LCD_ShowChar(row,columns+i,string[i]);
	}
}

/**********************************************************************
功能：LCD1602液晶显示一个数字
参数：row 显示行位置，columns 显示列位置，number 要显示的数字，length 数字长度
返回值：无
**********************************************************************/
unsigned char arr[16];
void LCD_ShowNumber(unsigned char row,unsigned char columns,unsigned int number,unsigned char length)
{
	//把数字分解成字符串
	unsigned char i=0;
	
	for(i=length-2;i>=0;i--)
	{
		arr[i]=number%10;
		number=number/10;	
	}
	arr[length]='\0';
	LCD_ShowString(row,columns,arr);
}