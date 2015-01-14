#include<stdlib.h>
#include<stdio.h>
#include<math.h>


int getScore(double x, double y)
{
	double dist=sqrt(x*x+y*y);
	
	if(dist<=3.0){
		return 100;
	}else if(dist<=6.0){
		return 80;
	}else if(dist<=9.0){
		return 60;
	}else if(dist<=12.0){
		return 40;
	}else if(dist<=15.0){
		return 20;
	}else return 0;
	

}


int main()
{
    double x1,x2,x3,x4,x5,x6,y1,y2,y3,y4,y5,y6;
	freopen("test.txt","r",stdin);
	while(scanf("%lf %lf %lf %lf %lf %lf %lf %lf %lf %lf %lf %lf",&x1,&x2,&x3,&x4,&x5,&x6,&y1,&y2,&y3,&y4,&y5,&y6)!=EOF)
	{
		if(x1+100<1e-9)
		break;
     	int sum1=getScore(x1,x2)+getScore(x3,x4)+getScore(x5,x6);
     	int sum2=getScore(y1,y2)+getScore(y3,y4)+getScore(y5,y6);
     	if(sum1==sum2)
	    printf("SCORE: %d to %d, TIE.\n",sum1,sum2);
	    else if(sum1>sum2)
	    printf("SCORE: %d to %d, PLAYER 1 WINS.\n",sum1,sum2);
	    else printf("SCORE: %d to %d, PLAYER 2 WINS.\n",sum1,sum2);
	}
}