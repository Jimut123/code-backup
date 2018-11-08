import java.io.*;
class DATA
{
	public static void main(String args[])throws IOException
	{
		String file1;
		int r,p1,p2,p3,t;
		float avg;
		int nr;    //no of rec
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data file name:");
		file1=br.readLine();
		FileOutputStream f1=new FileOutputStream(file1);
		DataOutputStream fp1=new DataOutputStream(f1);
		int choice;
			do{
				System.out.print("Enter Roll:");
				r=Integer.parseInt(br.readLine());
				System.out.print("Enter p1(0-100):");
				p1=Integer.parseInt(br.readLine());
				 System.out.print("Enter p2(0-100):");
                                p2=Integer.parseInt(br.readLine());
				 System.out.print("Enter p3(0-100):");
                                p3=Integer.parseInt(br.readLine());
				t=p1+p2+p3;
				avg=(float)t/3.0F;
				fp1.writeInt(r);
				fp1.writeInt(p1);
				fp1.writeInt(p2);
				fp1.writeInt(p3);
				fp1.writeInt(t);
				fp1.writeFloat(avg);
				System.out.print("\nEnter '1' to continue---->");
				choice=Integer.parseInt(br.readLine());
				}while(choice==1);
			fp1.close();
			f1.close();
		FileInputStream f2=new FileInputStream(file1);
		DataInputStream	fp2=new DataInputStream(f2);
		nr=0;
			while((r=fp2.readInt())!=-1)
			{
				p1=fp2.readInt();
				p2=fp2.readInt();
				p3=fp2.readInt();
				t=fp2.readInt();
				avg=fp2.readFloat();
			System.out.println("R="+r+"P1:"+p1+"p2:"+p2+"p3:"+p3+"T="+t+"AVG:"+avg);
				nr++;
			}
			fp2.close();
			f2.close();
			System.out.println("\nNumber of rec: "+nr);
			}
			catch(Exception e)
			{}
			}
		}			
