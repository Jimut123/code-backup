  #include<stdio.h>
  main()
  {
  	int i=0,j,n,a[10];
  	scanf("%d",&n);
  	printf("Reverse order: \n");
  	while(n>0)
  	{
  		a[i]=n%2;
  		n=n/2;
  		printf(" %d ",a[i]);
  		i++;
	  }
	  printf("\nCorrect order: \n");
	  for(i--;i>=0;i--)
	  	printf(" %d ",a[i]);
  }
