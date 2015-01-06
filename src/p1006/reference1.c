/*original copyright by 2010301500183
 * please do not copy this code for submission!
 */
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#define MAXV 200001

struct Node
{
    int vertex;
    struct Node *next;
};
typedef struct Node Graph[MAXV];
Graph G;
int m, n, k;

void addEdge(int a, int b)
{
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));

    new_node->vertex = a;
    new_node->next = G[b].next;
    G[b].next = new_node;
}

int BFS(int a, int b)
{
    struct Node *p;
    int queue[n], front = 0, rear = 0;
    int route[n], visited[n];
    int i, w, flag_find = 0;
    int dist, temp;

    if (a == b)
        return 0;

    for (i = 0; i < n; i++)
        visited[i] = 0;
    rear = (rear + 1) % n;
    queue[rear] = b;
    route[b] = -1;

    while (front != rear && flag_find == 0)
    {
        front = (front + 1) % n;
        w = queue[front];
        p = G[w].next;
        visited[w] = 1;

        while (p != NULL)
        {
            if (p->vertex == a)
            {
                flag_find = 1;
                route[p->vertex] = G[w].vertex;

                dist = 0;
                temp = route[p->vertex];
                while (temp != -1)
                {
                    dist++;
                    temp = route[temp];
                }
                dist--;

                return dist;
            }

            if (visited[p->vertex] == 0)
            {
                visited[p->vertex] = 1;
                rear = (rear + 1) % n;
                queue[rear] = p->vertex;
                route[p->vertex] = G[w].vertex;
            }

            p = p->next;
        }
    }

    if (flag_find == 0)
        return -1;
}

int main()
{
    int i, a, b, ans;

    scanf("%d%d", &n, &m);

    //
    for (i = 0; i < n; i++)
    {
        G[i].vertex = i;
        G[i].next = NULL;
    }

    for (i = 0; i < m; i++)
    {
        scanf("%d%d", &a, &b);
        addEdge(a, b);
        addEdge(b, a);
    }

    scanf("%d", &k);
    for (i = 0; i < k; i++)
    {
        scanf("%d%d", &a, &b);
        ans = BFS(a, b);
        printf("%d\n", ans);
    }

    return 0;
}