#include <REGX52.H> 

//�洢Ҫ��ʾ������
unsigned char arr[]={0X3f,0X06,0X5B,0X4F,0X66,0X6D,0X7D,0X07,0X7F,0X67};
 
 /********************************************************************************
 ���ܣ�ָ���������ʾָ������
 ����1��location �����λ�ã���Χ 1~8
 ����2��number �����Ҫ��ʾ�����֣���Χ 0~9
 ����ֵ����
 ********************************************************************************/

 void nixieTube(unsigned char location,unsigned char number)
 {
	 switch(location)
	 {
		 case 1:P2_4=1,P2_3=1,P2_2=1;break;
		 case 2:P2_4=1,P2_3=1,P2_2=0;break;
		 case 3:P2_4=1,P2_3=0,P2_2=1;break;
		 case 4:P2_4=1,P2_3=0,P2_2=0;break;
		 case 5:P2_4=0,P2_3=1,P2_2=1;break;
		 case 6:P2_4=0,P2_3=1,P2_2=0;break;
		 case 7:P2_4=0,P2_3=0,P2_2=1;break;
		 case 8:P2_4=0,P2_3=0,P2_2=0;break;
	 }
	 P0=arr[number];
 }