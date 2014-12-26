/* Copyright(C) 2014,Cao Qingqing , Wuhan University
 * All rights reserved.
 *
 * This class is submitted for solving the problem 1007
 * in WOJ
 *
 * Author: Qingqing Cao, Computer School, Wuhan University
 * Time: 2012-06-03
 * Email: im@caoqq.net
 */
#include<stdio.h>
#define M 10001
#define N 8
int main()
{
    int n;
    while (scanf("%d", &n)==1)
    {
        int a[N][M],i,j,tem=0, s=0;
        for(i=0;i<N;i++)
        {
            for(j=0;j<n;j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
        for(j=0;j<n;j++)
        {
              for(i=0;i<N-1;i++)
            {
                if(a[i][j]<a[i+1][j])
                {
                    tem=a[i][j];
                    a[i][j]=a[i+1][j];
                    a[i+1][j]=tem;
                }
            }
            s+=a[N-1][j];
        }
        printf("%d\n",s);
    }
    return 0;
}
