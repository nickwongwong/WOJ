#include<stdio.h>
#include<stdlib.h>

int main()
{
	//freopen("test.txt","r",stdin);
    int n,j;
    scanf("%d",&n);
    
   while(n-->0)
    {
        int m,n,count=0;
        scanf("%d%d",&m,&n);
        for(j=m;j<8;j++)
        {
	        switch(j)
	        {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:count+=31;break;
	            case 2:count+=29;break;
	            case 4: 
				case 6: count+=30;
	        }
      	 	
        }
        printf("%d\n",count-n+8);
    }

}

	 
