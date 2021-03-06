package Binary_Tree;
import java.util.*;
class BinaryLeafSum
{
    TreeNode root;
    int sum;
    BinaryLeafSum()//default constructor
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
    void sum()
    {
        sum(root);
        System.out.print("Sum of leaves "+sum);
    }
    void sum(TreeNode n)
    {
        if(n==null)
        return;
        else
        {
            if(n.left==null&&n.right==null)
            sum=sum+n.getData();
            sum(n.left);
            sum(n.right);
        }
    }
}
