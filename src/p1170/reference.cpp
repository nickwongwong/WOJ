#include<iostream>
#include<algorithm>
#include<list>

#include<stdio.h>

using namespace std;

int main()
{
    list<long> number;
    while(1)
    {
        unsigned int a;
        scanf("%d",&a);
        if(a==0) break;
        number.push_back(a);
    }
    number.sort();
    list<long>::iterator end=unique(number.begin(),number.end());
   
    list<long>::iterator pointer=number.begin();
    for(;pointer!=end;pointer++) {
    	printf("%lld",*pointer);
    	printf(" ");
    }


    return 0;
}
