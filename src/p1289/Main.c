#include<stdlib.h>
#include<stdio.h>
#include<string.h>
int proteinMatch(char a,char b){
	switch (a){
		case 'A': if(b=='T') return 1;
		          else return 0;
		case 'T': if(b=='A') return 1;
		          else return 0;
		case 'C': if(b=='G') return 1;
		          else return 0;
		case 'G': if(b=='C') return 1;
		          else return 0;
				  				  				  		
	}
}
int main()
{
    int n=0,m=0;
	char str1[50],str2[50];
	
 	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);
	while(1){
		scanf("%s",&str1);
		
		if(str1[0]=='#')
		break;
		scanf("%s",&str2);
		int len=strlen(str1);
		int i=0,sum=0;
		
		for(i=0;i<len;i++){
			if(!proteinMatch(str1[i],str2[i]))
			sum++;
		}
		printf("%d\n",sum);
	}

	return 0;
}