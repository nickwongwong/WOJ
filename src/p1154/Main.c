#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
   
    
    int no=0;
    while(1)
    {	
		char c[50];
    	scanf("%s",c);
    	if(c[0]=='#')
    	break;
    	no++;
 		int len=strlen(c); 
	 	int i;
 		for(i=1;i<len;i=i+2){
		 	if(c[i]>=97)
		 	c[i]=(char)(c[i]-32);
		 }
        printf("Case %d: %s\n",no,c);
        getchar();
       
    }
    return 0;
}