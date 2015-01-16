#include<stdlib.h>
#include<stdio.h>
 
int crossProduct(int x1,int y1,int x2,int y2){
	return x1*y2-x2*y1;
}
int main()
{
    int n=0,i=0;
 	freopen("test.txt","r",stdin);
	//freopen("result.txt","w",stdout);
	 int x[101],y[101];
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d %d",&x[i],&y[i]);
		getchar();
	}
	int area=0;
	for(i=0;i<n;i++){
		area+=crossProduct(x[i],y[i],x[(i+1)%n],y[(i+1)%n]);
	}
	printf("%d\n",area/2);
	return 0;
}