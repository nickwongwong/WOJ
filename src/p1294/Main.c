#include<stdlib.h>
#include<stdio.h>
#define MAX 15*2+1
int main()
{
    int n=0;

    long M[MAX],T[MAX];
//	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);
	scanf("%d",&n);
 	int i=0;
 	M[1]=0;M[2]=1;
 	T[1]=1;T[2]=3;
 	for(i=3;i<MAX;i++){
	 	M[i]=M[i-1]+2*M[i-2];
	 	T[i]=3*M[i]+2*M[i-1];
	 }

	while(n-->0)
	{
		
		
		scanf("%d",&i);
	
		printf("%ld\n",T[i*2]);
     
	}
	return 0;
}