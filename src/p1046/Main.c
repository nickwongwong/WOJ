#include <stdio.h>
#define M 3000
int main() {
    int a[M];
    int times,no,r ;    
    
    scanf("%d" ,&times) ;
    while(times -->0)
    {
        scanf("%d" ,&no) ;
        r = 0 ;
        int i = 0, j=0;
        for(i = 0 ;i < no ;i ++)
            scanf("%d" ,&a[i]) ;
        for(i = 0 ;i < no; i ++)
            for(j = i + 1 ;j < no ;j ++){
            	if(a[i] > a[j])
            	r++;
            }
                
        printf("%d\n" ,r) ;
    }
    return 0;
}