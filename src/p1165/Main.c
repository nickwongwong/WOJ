#include<stdio.h>
#include<stdlib.h>


int calcDigitSum(long n){
		int sum1=0;
		while(n>0){
			sum1+=n%10;
			n=n/10;
		}
		return sum1;
}


int main()
{
   	long n=0;

    while(scanf("%ld",&n)!=EOF)
    {	
    	if(n==0)
    	break;

		int sum1=calcDigitSum(n);
		int sum2=0;

	    int a=2;
	    int isPrime=1;
	    while(a*a<=n)
	    {
	        while(n%a==0)
	        {
	        	isPrime=0;
	            sum2+=calcDigitSum(a);
	            n=n/a;
	        }
	        a++;
	    }
	    if(isPrime){
    		printf("No\n");
    		continue;
    	}else{
	    if(n!=1) sum2+=calcDigitSum(n);

		if(sum1==sum2)
        printf("Yes\n");
		else
		 printf("No\n");
	    }

    }
    return 0;
}
