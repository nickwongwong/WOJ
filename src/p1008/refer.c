#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <iostream>

#include <queue>
#include <algorithm>
using namespace std;

#define N 202

int n, m, k, animal[N], cost[N][N], size[N][N], s, t, f, p[N];

void process()
{
    int ani = m + 1, temp;
    for (int i = 1; i <= m; ++i){
    	for (int j = 0; j < n; ++j)
        {
            scanf("%d", &temp);
            if(temp) size[i][ani + j] = 1;
            size[ani + j][t] = 1;
        }
    }


    scanf("%d", &k);
    for (int i = 1; i <= m; ++i){
    	 size[0][i] = k;
    }

}

void maxFlow()
{
    queue<int> q;
    memset(cost, 0, sizeof(cost));
    f = 0;
    while(1)
    {
        memset(animal, 0, sizeof(animal));
        animal[s] = 0x7fffffff;
        q.push(s);
        while(!q.empty())
        {
            int u = q.front(); q.pop();
            for (int v = 1; v <= t; ++v) {
				if(!animal[v] && size[u][v] > cost[u][v])
	            {
	                p[v] = u; q.push(v);
	                animal[v] = min(animal[u] , size[u][v] - cost[u][v]);
	            }
            }
        }

        if(animal[t] == 0) break;
        for(int u = t; u != s; u = p[u])
        {
            cost[p[u]][u] += animal[t];
            cost[u][p[u]] -= animal[t];
        }
        f += animal[t];
    }
}

int main()
{
    while(scanf("%d%d", &m, &n) == 2)
    {
       memset(size, 0, sizeof(size));
        s = 0; t = m + n + 1; f = 0;
        process();
        maxFlow();
        if(f == n)
		{
			printf("Yes\n");
		}else
 		{
			printf("No\n");
 		}

    }
    return 0;
}
