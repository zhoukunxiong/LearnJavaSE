/*
 *实现功能：
 *功能1：LCD1602液晶上显示按键键值
 */
#include <REGX52.H>
#include "MatrixKeyboard.h"
#include "LCD.h" 

void main(void)
{
	LCD_Init();
	while(1)
	{
		unsigned char keyNum=getMatrixKeyboardNum();
		
		if(keyNum<10&&keyNum>0)
		{
			LCD_ShowNumber(1,1,0,1);
			LCD_ShowNumber(1,2,keyNum,1);
		}
		else if(keyNum>=10)
		{
			LCD_ShowNumber(1,1,keyNum,2);
		}
	}
}
