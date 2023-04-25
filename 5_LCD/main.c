/*
 *实现功能：
 *功能1：LCD液晶显示字符
 *功能2：LCD液晶显示字符串
 *功能3：LCD液晶显示数字
 */
#include <REGX52.H>
#include "LCD.h"

void main(void)
{
	//LCD初始化
	LCD_Init();
	//功能1
//	LCD_ShowChar(2,5,'Z');
//	LCD_ShowChar(2,6,'K');
//	LCD_ShowChar(2,7,'X');
	//功能2
//	LCD_ShowString(2,1,"ZHOU");
	//功能3
	LCD_ShowNumber(1,1,44444,5);//int 2个字节，16位最大65535
	
}