#include <REGX52.H>
#include "Delay.h"

void main(void)
{
	while(1)
	{
		P1_5=~P1_5;
		Delay(1);
		
	}
	
}