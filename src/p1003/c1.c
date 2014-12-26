#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
char ren[13][20] = {"Adam", "Seth", "Enosh", "Kenan", "Mahalalel",
                "Jared", "Enoch", "Methuselah", "Lamech", "Noah",
                "Shem","Ham","Japheth"};
 
int ren_age[9] = {930, 912, 905, 910, 895,
                  962, 365, 969, 777};
 
int ancestor(char *s)
{
    if(strcmp(s, ren[0]) == 0) return 0;
    else if(strcmp(s, ren[1]) == 0) return 1;
    else if(strcmp(s, ren[2]) == 0) return 2;
    else if(strcmp(s, ren[3]) == 0) return 3;
    else if(strcmp(s, ren[4]) == 0) return 4;
    else if(strcmp(s, ren[5]) == 0) return 5;
    else if(strcmp(s, ren[6]) == 0) return 6;
    else if(strcmp(s, ren[7]) == 0) return 7;
    else if(strcmp(s, ren[8]) == 0) return 8;
    else if(strcmp(s, ren[9]) == 0) return 9;
    else if(strcmp(s,ren[10])==0 || strcmp(s,ren[11])==0 ||strcmp(s,ren[12])==0)
            return 10;
    else return 11;
}
 
 
int main(){
    char name1[20], name2[20];
    while(scanf("%s %s",name1, name2) == 2)
    {
          int a = ancestor(name1);
          int b = ancestor(name2);
          if(a==11 || b==11) printf("No enough information\n");
          else
          {
              if(a<b) printf("Yes\n");
              else printf("No\n");
          }
          if(a > 8 || b > 8) printf("No enough information\n");
          else
          {
              if(ren_age[a] > ren_age[b]) printf("Yes\n");
              else printf("No\n");
          }
    }
    return 0;
}