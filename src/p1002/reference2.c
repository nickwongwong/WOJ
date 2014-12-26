/*original copyright by 2009302530022
 * please do not copy this code for submission!
 */
#include <stdio.h>
#include <ctype.h>
int main()
{
  int i,j,sum=0,top=1;
  char T[100];
  while( scanf("%s",T) != EOF )
  {
    if((T[1] == ':' || T[2] == ':') && T[0] <= '9' )
    {
        if( !top ) printf("%d:%d %d\n",i,j,sum);
        sscanf(T,"%d:%d",&i,&j);
        sum = 0;
        top = 0;
    }
    else
    if( isalpha(T[0]) )
          sum ++ ;

}
printf("%d:%d %d\n",i,j,sum);
return 0;
}
