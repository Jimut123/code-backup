//binary search tree
import java.util.*;
class NodeTree
{
    private int data;
    private NodeTree left;
    private NodeTree right;
    public NodeTree()
    {
        data=0;
        left=right=null;
    }

    public NodeTree(int d, NodeTree l, NodeTree r)
    {
        data=d;
        left=l;
        right=r;
    }

    public int getData()
    {
        return data;
    }

    public NodeTree getLeft()
    {
        return left;
    }

    public NodeTree getRight() 
    {
        return right;
    }
    
    public void setData(int d) 
    {
        data=d;
    }
    
    public void setLeft(NodeTree l)
    {
        left=l;
    }
    
    public void setRight(NodeTree r)
    {
        right=r;
    }    
}

class BinTree
{
    private NodeTree root;
    private NodeTree parent;
    public BinTree()
    {
        root=parent=null;
    }
    
    public void create(int v)
    {                
        boolean found=false;
        NodeTree temp=new NodeTree(v, null, null);
        if(root==null) root=temp;
        else
        {
            found=search(root, v);//searching for a duplciate node
            if(found) System.out.println("Error: Node value already exists");
            else
            {
                if(v<parent.getData()) parent.setLeft(temp);
                else parent.setRight(temp);
            }
        }
    }
    
    public boolean search(NodeTree r, int val)
    {
        boolean found=false;
        while(r!=null && !found)
        {
            int rval=r.getData();
            if(val<rval)
            {
                parent=r;
                r=r.getLeft();
            }
            else if(val>rval)
            {
                parent=r;
                r=r.getRight();
            }
            else
            {
                found=true;
                break;
            }
        }
        return found;
    }
    
    public NodeTree delNode(NodeTree r, int val)
    {
        NodeTree t1, t2, n;
        if(r.getData()==val)
        {
            NodeTree lt=r.getLeft();
            NodeTree rt=r.getRight();
            if(lt==null && rt==null) return null;
            else if(lt==null) return rt;
            else if(rt==null) return lt;
            else
            {
                t1=t2=rt;
                while(t1.getLeft()!=null) t1=t1.getLeft();
                t1.setLeft(lt);
                return t2;
            }
        }
        if(val<r.getData())
        {
            n=delNode(r.getLeft(), val);
            r.setLeft(n);
        }
        else
        {
            n=delNode(r.getRight(), val);
            r.setRight(n);
        }
        return r;
    }
    
    public void preOrder(NodeTree r)
    {
        if(r!=null)
        {
            System.out.print(r.getData() + " | ");
            preOrder(r.getLeft());
            preOrder(r.getRight());
        }
    }
    
    public void inOrder(NodeTree r)
    {
        if(r!=null)
        {
            inOrder(r.getLeft());
            System.out.print(r.getData() + " | ");
            inOrder(r.getRight());
        }
    }
    
    public void postOrder(NodeTree r)
    {
        if(r!=null)
        {
            postOrder(r.getLeft());
            postOrder(r.getRight());
            System.out.print(r.getData() + " | ");
        }
    }
    
    public boolean isEmpty()
    {
        return root==null;
    }
    
    public int countNodes(NodeTree r)
    {
        if(r==null) return 0;
        else
        {
            int c=1;
            c += countNodes(r.getLeft());
            c += countNodes(r.getRight());
            return c;
        }
    }
    
    public void display()
    {
        System.out.print("\nPre-order:");
        preOrder(root);
        System.out.print("\nIn-order:");
        inOrder(root);
        System.out.print("\nPost-order:");
        postOrder(root);
    }   
    
    public void deleteControl(char ch)
    {
        if(ch=='N' || ch=='n') return;        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes you want to remove: ");
        int no=sc.nextInt();
        System.out.println("Enter " + no + " nodes:");
        for(int i=0; i<no; i++)
        {
            int d=sc.nextInt();
            if(isEmpty()) System.out.println("The Binary Tree is empty");        
            else if(!search(root, d)) System.out.println("The element you wish to delete is not present in your Binary Tree");
            else            
                root=delNode(root, d);            
        }
    }
}

public class btree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BinTree bt=new BinTree();
        System.out.println("Enter the nodes:\n(Enter 'S' when you wish to stop entering nodes)\n");
        while(true)
        {
            String s=sc.next();
            if(s.equalsIgnoreCase("S")) break;
            bt.create(Integer.parseInt(s));
        }      
        System.out.print("Do you wish to remove any nodes? Enter (Y/N): ");
        bt.deleteControl(sc.next().charAt(0));
        System.out.println("Your final set of nodes in three orders:");
        bt.display();
    }
}