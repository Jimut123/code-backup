package Binary_Tree;
import java.util.*;
class BinaryDelLeaf
{
    TreeNode root;
    BinaryDelLeaf()//default constructor
    {
        root=null;
    }
    void insert(int x)
    {
        root=insert(root,x);
    }
    TreeNode insert(TreeNode n,int x)
    {
        if(n==null)
        n=new TreeNode(x);
        else
        {
            if(x<n.getData())
            n.left=insert(n.left,x);
            else
            n.right=insert(n.right,x);
        }
        return n;
    }
    void del()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter leaf to be deleted ");
        n=sc.nextInt();
        find(root,n);
    }
    void find(TreeNode n,int x)
    {
        if(n==null)
        return;
        else
        {
            if(n.left==null&&n.right==null&&n.getData()==x)
            {
                System.out.print("Node found and deleted "+x);
                n.data=0;
                return;
            }
            else
            {
                find(n.left,x);
                find(n.right,x);
            }
        }
    }
    void left(TreeNode n)
    {
        if(n==null)
        return ;
        else
        {
            left(n.left);
            System.out.print(n.getData()+" ");
        }
    }
    void right(TreeNode n)
    {
        if(n==null)
        return ;
        else
        { 
            System.out.print(n.getData()+" ");
            right(n.right);
        }
    }
    void print()
    {
        if(root==null)
        return;
        left(root);
        right(root.right);
    }
}
            