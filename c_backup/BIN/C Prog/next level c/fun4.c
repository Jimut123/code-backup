  #include<stdio.h>
  main()
  {
  	int i=0,j,n,a[10];
  	scanf("%d",&n);
  	printf("Reverse order: \n");
  	while(n>0)
  	{
  		a[i]=n%16;
  		n=n/16;
  		if(a[i]<10)
		  printf(" %d ",a[i]);
		else
			printf(" %c ",a[i]+55);
  		i++;
	  }
	  printf("\nCorrect order: \n");
	  for(i--;i>=0;i--)
	  	if(a[i]<10)
		  printf(" %d ",a[i]);
		else
			printf(" %c ",a[i]+55);
  }
