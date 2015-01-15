#include<stdlib.h>
#include<stdio.h>

int main()
{
    int n=0;


 	freopen("test.txt","r",stdin);
	 scanf("%d",&n);
	//freopen("result.txt","w",stdout);
	while(n-->0){
		int no=0;
		scanf("%d",&no);
 		no=no%7;
 		if(no<=1)
		printf("Dzs\n");
		else
		printf("Sproblvem\n");
	}

	return 0;
}
