//creating node class
class Node
    {
        private int data;
        private Node link;//self referential structure
        public Node()//default constructor
        {
            data=0;
            link=null;
        }
        public Node(int d,Node l)//parameterized constructor
        {
            data=d;
            link=l;
        }
        public int getData()//to return the value
        {
            return data;
        }
        public Node getLink()//to return the link
        {
            return link;
        }
        public void setLink(Node l)
        {
            link=l;
        }
        public void setData(int d)
        {
            data=d;
        }
    }//end of class
    
   