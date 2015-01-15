#include<stdlib.h>
#include<stdio.h>

int main()
{
    int n=0,m=0;

//	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);
	while(scanf("%d %d",&m,&n)!=EOF){
		if(m==0&&n==0)
		break;
		int i=0,j=0;
		int a=m-n+n*(n+1)/2,p=0;
		for(i=1;i<=n;i++){
			p=a;
			for(j=1;j<=i;j++){
				if(p<10)
				printf(" %d ",p);
				else
				printf("%d ",p);
				p=p+1+n-i+j;
			}
			printf("\n");
			a=a-(n-i);
		}
		printf("\n");
	}

	return 0;
}