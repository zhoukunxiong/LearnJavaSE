/*
 *ʵ�ֹ��ܣ�ָ���������ʾָ������
 *����1������ܾ�̬��ʾ
 *����2������ܶ�̬��ʾ
 *����3���������ʾ���µĶ��������ļ�ֵ
 */
#include <REGX52.H>
#include "NixieTube.h"
#include "Delay.h"
#include "getKeyNum.h"

void main(void)
{
	//����1
//	nixieTube(4,8);
	//����2
//	while(1)
//	{
//		nixieTube(1,1);
//		Delay(1);
//		nixieTube(2,2);
//		Delay(1);
//		nixieTube(3,3);
//		Delay(1);
//		nixieTube(4,4);
//		Delay(1);
//		nixieTube(5,5);
//		Delay(1);
//		nixieTube(6,6);
//		Delay(1);
//		nixieTube(7,7);
//		Delay(1);
//		nixieTube(8,8);
//		Delay(1);
//	}
	//����3
	while(1)
	{
		unsigned char keyNum=getKeyNum();
		unsigned char i=1;
		
		for(;i<=4;i++)
		{
			if(keyNum==i) nixieTube(1,i);
		}
	}
	

}
