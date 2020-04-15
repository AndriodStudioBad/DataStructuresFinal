/**
 *
 * @author jakew
 */
public class Node {
    private int val;
    private Node lChild;
    private Node rChild;
    public Node(int val, Node lC, Node rC){
        this.val = val;
        lChild = lC;
        rChild = rC;
    }
    public Node(Node lC, Node rC){
        val = 0;
        lChild = lC;
        rChild = rC;
    }
    public Node(){
        val = 0;
        lChild = null;
        rChild = null;
    }
    
    public Node getLeftChild(){
        return lChild;
    }
    public Node getRightChild(){
        return rChild;
    }
    public int getValue(){
        return val;
    }
            
    public static boolean compareTo(Node n1, Node n2){
        return (n1.toString() == n2.toString() && n1.getValue() == n2.getValue());
    }
    public void add(){
        val++;
    }
    public static boolean compareChildren(Node n1, Node n2){ //node n1 is to the left in the tree, node n2 is to the right in the tree, so the left child's right node and the right child's left node are being compared
        if(n1.getRightChild() == null || n2.getLeftChild() == null){
            return false;
        }
        return(n1.getRightChild().toString() == n2.getLeftChild().toString());
    }
}
