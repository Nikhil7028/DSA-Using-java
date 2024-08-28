package Tree;

public class Traversal {
    private static void preorder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if (root==null) return;
        preorder(root.left);
        System.out.print(root.val+" ");
        preorder(root.right);
    }
    // post order traversal
    private static void postorder(Node root){
        if (root==null) return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(11);

        a.left=b;   a.right=c;
        b.left=d;   b.right=e;
                    c.right=f;   
        System.out.println("Pre-order traversal: ");
        preorder(a);
        System.out.println();
        System.out.println("In-order traversal: ");
        inorder(a);
        System.out.println();
        System.out.println("Post-order traversal: ");
        postorder(a);
        System.out.println();
    }
    
}
