#include <REGX52.H> 

//存储要显示的数字
unsigned char arr[]={0X3f,0X06,0X5B,0X4F,0X66,0X6D,0X7D,0X07,0X7F,0X67};
 
 /********************************************************************************
 功能：指定数码管显示指定数字
 参数1：location 数码管位置，范围 1~8
 参数2：number 数码管要显示的数字，范围 0~9
 返回值：无
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