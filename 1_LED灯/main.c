/*ʵ�ֹ��ܣ�
	*1.����һ��LED��
	*2.LED������ˮ
	*3.LED������ˮ
*/

#include <REGX52.H>
#include<INTRINS.H>
#include "Delay.h"

//���Ŷ���
sfr LED=0XA0;

void main(void)
{
	//����1
	LED=0XFE;
	//����2	
//	while(1)
//	{
//		Delay(500);
//		LED=_crol_(LED,1);//����
//		Delay(500);
//	}
//	
	//����3
	while(1)
	{
		Delay(500);
		LED=_cror_(LED,1);//����
		Delay(500);
	}
	
}
