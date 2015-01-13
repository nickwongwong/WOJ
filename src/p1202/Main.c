#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i=0;
	int no;
    scanf("%d",&no);
    int a[2*no+1];
    for (i=0;i<2*no+1;i++)
    	scanf("%d",&a[i]);
    int r = a[0];
    for (i=1;i<2*no+1;i++)
    	r ^= a[i];
    printf("%d\n",r);
    return 0;
}
