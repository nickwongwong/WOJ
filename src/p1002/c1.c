#include<stdio.h>
int main()
{
    char ch,par[5];
    int num=0,i=0,flag=0;
    while((ch=getchar())!=EOF){
        if(ch>='0'&&ch<='9'){
            if(flag==1){
                printf("%s %d\n",par,num);
                i=0;
                num=0;
            }
            flag=1;
            do{
                par[i]=ch;
                i++;
            }while((ch=getchar())!=' ');
            par[i]='\0';
        }
        else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            num++;
            while(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch=='-')
            ch=getchar();
        }
    }
    printf("%s %d\n",par,num);
    return 0;
}