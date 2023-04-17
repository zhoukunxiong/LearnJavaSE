#include <REGX52.H>
#include "Delay.h"

sbit key1=P3^1;
sbit key2=P3^0;
sbit key3=P3^2;
sbit key4=P3^3;

/****************************************************************************************************
���ܣ���ȡ���¶��������ļ���
��������
����ֵ�����°����ļ���
****************************************************************************************************/

unsigned int getKeyNum(void)
{
	unsigned int keyNum=0;
	
	if(key1==0)
	{
		Delay(20);//����
		while(key1==0);//�ȴ������ͷ�
		Delay(20);//����
		keyNum=1;
	}
	if(key2==0){Delay(20);while(key2==0);Delay(20);keyNum=2;}
	if(key3==0){Delay(20);while(key3==0);Delay(20);keyNum=3;}
	if(key4==0){Delay(20);while(key4==0);Delay(20);keyNum=4;}
	
	return keyNum;
}