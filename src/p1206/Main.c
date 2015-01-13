#include<stdio.h>
#include<stdlib.h>
long  gcd(long int a,long int b)
{
    long  c;
    
    while(b!=0)
    {
    	c=b;
		b=a%b;
		a=c;
    }
    return a;
}

int main()
{
    long  a,b,n;
    while (scanf("%ld %ld %ld",&a,&b,&n)!=EOF)
    {  
        if (a==0 && b==0 && n==0)  
		{
			printf("Possible!\n");continue;
		}
        if (a==0 && b==0 && n!=0)  
		{
			printf("Impossible!\n");continue;
		}
        long c = gcd(a,b);
        if (n%c == 0)
          printf("Possible!\n");
        else  
          printf("Impossible!\n"); 
        }
    return 0;
    }