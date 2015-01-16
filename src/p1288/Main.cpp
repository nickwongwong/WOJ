#include<iostream>
#include<cstdio>

#include<vector>
#include<string>
#include<algorithm>

using namespace std;

int main()
{
	 	freopen("test.txt","r",stdin);
	int cases;
	scanf("%d",&cases);
	while(cases-->0)
	{
		string a,b;
		int k;
		cin>>a>>b>>k;
		vector<int> diff(a.length());
		int j;
		for(j=0;j<a.length();j++)
		{
			diff[j]=(a[j]-b[j]>=0)?(a[j]-b[j]):(b[j]-a[j]);
		}
		sort(diff.begin(),diff.end());
		for(j=a.length()-k;j<a.length();j++)
		{
			if(diff[j]==0) 
				diff[j]=1;
			else 
				diff[j]=0;
		}
		int sum=0;
		for(j=0;j<diff.size();j++) sum+=diff[j];

		printf("%d\n",sum);
	}
	return 0;
}