#include<stdio.h>
#include<stdlib.h>

int main()
{
    int no=0;
    scanf("%d",&no);
    while(no-->0)
    {	
		int p;
    	scanf("%d%%",&p);
     	float r=p/100.0;
     	r=r*r/(1-2*r+2*r*r);
     	r=r*100.0;
        printf("%.2f%%\n",r);
    }
    return 0;
}
