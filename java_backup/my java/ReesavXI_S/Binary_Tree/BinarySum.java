package Binary_Tree;
import java.util.*;
class BinarySum
{
    TreeNode root;
    int Left_sum;
    int Right_sum;
    BinarySum()//default constructor
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
    void right_sum(TreeNode n)
    {
        if(n==null)
        return ;
        else
        { 
            Right_sum=Right_sum+n.getData();
            right_sum(n.right);
        }
    }
    void left_sum(TreeNode n)
    {
        if(n==null)
        return ;
        else
        { 
            Left_sum=Left_sum+n.getData();
            left_sum(n.left);
        }
    }
    void sum()
    {
        left_sum(root.left);
        right_sum(root.right);
        System.out.println("Left Child sum "+Left_sum);
        System.out.println("Right Child sum "+Right_sum);
    }
}