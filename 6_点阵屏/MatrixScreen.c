#include <REGX52.H>
#include "Delay.h"

/**********************************************************************
���ܣ�74HC595оƬ���
������datas Ҫ���������
����ֵ����
**********************************************************************/
sbit R_CLK=P3^5;//����Ĵ����ߵ�ƽ���ݷ��ͣ��͵����
sbit SRCLK=P3^6;//�ߵ�ƽ����
sbit SER=P3^4;//���������Ĵ������͵�����

void _74HC595_Input(unsigned char datas)
{
	unsigned char i=0;
	
	R_CLK=0;
	SRCLK=0;
	//ÿ��ȡ�����λ����
	for(;i<8;i++)
	{
		//ȡ�����������ݵ����λ
		SER=datas&(0X80>>i);
		//��������
		SRCLK=1;
		SRCLK=0;
	}
	//������Ĵ�����������
	R_CLK=1;
	R_CLK=0;
}

/**********************************************************************
���ܣ�����������ָ��λ�õ�LED��
������column ѡ���У�datas ȡģ����
����ֵ����
**********************************************************************/
unsigned char code arr[]={0X7F,0XBF,0XDF,0XEF,0XF7,0XFB,0XFD,0XFE};

void MatrixScreen_Show(unsigned char column,unsigned char datas)
{
	unsigned char i=0;

			_74HC595_Input(datas);
	P0=arr[column-1];
	Delay(1);
	//λ���㣬��ֹ��Ӱ
	P0=0XFF;
}

