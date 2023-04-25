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
	//д����ģʽ����
	LCD_RS=0;
	LCD_RW=0;
	//����
	LCD=command;
	//����д��
	LCD_EP=1;
	Delay(1);
	//д�����
	LCD_EP=0;
	Delay(1);
}
/**********************************************************************
���ܣ�LCD1602д����
������datas Ҫд�������
����ֵ����
**********************************************************************/
void LCD_WriteData(unsigned char datas)
{
	//д����ģʽ����
	LCD_RS=1;
	LCD_RW=0;
	//����
	LCD=datas;
	//����д��
	LCD_EP=1;
	Delay(1);
	//д�����
	LCD_EP=0;
	Delay(1);
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
	//��ʾ״̬���ã���ʾ�������ء���˸��
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
	else if(row==2){LCD_WriteCommand(0X80|(columns-1)+0X40);}
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
//		Delay(10);
	}
}

/**********************************************************************
���ܣ�LCD1602Һ����ʾһ������
������row ��ʾ��λ�ã�columns ��ʾ��λ�ã�number Ҫ��ʾ�����֣�length ���ֳ���
����ֵ����
**********************************************************************/
void LCD_ShowNumber(unsigned char row,unsigned char columns,unsigned int number,unsigned char length)
{
	//�����ַֽ���ַ���
	unsigned char i=0;
	
	for(i=length;i>0;i--)
	{
		LCD_ShowChar(row,columns+i-1,(number%10)+'0');
		number=number/10;
	}
}