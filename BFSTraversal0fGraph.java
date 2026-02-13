
class Node{
    int data;
    Node left, right;
    
    Node (int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class BFSTraversal{
    public static void bfs( Node root ){
    if ( root == null)
    return;
    
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    
    while (!queue.isEmpty()){
        Node current = queue.poll();
        System.out.print(current.data+" ");
        
        if (current.left != null)
            queue.add(current.left);
        
        if (current.right != null)
            queue.add(current.right);
    }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.left.right.left = new Node(5);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        root.right.left.right = new Node(8);

        bfs(root);
    }

}
