/*实现功能：
 *1.按键1按下LED灯亮
 *2.按键2按下LED灯左流水
 *3.按键3按下LED灯右流水
 *4.按键4按下LED灯全灭,退出
*/

//备注：功能基本实现，但是功能4，不灵敏，用中断应该更好
#include <REGX52.H>
#include <INTRINS.H>
#include "Delay.h"
#include "getKeyNum.h"

//寄存器定义
sfr LED=0XA0;

void main(void)
{
	while(1)
	{
		unsigned int key=getKeyNum();
		//功能1
		if(key==1){LED=0X00;}
		//功能2
		if(key==2)
		{
			LED=0XFE;
			while(1)
			{
				Delay(500);
				LED=_crol_(LED,1);
				Delay(500);
				if((key=getKeyNum())==4)//4号键按下，退出循环灯全灭
				{
					goto out;
				}
			}
		}
		//功能3
		if(key==3)
		{
			LED=0XFE;
			while(1)
			{
				Delay(500);
				LED=_cror_(LED,1);
				Delay(500);
				if((key=getKeyNum())==4)//4号键按下，退出循环灯全灭
				{
					goto out;
				}
			}
		}		
		out:0XFF;
		//功能4		
		if(key==4){LED=0XFF;}
	}
}
