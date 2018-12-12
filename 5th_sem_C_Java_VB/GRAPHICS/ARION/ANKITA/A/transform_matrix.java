import java.io.*;
class transform
{
	int a[][]=new int[100][100];
	int n;
			transform(int arr[][],int m)
			{
				int i,j;
				n=m;
				for(i=0;i<n;i++)
					for(j=0;j<n;j++)
					{
						a[i][j]=arr[i][j];
					}
			} 
			void store(int x[][])
			{
				for(int i=0;i<n;i++)
                                        for(int j=0;j<n;j++)
                                 		x[i][j]=a[i][j];
                        }

			void upshift()
			{
				int t[]=new int[n];
				int i=1,j;
				for(j=0;j<n;j++)
					t[j]=a[0][j];
				while(i<n)
				{
					for(j=0;j<n;j++)
						a[i-1][j]=a[i][j];
					i++;
				}
				for(j=0;j<n;j++)
					a[n-1][j]=t[j];
			}
			 void downshift()
                        {
                                int t[]=new int[n];
				int i=n-2,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[n-1][j];
                                while(i>=0)
                                {
                                        for(j=0;j<n;j++)
                                                a[i+1][j]=a[i][j];
                                        i--;
                                }       
                                for(j=0;j<n;j++)
                                        a[0][j]=t[j];
                        }
			 void leftshift()
                        {
                                int t[]=new int[n];
				int i=1,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[j][0];
                                while(i<n)
                                {
                                        for(j=0;j<n;j++)
                                                a[j][i-1]=a[j][i];
                                        i++;
                                }
                                for(j=0;j<n;j++)
                                        a[j][n-1]=t[j];
                        }
			 void rightshift()
                        {
                                int t[]=new int[n];
				int i=n-2,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[j][n-1];
                                while(i>=0)
                                {
                                        for(j=0;j<n;j++)
                                                a[j][i+1]=a[j][i];
                                        i--;
                                }
                                for(j=0;j<n;j++)
                                        a[j][0]=t[j];
                        }
			void diagshift()
			{
				int t,flag=0,i=0,j=n-1;
				
					while(flag<n/2)
					{
						t=a[i][i];
						a[i][i]=a[j][j];
						a[j][j]=t;
						i++;
						j--;
						flag++;
					}
					flag=0;
					i=0;
					j=n-1;
					while(flag<n/2)
					{
						t=a[i][j];
						a[i][j]=a[j][i];
						a[j][i]=t;
						i++;
						j--;
						flag++;
					}
			}
			void circshift()
			{
				 int row = 0, col = 0;
        int prev, curr,m=n,n1=n;
 
        
        while (row < m && col < n1)
        {
     
            if (row + 1 == m || col + 1 == n1)
                break;
     
            
            prev = a[row + 1][col];
     
           
            for (int i = col; i < n1; i++)
            {
                curr = a[row][i];
                a[row][i] = prev;
                prev = curr;
            }
            row++;
     
            for (int i = row; i < m; i++)
            {
                curr = a[i][n1-1];
                a[i][n1-1] = prev;
                prev = curr;
            }
            n1--;
     
            
            if (row < m)
            {
                for (int i = n1-1; i >= col; i--)
                {
                    curr = a[m-1][i];
                    a[m-1][i] = prev;
                    prev = curr;
                }
            }
            m--;
     
            
            if (col < n1)
            {
                for (int i = m-1; i >= row; i--)
                {
                    curr = a[i][col];
                    a[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
			}
		}
			void display()
			{
				
				 String str = "|\t";

        			for(int i=0;i<n;i++){
            				for(int j=0;j<n;j++){
                				str += a[i][j] + "\t";
            				}

            				System.out.println(str + "|");
            				str = "|\t";
					}
			}

}
class Prog
{
	public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
	public static void main(String args[])throws IOException
	{
		int n=0,ch,i,j;
		int a[][]=new int[200][200];
		int at[][]=new int[200][200];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			
		System.out.println("\nMatrix_Transform\n\n1.Input Matrix\n2.Apply Transformations\n3.Display Original matrix\n4.Display Changed Matrix\n5.exit...\n6.clear Screen\nEnter choice:");
		ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					       //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					       System.out.print("\nEnter size of matrix:");
					       n=Integer.parseInt(br.readLine());
					       System.out.print("\nEnter elements of matrix:\n");
					       for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.print("\nEnter element ["+i+"]["+j+"] of matrix:");
								a[i][j]=Integer.parseInt(br.readLine());
							}
						}
					       transform t=new transform(a,n);	
					       break;
					 
				 case 2:
						//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

						System.out.print("\nEnter the transformations as L(left),U(up),D(down),R(right),A(diagonal),C(Circular) shifts:");						      String s=br.readLine();
						int l=s.length();
						t=new transform(a,n);
						char c[]=new char[l];
							for( i=0;i<l;i++)
								c[i] = s.charAt(i);
							int k=0;
							while(k<l)
							{
								switch(c[k])
								{
									case 'L':{
										 	t.leftshift();
									       		System.out.print("\nAfter Left Shift:\n");
											t.display();
											break;
										  }
									case 'U':{
                                                                                        t.upshift();
                                                                                        System.out.print("\nAfter Up Shift:\n");
                                                                                        t.display();
                                                                                        break;
                                                                                  }
									case 'D':{
                                                                                        t.downshift();
                                                                                        System.out.print("\nAfter Down Shift:\n");
                                                                                        t.display();
                                                                                        break;
                                                                                  }
	 								case 'R':{
                                                                                        t.rightshift();
                                                                                        System.out.print("\nAfter Right Shift:\n");
                                                                                        t.display();
                                                                                        break;
                                                                                  }
									case 'A':{
                                                                                        t.diagshift();
                                                                                        System.out.print("\nAfter Diagonal Shift:\n");
                                                                                        t.display();
                                                                                        break;
                                                                                  }
									case 'C':{
                                                                                        t.circshift();
                                                                                        System.out.print("\nAfter Circular Shift:\n");
                                                                                        t.display();
                                                                                        break;
                                                                                  }
									default:System.out.println("\n\n\nWrong Shift Name");

								}
								k++;
							}
							t.store(at);

							break;
				 case 3:t=new transform(a,n);
					t.display();
					
					break;		
				 case 4:
					 String str = "|\t";

                                	for( i=0;i<n;i++){
                                        for( j=0;j<n;j++){
                                                str += at[i][j] + "\t";
                                        }

                                        System.out.println(str + "|");
                                        str = "|\t";
                                        }
                                       
					break;
				 case 5:return;
				 case 6:clearScreen();
				 		break;
				 default:System.out.println("Wrong CHOICE!!!");
			}
		}while(true);
	}
}
