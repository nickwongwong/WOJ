#include<stdlib.h>
#include<stdio.h>
 long calc(long n){
 	long count=1;
 	while(n>1){
	 	if(n%2) 
 		n=3*n+1;
 		else
 		n=n/2;
 		count++;
	 }
	return count; 
 }

int main()
{
    long x,y;
 	freopen("test.txt","r",stdin);
	 
	 
	while(scanf("%ld %ld",&x,&y)!=EOF){
		 if(x==0&&y==0)
		 break;
		 long longest=0,tmp=0;
		 int i=0;
		 for(i=x;i<=y;i++){
		 	tmp=calc(i);
 			if(tmp>longest)
 			longest=tmp;
 		}
		 printf("%ld\n",longest);
	}
 
	
	return 0;
}