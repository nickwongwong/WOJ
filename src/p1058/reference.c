/*original copyright by 2011301500001
 * please do not copy this code for submission!
 */
#include <stdio.h>

int main()
{
    long a,tmp,n,sum;
    while (scanf("%ld",&n)==1 & n!=0)
    {
        sum=0;
        for(a=n/3;a>=0;a--)
        {
            tmp=(n- a * 3)/ 2 + 1;
            sum = sum + tmp;
        }
        printf("%ld\n",sum);
    }
    return 0;
}
