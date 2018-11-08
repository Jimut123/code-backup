	/*Problem-1: linklist.c : Write a menu driven program to implement the following singly linked  list operations.
	Menu for Linked List operations
                ----------------------------------------

	1.To Add Node(s)
	2.To Display Node(s)
	3.To Search Node(s)
	4.To Modify Node(s)
	5.To Sort Node(s)
	6.To Delete Node(s)
	7.To Insert Node(s)
	8.To Reverse Node(s)
	9.To Exit from Menu

	Choose your option : 1,2,3,4,5,6,7,8,9 ? */

	#include<stdio.h>
	struct linked_list{
	int n;
	struct linked_list *next;
	}*node=NULL;
	void add_node();
	void display_node();
	void search_node();
	void modify_node();
	void sort_node();
	void delete_node();
	void insert_node();
	void reverse_node();
	void main()
	{
	int flag;
	char ch;
	flag=1;
		while(flag==1)
		{
		clrscr();
		gotoxy(25,6); /* The cursor moves to 6-th row and 25-th column */
		printf("Menu for Linked List operations");
		gotoxy(25,7);
		printf("----------------------------------------");
		gotoxy(25,9);
		printf("1. To Add Node(s)");
		gotoxy(25,10);
		printf("2. To Display Node(s)");
		gotoxy(25,11);
		printf("3. To Search Node(s)");
		gotoxy(25,12);
		printf("4. To Modify Node(s)");
		gotoxy(25,13);
		printf("5. To Sort Node(s)");
		gotoxy(25,14);
		printf("6. To Delete Node(s)");
		gotoxy(25,15);
		printf("7. To Insert Node(s)");
		gotoxy(25,16);
		printf("8. To Reverse Node(s)");
		gotoxy(25,17);
		printf("9. To Exit from Menu");
		gotoxy(25,19);
		printf("Choose your option 1,2,3,4,5,6,7,8,9 ? ");
		scanf(" %c",&ch);
			switch(ch)
			{
			case '1' : add_node();
			               	break;
			case '2' :  clrscr();
				display_node();
				break;
			case '3' : 	search_node();
				break;
			/*case '4' : 	modify_node();
				break;
			case '5' : 	sort_node();
				break;
			case '6' : 	delete_node();
				break;
			case '7' : 	insert_node();
				break;
			case '8' : 	reverse_node();
				break; */
			case '9' : 	flag=0;
				clrscr();
				gotoxy(25,13);
				printf("Press any character to exit from Menu--->");
				getch();
				break;
			}
		}
	}

	/* void add_node() : function to add node(s) to a linked list */
	void add_node()
	{
	struct linked_list *list;
	int num,count;
	char ch;
	clrscr();
		if(node==NULL)
		{
		printf("\n***Linked List is now Empty.***\n");
		node=(struct linked_list *)malloc(sizeof(struct linked_list));
		node->next=NULL;
		list=node;
		}
		else
		{
		display_node();
		list=node;
			while(list->next != NULL)
			list=list->next;
		list->next=(struct linked_list *)malloc(sizeof(struct linked_list));
		list=list->next;
		list->next=NULL;
		}
		count=0;
		do
		{
		printf("\nEnter node to be added=");
		scanf("%d",&num);
		list->n=num;
		count++;
		display_node();
		printf("\nDo you want to add any more node(Y/N?) :");
		scanf(" %c",&ch);
			if(ch=='y' || ch=='Y')
			{
			list->next=(struct linked_list *)malloc(sizeof(struct linked_list));
			list=list->next;
			list->next=NULL;
			}
		}while(ch=='y' || ch=='Y');
	printf("\nNumber of nodes added=%d\n",count);
	printf("\nPress any key to go to main menu--->");
	getch();
	}

	/* void display_node() : Function to display node(s) in a linked list. */
	void display_node()
	{
	int count;
	struct linked_list *list;
		if(node==NULL)
		{
		printf("\nLinked List is now Empty. Press any key to go to main menu--->");
		getch();
		return;
		}
	count=0;
	printf("\nMembers in your Linked List\n");
	printf("Sl.No.\tNode\tAddress\n");
	list=node;
		while(list !=NULL)
		{
		count++;
		printf("%d\t%d\t%x\n",count,list->n,list);
		list=list->next;
		}
	printf("\nPress any key to continue--->");
	getch();
	}

	/* void search_node() : Function to search node(s) in a linked list.  */
	void search_node()
	{
	int num;
	int count;
	char ch;
	struct linked_list *list;
	clrscr();
		if(node==NULL)
		{
		printf("\nLinked List is now Empty. Press any key to continue--->");
		getch();
		return;
		}
		do
		{
		display_node();
		count=0;
		printf("\nEnter Element to be searched in the linked list=");
		scanf("%d",&num);
		list=node;
			while(list !=NULL)
			{
				if(num==list->n)
				{
				count++;
				printf("%d found at address=%x\n",num,list);
				}
			list=list->next;
			}
			if(count !=0)
			printf("\nnumber of times %d found=%d\n",num,count);
			else
			printf("\n%d not found in the linked list. Try a different number\n",num);
		printf("\nDo you want to search any more number(Y/N?) :");
		ch=getch();
		}while(ch=='y' || ch=='Y');
	}
			
		

	












