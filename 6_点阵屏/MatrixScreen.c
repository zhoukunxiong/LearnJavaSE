#include <REGX52.H>
#include "Delay.h"

/**********************************************************************
功能：74HC595芯片输出
参数：datas 要输出的数据
返回值：无
**********************************************************************/
sbit R_CLK=P3^5;//输出寄存器高电平数据发送，低电结束
sbit SRCLK=P3^6;//高电平发送
sbit SER=P3^4;//存放向输出寄存器发送的数据

void _74HC595_Input(unsigned char datas)
{
	unsigned char i=0;
	
	R_CLK=0;
	SRCLK=0;
	//每次取出最高位发送
	for(;i<8;i++)
	{
		//取出待发送数据的最高位
		SER=datas&(0X80>>i);
		//发送数据
		SRCLK=1;
		SRCLK=0;
	}
	//向输出寄存器发送数据
	R_CLK=1;
	R_CLK=0;
}

/**********************************************************************
功能：点亮点阵屏指定位置的LED灯
参数：column 选择列，datas 取模数据
返回值：无
**********************************************************************/
unsigned char code arr[]={0X7F,0XBF,0XDF,0XEF,0XF7,0XFB,0XFD,0XFE};

void MatrixScreen_Show(unsigned char column,unsigned char datas)
{
	unsigned char i=0;

			_74HC595_Input(datas);
	P0=arr[column-1];
	Delay(1);
	//位清零，防止残影
	P0=0XFF;
}

