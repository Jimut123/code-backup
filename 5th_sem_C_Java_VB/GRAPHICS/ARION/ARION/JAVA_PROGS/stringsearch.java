import java.util.*;
class stringsearch
{
	public static void main(String args[])
	{
		String s,wd,ck,tmp1,tmp2,wd2,s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the sentence:");
		s=sc.nextLine();
		System.out.println("\n\nThe Sentence is:"+s);
		System.out.println("\n\nEnter the word to search :");
		wd=sc.nextLine();
		int l1=s.length();
		int l2=wd.length();
		int flag=0,ch,pos=0;
		for(int i=1;i<=l1-l2;i++)
		{
			if(s.charAt(i) == wd.charAt(0))
			{
				ck=s.substring(i,i+l2);
				if(ck.equals(wd))
				{
					flag=1;
					pos=i;
				}
				else
				{
					while(i++<l2);
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("The given word is found!!!\n\nDo you want to replace(1 for Yes/0 for No)");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter the new Word to replace:");
				wd2=sc.nextLine();
				wd2=sc.nextLine();
				
				tmp1=s.substring(0,pos);
				tmp2=s.substring(pos+l2,l1);
				//System.out.println("The new String is:"+tmp);
				s1=tmp1;
				s1+=wd2;
				s1+=tmp2;
				System.out.println("The new String is:"+s1);
			}
		}
		
	}

}