#include<stdio.h>
#include<string.h>

int main()
{
	freopen("test.txt","r",stdin);
	int N;
	scanf("%d",&N);
	getchar();

	char a[8][20]={{"littleken"},{"knuthocean"},{"dongfangxu"},{"zap"},{"kittig"},{"robertcui"},{"forest"},{"flirly"}};

	while(N-->0)
	{
		
		char c[1000002];
		scanf("%s",c);
		getchar();

		int j=0;
		int max[8]={0};	
		int length=strlen(c); 
		while(j<length)
		{
			switch(c[j]){
			case 'l': max[0]++;j+=9;break;
			case 'k': if(c[j+1]=='n'){
					max[1]++;j+=10;
					}else{max[4]++;j+=6;
					}break;
			case 'd':max[2]++;j+=10;break;
			case 'z':max[3]++;j+=3;break;
			case 'r':max[5]++;j+=9;break;
			case 'f':if(c[j+1]=='o'){max[6]++;j+=6;}
				    else{max[7]++;j+=6;}break;
   			
			}


		}
		
		int idx=0,tmp=max[0];
	
		for(j=0;j<8;j++)
			if(max[j]>tmp)
			{
				tmp=max[j];
				idx=j;
			}
		printf("%s\n",a[idx]);
			
	}
	return 0;
}