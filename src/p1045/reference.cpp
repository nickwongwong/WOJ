#include<stdio.h>
#include<string.h>

int main()
{
freopen("test.txt","r",stdin);
    int t;
    scanf("%d",&t);
    getchar();
    int i,j,len;
    char sent[10001];
    for(i=0;i<t;i++)
    {
        gets(sent);
        len=strlen(sent);
        if(sent[0]<='z'&&sent[0]>='a')
        sent[0]=sent[0]-32;
        for(j=1;j<len;j++)
        {
            if(sent[j-1]!=' '&&sent[j]>='A'&&sent[j]<='Z')
            sent[j]=sent[j]+32;
        }
        for(j=0;j<len;j++)
        printf("%c",sent[j]);
        printf("\n");
        memset(sent,0,10001);
    } 
    return 0; 
}
