/*
 *实现功能：
 *功能1：定时器实现LED灯闪烁
 *功能2：
 *功能3：
 */
#include <REGX52.H>

//寄存器定义

sfr IPH=0XB7;
/**********************************************************************
功能：Timer1初始化
参数：无
返回值：无
**********************************************************************/

void Timer1_Init(void)
{
	//TMOD寄存器配置
	TMOD=TMOD&0X0F;
	TMOD=TMOD|0X20;
	//定时器控制寄存器TCON配置
	TF1=0;
	TR1=1;
	//定时器初始值设置，最大2^16
	TL1=0xA4;//定时100微秒
	TH1=0xA4;
	//中断允许控制寄存器配置
	ET1=1;
	EA=1;
	//中断优先级配置
	IPH=IPH|0X08;
	PT1=1;
}
/**********************************************************************
功能：Timer1定时器中断
参数：无
返回值：无
**********************************************************************/

unsigned char i=0;
unsigned char j=0;
void Timer1_Rountine(void) interrupt 3
{
	i++;
	if(i==100){++j;i=0;}
	if(j==100){P2_0=~P2_0;j=0;}
}

void main(void)
{
	Timer1_Init();
	while(1)
	{
		
	}
}