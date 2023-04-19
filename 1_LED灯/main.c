/*实现功能：
	*1.点亮一个LED灯
	*2.LED灯左流水
	*3.LED灯右流水
*/

#include <REGX52.H>
#include<INTRINS.H>
#include "Delay.h"

//引脚定义
sfr LED=0XA0;

void main(void)
{
	//功能1
	LED=0XFE;
	//功能2	
//	while(1)
//	{
//		Delay(500);
//		LED=_crol_(LED,1);//左移
//		Delay(500);
//	}
//	
	//功能3
	while(1)
	{
		Delay(500);
		LED=_cror_(LED,1);//右移
		Delay(500);
	}
	
}
