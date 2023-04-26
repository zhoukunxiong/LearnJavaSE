/*
 *实现功能：
 *功能1：点阵屏静态显示
 *功能2：点阵屏动态显示
 */
#include <REGX52.H>
#include "MatrixScreen.h"
#include "Delay.h"

unsigned char code arr1[]={0x3C,0x42,0x89,0x85,0x85,0x89,0x42,0x3C};
unsigned char code arr2[]=
	{0x00,0x00,0x00,0x00,
	0x00,0xFF,0x80,0xAB,0xFA,0xAB,0x80,0xFF,0x00,0x00,0x00,0x14,0x3C,0x14,0x3E,0x2A,
	0xFF,0x2A,0x3E,0x00,0x00,0x00,0x00,0x22,0x14,0x08,0x14,0x22,0x00,0x00,0x00,0x00
	};

void main(void)
{
	unsigned char i=0,j=0,count=0;
	//功能1
	while(1)
//	{
//		MatrixScreen_Show(1,arr1[0]);
//		MatrixScreen_Show(2,arr1[1]);
//		MatrixScreen_Show(3,arr1[2]);
//		MatrixScreen_Show(4,arr1[3]);
//		MatrixScreen_Show(5,arr1[4]);
//		MatrixScreen_Show(6,arr1[5]);
//		MatrixScreen_Show(7,arr1[6]);
//		MatrixScreen_Show(8,arr1[7]);
//	}
	//功能2
	while(1)
	{
			for(i=0;i<8;i++)
			{
				MatrixScreen_Show(i+1,arr2[i+j]);
			}
			count++;
			if(count==10)
			{
				j++;
				count=0;
				if(j==29)
					j=0;
			}
	}
}