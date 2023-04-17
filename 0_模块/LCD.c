#include <REGX52.H>
#include "Delay.h"

//���Ŷ���
sbit LCD_RS=P2^6;
sbit LCD_RW=P2^5;
sbit LCD_EP=P2^7;
#define LCD P0

/**********************************************************************
���ܣ�LCD1602д����
������command Ҫд�������
����ֵ����
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
���ܣ�LCD1602д����
������datas Ҫд�������
����ֵ����
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
���ܣ�LCD1602Һ����ʼ��
��������
����ֵ����
********************************************************************************/
void LCD_Init(void)
{
	//������ʽ����:8λ���ݣ�2����ʾ��5x10����
	LCD_WriteCommand(0X3C);
	//��ʾ״̬���ã���ʾ������꿪����˸��
	LCD_WriteCommand(0X0C);
	//������ƣ�ACֵ��1
	LCD_WriteCommand(0X14);
	//��д������ACֵ�Զ���1
	LCD_WriteCommand(0X06);
	//��λ
	LCD_WriteCommand(0X02);
	//����
	LCD_WriteCommand(0X01);
}

/**********************************************************************
���ܣ�LCD1602Һ����ʾһ���ַ�
������row ��ʾ��λ�ã�columns ��ʾ��λ�ã�character Ҫ��ʾ���ַ�
����ֵ����
**********************************************************************/
void LCD_ShowChar(unsigned char row,unsigned char columns,unsigned char character)
{
	if(row==1){LCD_WriteCommand(0X80|(columns-1));}
	else if(row==2){LCD_WriteCommand(0X80|(columns-1+40));}
	LCD_WriteData(character);
}

/**********************************************************************
���ܣ�LCD1602Һ����ʾһ���ַ���
������row ��ʾ��λ�ã�columns ��ʾ��λ�ã�string Ҫ��ʾ���ַ�
����ֵ����
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
���ܣ�LCD1602Һ����ʾһ������
������row ��ʾ��λ�ã�columns ��ʾ��λ�ã�number Ҫ��ʾ�����֣�length ���ֳ���
����ֵ����
**********************************************************************/
unsigned char arr[16];
void LCD_ShowNumber(unsigned char row,unsigned char columns,unsigned int number,unsigned char length)
{
	//�����ַֽ���ַ���
	unsigned char i=0;
	
	for(i=length-2;i>=0;i--)
	{
		arr[i]=number%10;
		number=number/10;	
	}
	arr[length]='\0';
	LCD_ShowString(row,columns,arr);
}