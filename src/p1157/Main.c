#include<stdio.h>
#include<stdlib.h>

int main()
{   
    int no=0;
   	int cases=0;
    while(scanf("%d",&no)!=EOF)
    {	
    	if(no==-1)
    	break;
    	cases++;
		int i=0;
		int p=0;
		int sum=0,r=0;
		for(i=0;i<no;i++){
			scanf("%d",&p);
			if(p==1)
			sum++;
			if(p==-1)
			r=r+sum;
		}

        printf("Case %d: %d\n",cases,r);      
    }
    return 0;
}