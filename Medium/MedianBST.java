public class MedianBST {

    static int A, B;
    public static float findMedian(Node root)
    {
        // code here.
        int n=countNodes(root);
        int i=0;
        if(n%2!=0)
            traverse(root,i,n/2+1,n/2+1);
        else 
            traverse(root,i,n/2,n/2+1);
        return (A+B)/2f;
    }
    
    static int traverse(Node root,int i,int node1,int node2){
        if(root == null) 
            return i;
        i = traverse(root.left,i,node1,node2);
        i++;
        if(i==node1)
            A=root.data;
        if(i==node2)
            B=root.data;
        i = traverse(root.right,i,node1,node2);
        return i;
    }
    
    static int countNodes(Node root){
        return root==null?0:1+countNodes(root.left)+countNodes(root.right);
    }
    
}
