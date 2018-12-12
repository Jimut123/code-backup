	/*linklst2.c : Write a menu driven program ti implement simple linked list
	operations :

	Menu
                -------

	1. To add node(s)
	2. To display node(s)
	3. To search node(s)
	4. To modify node(s)
	5. To sort node(s)
	6. To delete node(s)
	7. To insert node(s)
	8. To reverse node(s)
	9. Exit from Menu

	Enter your Choice =1,2,3,4,5,6,7,8,9 :
	*/
	#include<stdio.h>
	struct linked_list
	{
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
		gotoxy(25,6);
		printf("Menu");
		gotoxy(25,7);
		printf("====");
		gotoxy(25,9);
		printf("1. To Add Node(s)");
		gotoxy(25,10);
		printf("2. To  Display Node(s)");
		gotoxy(25,11);
		printf("3. To  Search Node(s)");
		gotoxy(25,12);
		printf("4. To  Modify Node(s)");
		gotoxy(25,13);
		printf("5. To  Sort Node(s)");
		gotoxy(25,14);
		printf("6. To  Delete Node(s)");
		gotoxy(25,15);
		printf("7. To  Insert Node(s)");
		gotoxy(25,16);
		printf("8. To  Reverse Node(s)");
		gotoxy(25,17);
		printf("9. To  Exit");
		gotoxy(25,19);
		printf("Enter your choice=1,2,3,4,5,6,7,8,9 :");
		scanf(" %c",&ch);
			switch(ch)
			{
			case '1' : 	add_node();
			               	break;
			case '2' :   clrscr();
				display_node();
			               	break;
			case '3' : 	search_node();
			               	break;
			case '4' : 	modify_node();
			               	break;
			/*case '5' : 	sort_node();
			               	break;
			case '6' : 	delete_node();
			               	break;
			case '7' : 	insert_node();
			               	break;
			case '8' : 	reverse_node();
			               	break; */
			case '9' : 	clrscr();
				gotoxy(25,13);
				printf("Press any key to exit from menu--->");
				getch();
				flag=0;
			               	break;
			default :   break;
			}
		}
	}

	/* void add_node() : Function to add node(s) to a linked list */
	void add_node()
	{
	struct linked_list *list;
	int num;
	int count;
	char ch;
	clrscr();
	if(node==NULL)
	{
	printf("\nLinked List is now Empty...\n");
	node=(struct linked_list *)malloc(sizeof(struct linked_list));
	node->next=NULL;
	list=node;
	}
	else
	{
	display_node();
	list=node;
		while(list->next !=NULL)
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
	clrscr();
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
	printf("Number of nodes added =%d\n",count);
	printf("\nPress any key to go main menu--->");
	getch();
	}

	/* void display_node() : Function to display node(s) in a linked list */
	void display_node()
	{
	struct linked_list *list;
	int n;
		if(node==NULL)
		{
		printf("\n***List List is now Empty. Press any key to go to main menu***\n");
		getch();
		return;
		}
	printf("\nMembers in your linked list--->\n");
	printf("S.No\tNode\tAddress\n");
	n=0;
	list=node;
		while(list !=NULL)
		{
		n++;
		printf("%d\t%d\t%x\n",n,list->n,list);
		list=list->next;
		}
	printf("\nTotal number of nodes=%d\n",n);
	printf("\nPress any key to continue--->");
	getch();
	}
	
	/* void search_node() : Function to search node(s) in a linked list */
	void search_node()
	{
	struct linked_list *list;
	int num,count;
	char ch;
	clrscr();
		if(node==NULL)
		{
		printf("\n***List List is empty. Press any key to contune***\n");
		getch();
		return;
		}
	display_node();
		do
		{
		printf("\nEnter elemnt to be searched in the linked list=");
		scanf("%d",&num);
		count=0;
		list=node;
			while(list != NULL)
			{
				if(num==list->n)
				{
				count++;
				printf("\n%d found  at position=%x\n",num,list);
				}
			list=list->next;
			}
			if(count !=0)
			printf("\nNumber of times %d found in linked list=%d\n",num,count);
			else
			printf("\n%d not found in your linked list\n",num);
		printf("\nDo you want to search any more element(Y/N?) :");
		scanf(" %c",&ch);
		}while(ch=='y' || ch=='Y');
	}

	/* void modify_node() : Function to modify node(s) in a linked list */
	void modify_node()
	{
	struct linked_list *list;
	int num1,num2,count1,count2;
	char ch;
	clrscr();
		if(node==NULL)
		{
		printf("\n***List List is empty. Press any key to contune***\n");
		getch();
		return;
		}
	display_node();
		do
		{
		printf("\nEnter element to be modified in the linked list=");
		scanf("%d",&num1);
		printf("Enter element your new element=");
		scanf("%d",&num2);
		count1=count2=0;
		list=node;
			while(list != NULL)
			{
				if(num1==list->n)
				{
				count1++;
		printf("\n%d found  at position=%x. Do you want to modify it(Y/N?)\n",num1,list);
				scanf(" %c",&ch);
					if(ch=='y' || ch=='Y')
					{
					list->n=num2;
					count2++;
					display_node();
					}
				}
			list=list->next;
			}
			if(count1 !=0  && count2 !=0)
	printf("\n %d found %d  times and modified modified %d times\n",num1,count1,count2);
			else if(count1 !=0 && count2==0)
	printf("\n%d found %d times but not modified\n",num1,count1);
			else if(count1==0)
			printf("\n%d not found.\n",num1);
			printf("\n%d not found in your linked list\n",num1);
		printf("\nDo you want to modify any more element(Y/N?) :");
		scanf(" %c",&ch);
		}while(ch=='y' || ch=='Y');
	}












	






			

