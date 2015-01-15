#include<iostream>
#include<cstdio>
#include<vector>

using namespace std;

int main()
{
    vector<int> a(500002);
    vector<int> existing(5000000);
    a[0]=0;
    int i;
    for(i=1;i<500002;i++)
    {
        a[i]=a[i-1]-i;
        if(!(a[i]>0 && existing.at(a[i])==false)) a[i]=a[i-1]+i;
        existing.at(a[i])=true;
    }
    int n;
	while(scanf("%d",&n)!=EOF){
		if(n==-1)
		break;
		
		printf("%d\n",a[n]);

	}
    return 0;
}