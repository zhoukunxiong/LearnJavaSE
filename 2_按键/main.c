/*ʵ�ֹ��ܣ�
 *1.����1����LED����
 *2.����2����LED������ˮ
 *3.����3����LED������ˮ
 *4.����4����LED��ȫ��,�˳�
*/

//��ע�����ܻ���ʵ�֣����ǹ���4�������������ж�Ӧ�ø���
#include <REGX52.H>
#include <INTRINS.H>
#include "Delay.h"
#include "getKeyNum.h"

//�Ĵ�������
sfr LED=0XA0;

void main(void)
{
	while(1)
	{
		unsigned int key=getKeyNum();
		//����1
		if(key==1){LED=0X00;}
		//����2
		if(key==2)
		{
			LED=0XFE;
			while(1)
			{
				Delay(500);
				LED=_crol_(LED,1);
				Delay(500);
				if((key=getKeyNum())==4)//4�ż����£��˳�ѭ����ȫ��
				{
					goto out;
				}
			}
		}
		//����3
		if(key==3)
		{
			LED=0XFE;
			while(1)
			{
				Delay(500);
				LED=_cror_(LED,1);
				Delay(500);
				if((key=getKeyNum())==4)//4�ż����£��˳�ѭ����ȫ��
				{
					goto out;
				}
			}
		}		
		out:0XFF;
		//����4		
		if(key==4){LED=0XFF;}
	}
}
