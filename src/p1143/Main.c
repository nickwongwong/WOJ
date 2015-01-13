#include<stdio.h>
#include<stdlib.h>

int main()
{
	int m,p,n;
  	while(scanf("%d%d%d",&m,&p,&n)){
  		if(m==0)
  		break;
		if(m>=p*n)
		printf("%d\n",m);
		else
		printf("%d\n",p*n);
  	}
    return 0;
}
