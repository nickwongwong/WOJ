#include<stdlib.h>
#include<stdio.h>
#include<string.h>
int bracketMatch(char a,char b){
	int flag=0;
	switch (a){
		case '(': if(b==')') flag= 1;break;

		case '[': if(b==']') flag= 1;break;
		case '{': if(b=='}')flag= 1;break;
	}
	return flag;
}
int main()
{
    int n=0,i=0;
 	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);

	scanf("%d",&n);
	while(n-->0){
		i++;
		char a[1010],b[1010];
		scanf("%s",a);

		int len=strlen(a);
		int j=0,count=0;
		b[0]='$';
		for(j=0;j<len;j++)
		{
			if(a[j]=='{'||a[j]=='}'||a[j]=='('||a[j]==')'||a[j]=='['||a[j]==']')
			{
				if(!bracketMatch(b[count],a[j])){

					b[++count]=a[j];
				}

				else {
				count--;

				}
			}
		}
		if(count==0) printf("Case %d: Legal\n",i);
		else printf("Case %d: Illegal\n",i);

	}

	return 0;
}
