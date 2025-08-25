class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;

    }
}
class BinaryTree{
    public static void preOrder(Node node){
        if(node != null){
            System.out.println(node.val);
            preOrder(node.left);
            preOrder(node.right);

        }
    }
    public static void main(String[] args){
        Node firstNode = new Node(2);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;

        System.out.println("postorder traveral: ");
        preOrder(firstNode);
    }
}