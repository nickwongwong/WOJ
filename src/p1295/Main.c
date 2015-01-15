#include<stdlib.h>
#include<stdio.h>
#include<string.h>
int bracketMatch(char a,char b){
	switch (a){
		case '(': if(b==')') return 1;
		          else return 0;
		case '[': if(b==']') return 1;
		          else return 0;
		case '{': if(b=='}') return 1;
		          else return 0;
	}
}
int main()
{
    int n=0,i=0;
 	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);
	char a[1002],b[1002];
	scanf("%d",&n);
	while(n-->0){
		scanf("%s",&a);
		
		int len=strlen(a);
		int j=0,count=0;
		for(j=0;j<len;j++)
		{
			if(a[j]=='{'||a[j]=='}'||a[j]=='('||a[j]==')'||a[j]=='['||a[j]==']')
			{
				if(!suit(b[loop],a[j]))
				{
					loop++;
					b[loop]=a[j];
				}
				else loop--;
			}
		}
		if(loop==0) printf("Case %d: Legal\n",i+1);
		else printf("Case %d: Illegal\n",i+1);
		for(i=0;i<len;i++){
			if(!proteinMatch(str1[i],str2[i]))
			sum++;
		}
		printf("%d\n",sum);
	}

	return 0;
}
