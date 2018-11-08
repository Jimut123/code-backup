//
import java.util.*;
class BinaryTreeMain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Tree obj=new Tree();
        int c=0;
        do{
            System.out.println("Enter : 1 to add Node1 2 to search 3 to show 4 to delete and 5 to exit");
            c=sc.nextInt();
            switch(c)
            {
                case 1 : obj.create();                           break;
                case 2 : System.out.println("Enter data to search");
                         obj.search(obj.root,sc.nextInt());    break;
case 3 : obj.show();                         break;
                case 4 : obj.delNode1(obj.root,sc.nextInt()); break;
                case 5 : break;
                default: System.out.println("Inavlid choice");
            }
        }while(c!=5);
    }
}

//Binary tree

class Tree
{
    Scanner sc =new Scanner(System.in);
    public Node1 root;
    public Node1 parent;
    public Tree()
    {   root=null;  parent=null;    }
    public void create()
    {
        System.out.println("Enter data");
        int d=sc.nextInt();
        Node1 t=new Node1(d,null,null);
        if(root==null)
        {   root=t;     return; }
        if(search(root,d)==true)
        {
            System.out.println("Value is present");
            return;
        }
        if(d<parent.data)
        parent.left=t;
        else
        parent.right=t;
    }
    public boolean search(Node1 t,int v)
    {
        if(t==null)
        return false;
        parent=t;
        if(t.data==v)
        return true;
        else if(v<t.data)
        return search(t.left,v);
        else 
        return search(t.right,v);
    }
     public void preShow(Node1 t)         
    {
        if(t==null)
        return;
        System.out.print("  "+t.data);
        preShow(t.left);
        preShow(t.right);
    }
 
    public void inShow(Node1 t)         
    {
        if(t==null)
        return;
        inShow(t.left);
        System.out.print("  "+t.data);
        inShow(t.right);
    }
    public void postShow(Node1 t)         
    {
        if(t==null)
        return;
        postShow(t.left);
        postShow(t.right);
        System.out.print("  "+t.data);
    }
   
 public void show()
    {
        System.out.print("Preorder traversal : ");
        preShow(root);
        System.out.print("\nInorder traversal : ");
        inShow(root);
        System.out.print("\nPostorder traversal : ");
        postShow(root);
        System.out.println();
    }
    public Node1 delNode1(Node1 t,int v)
    {
        t.left=(v<t.data)?  delNode1(t.left,v) : t.left ;
        t.right=(v>t.data)? delNode1(t.right,v) : t.right ;
        if(t.data!=v)
        return t;
            Node1 lt=t.left;
            Node1 rt=t.right;
            if(lt==rt&&rt==null)
            return null;
            else if(lt==null)
            return rt;
            else if(rt==null)
            return lt;
            Node1 p1=rt;
            while(p1.left!=null)
            p1=p1.left;
            p1.left=lt;
            return rt;
        
    }
}
