#define MAXQUEUE 3
#include<stdbool.h>
#include<stdio.h>
#include<errno.h>
#include<string.h>
/*
void error(char s[])
{
  throw runtime_error (s);
}
*/

/*
typedef char Item_type;
typedef bool Boolean_type;

typedef struct queue_tag{
    int count;
    int front;
    int rear;
    Item_type entry[MAXQUEUE];
} Queue_type;

void AddQueue(Item_type,Queue_type *);
void DeleteQueue(Item_type *,Queue_type *);
void Initialize(Queue_type *);
int Size(Queue_type *);
Boolean_type Empty(Queue_type *);
Boolean_type Full(Queue_type *);

void Initialize(Queue_type *queue_ptr)
{
    queue_ptr->count = 0;
    queue_ptr->front = 0;
    queue_ptr->rear = -1;
}

void AddQueue(Item_type item, Queue_type *queue_ptr)
{
    if(queue_ptr->count >=MAXQUEUE)
        printf("Queue is full");
    else{
        queue_ptr->count++;
        queue_ptr->rear = (queue_ptr+1)%MAXQUEUE;
        queue_ptr->entry[queue_ptr->rear] = item;
    }
}
void DeleteQueue(Item_type *item, Queue_type *queue_ptr)
{
    if(queue_ptr->count <=0)
        printf("\nThe queue is empty!");
    else{
        queue_ptr->count--;
        *item = queue_ptr->entry[queue_ptr->front];
        queue_ptr->front = (queue_ptr->front+1)%MAXQUEUE;
    }
}

int Size(Queue_type *queue_ptr)
{
    return queue_ptr->count;
}

Boolean_type Empty(Queue_type *queue_ptr)
{

    return queue_ptr->count <=0;
}

Boolean_type Full(Queue_type *queue_ptr)
{
    return queue_ptr->count >=MAXQUEUE;
}
*/
