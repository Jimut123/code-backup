 //writing details of a linklist
class Linklist
    {
        private Node start;//storing the starting address of a list
        public Linklist()//default constructor
        {
            start=null;
        }
        public void addAtBeg(int d)//insertion from the beginning
        {
            Node temp=new Node(d,start);
            start=temp;
        }
        public void addAtEnd(int d)//insertion at the end
        {
            Node temp=new Node(d,null);
            Node t=start;//stores the address of start in t
            while(t.getLink()!=null)
                 t=t.getLink();
            t.setLink(temp);
        }
        public void display()//to display the contents of the list
        {
            Node t=start;
            while(t!=null)
            {
                System.out.println(t.getData());
                t=t.getLink();
            }
        }
        public int countNode()//to count the number of nodes in the list
        {
            Node t=start;
            int c=0;
            while(t!=null)
            {
                c++;
                t=t.getLink();
            }
            return c;//returns the number of nodes present
        }       
        public void addAtMid(int d,int nodeNo)//insertion at middle
        {
            if(nodeNo>countNode())//if the node number does not exists  
            {
                System.out.println("Insertion not possible at "+nodeNo);
                return;
            }
            else//if the node number exists
            {
                Node temp=new Node(d,null);
                int c=0;
                Node t=start;
                while(t!=null)
                {
                    c++;
                    if(c==nodeNo)//checks the position
                    {
                        temp.setLink(t.getLink());//the value is assigned
                        t.setLink(temp);
                        break;
                    }
                    t=t.getLink();
                }
            }
        }
        public void search(int no)
        {
            boolean flag=false;
            Node t=start;//storing address of start in y
            while(t!=null)//searching till the last node of list
            {
                if(t.getData()==no)//if the number is found
                {
                    flag=true;
                    System.out.println("Data present in node ");
                    break;
                }
                else
                {
                    t=t.getLink();//moves to the next node
                }
            }
            if(flag==false)//if the number is not found
                System.out.println("Data not present ");
        }
        public void deleNode(int no)//to delete a particular number
        {
            if(start.getData()==no)
            {
                start=start.getLink();
                return;
            }
            else
            {
                boolean flag=false;
                Node prev,ptr;
                for(ptr=prev=start;ptr!=null;prev=ptr,ptr=ptr.getLink())
                {
                    if(ptr.getData()==no)//to find the number to be deleted
                    {
                        flag=true;
                        prev.setLink(ptr.getLink());
                        break;
                    }
                }
                if(flag==false)
                   System.out.println("Deleted number in the list ");
            }
        }
    }//end of class