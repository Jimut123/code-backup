#ifndef LINKEDLIST_H_INCLUDED
#define LINKEDLIST_H_INCLUDED

typedef struct linklist{
    int data;
    struct linklist *next;
} linklist;

void traverse_linklist(struct linklist *root);
void insert_linklist(struct linklist *root, int data);
void LinkList();


#endif // LINKEDLIST_H_INCLUDED
