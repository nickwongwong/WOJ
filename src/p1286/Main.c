#include<stdlib.h>
#include<stdio.h>
#include<math.h> 

int main()
{
    double x1,y1,z1,x2,y2,z2,x3,y3,z3;
 	freopen("test.txt","r",stdin);
	 
	 
	while(scanf("%lf %lf %lf %lf %lf %lf %lf %lf %lf",&x1,&y1,&z1,&x2,&y2,&z2,&x3,&y3,&z3)!=EOF){
		 double a,b,c;
		a=sqrt(pow(x1-x2,2)+pow(y1-y2,2)+pow(z1-z2,2));
		b=sqrt(pow(x1-x3,2)+pow(y1-y3,2)+pow(z1-z3,2));
		c=sqrt(pow(x2-x3,2)+pow(y2-y3,2)+pow(z2-z3,2));
		double l=(a+b+c)/2;
		double area=sqrt(l*(l-a)*(l-b)*(l-c));
		
		 double inCircle=area/l,outCircle=a*b*c/(4*area);
		 double ratio=inCircle/outCircle;
		 printf("%.3lf\n",ratio*ratio);
	}
 
	
	return 0;
}