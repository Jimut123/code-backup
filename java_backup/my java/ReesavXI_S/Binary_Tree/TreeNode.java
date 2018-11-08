package Binary_Tree;
import java.util.*;
class TreeNode
{
    int data;
    TreeNode left,right;
    TreeNode()//default constructor
    {
        data=0;
        left=null;
        right=null;
    }
    TreeNode(int n)//overloaded constructor
    {
        data=n;
        left=null;
        right=null;
    }
    void setData(int n)
    {
        data=n;
    }
    int getData()
    {
        return data;
    }
    void setLeft(TreeNode t)
    {
        left=t;
    }
    void setRight(TreeNode t)
    {
        right=t;
    }
    TreeNode getLeft()
    {
        return left;
    }
    TreeNode getRight()
    {
        return right;
    }
}