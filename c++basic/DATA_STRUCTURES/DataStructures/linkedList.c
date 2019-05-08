#define MAXQUEUE 3
#include<stdbool.h>
#include<stdio.h>
#include<errno.h>
#include<string.h>

// SINGLE WAY LINKED LIST IMPLEMENTATION

typedef struct linklist{
    int data;
    struct linklist *next;
} linklist;

void traverse_linklist(struct linklist *root);



void traverse_linklist(struct linklist *root)
{
    while(root->next!=NULL)
    {
        printf("value = %d",root->data);
        root = root->next;
    }
}

void insert_linklist(struct linklist *root, int data)
{
    if(root->next == NULL)
        root->data = data;
    else{
        while(root->next!=NULL);
        if(root->next == NULL)
        {
            root->data = data;
            root->next = NULL;
        }
    }
}

void LinkList()
{
    int data;
    linklist *myList,*root;
    printf("Enter the data in the linked list: ");
    scanf("%d",&data);
    myList->data = data;
    myList->next = NULL;
    root = &myList;
    printf("Root : %d ",root->data);
    while(true)
    {
        printf("Enter the data in the linked list: ");
        scanf("%d",&data);
        insert_linklist(myList,data);
        traverse_linklist(root);
    }

}

