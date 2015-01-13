#include<stdio.h>
#include<stdlib.h>

int main()
{
    int no;
    while(scanf("%d",&no)==1)
    {
        int num=0,loop=0,tmp;
        while(no-->0)
        {
            scanf("%d",&tmp);
            if(loop==0)
            {
                loop++;
                num=tmp;
            }
            else
            {
                if(tmp==num) loop++;
                else loop--;
            }
        }
        printf("%d\n",num);
    }
    return 0;
}