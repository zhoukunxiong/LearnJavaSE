/*
 *ʵ�ֹ��ܣ�
 *����1��LCDҺ����ʾ�ַ�
 *����2��LCDҺ����ʾ�ַ���
 *����3��LCDҺ����ʾ����
 */
#include <REGX52.H>
#include "LCD.h"

void main(void)
{
	//LCD��ʼ��
	LCD_Init();
	//����1
//	LCD_ShowChar(2,5,'Z');
//	LCD_ShowChar(2,6,'K');
//	LCD_ShowChar(2,7,'X');
	//����2
//	LCD_ShowString(2,1,"ZHOU");
	//����3
	LCD_ShowNumber(1,1,44444,5);//int 2���ֽڣ�16λ���65535
	
}