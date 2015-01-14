#include<stdlib.h>
#include<stdio.h>
#define maxVal 101
int a[maxVal][maxVal];
void countApple()
{
	int i,j;
    for(i=1;i<=maxVal;i++)  
        a[0][i]=1,a[i][1]=1;  
    for(i=1;i<maxVal;i++)  
        for(j=2;j<=maxVal;j++)  
            if(j<=i)  
                a[i][j]=a[i][j-1]+a[i-j][j];  
            else  
                a[i][j]=a[i][i]; 
	

}


int main()
{
    int m,n;
	countApple();
	while(scanf("%d %d",&m,&n)!=EOF)
	{
     	
	    printf("%d\n",a[m][n]);
	}
}