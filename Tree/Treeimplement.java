package Tree;

/**
 * Treeimplement
 * implementation of tree
 */
class Node{
    Node left;
    Node right;
    int val;
    Node(int val){
        this.val=val;
    }
}

public class Treeimplement {
    private static void display(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int sum(Node root,int sum){
        if (root==null) return 0;
        sum=root.val+sum(root.left,sum)+sum(root.right,sum);  
        return sum;
    }
    private static int product(Node root,int mul){
        if (root==null) return 1;
        mul=root.val*product(root.left, mul)*product(root.right, mul);
        return mul;
    }
    private static int Max(Node root, int mx){
        if (root==null) return Integer.MIN_VALUE;
        int lx=Math.max(root.val, Math.max(Max(root.left, mx),mx));
        int rx=Math.max(root.val, Math.max(Max(root.right, mx),mx));
        mx=Math.max(lx,rx);
        return mx;
    }
    private static int Min(Node root, int mn){
        if (root==null) return Integer.MAX_VALUE;
        int lmin=Math.min(root.val,Math.min(Min(root.left,mn), mn));
        int rmin=Math.min(root.val, Math.min(Min(root.right, mn), mn));
        mn=Math.min(lmin, rmin);
        return mn;
    }
    //find the size of the node (no. of nodes)
    private static int size(Node root, int s){
        if (root==null) return 0;
        s=1+size(root.left, s)+size(root.right, s);
        return s;
    }
    // find the level of tree
    private static int level(Node root, int l){
        if (root==null) return 0;
        l=1+ Math.max(level(root.left, l), level(root.right, l));
        return l;
    }
    // find the height of tree
    private static int height(Node root, int l){
        if (root==null) return 0;
        l=1+ Math.max(level(root.left, l), level(root.right, l));
        return l-1;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(0);
        Node f = new Node(5);
        Node g = new Node(6);
        Node h = new Node(8);

        a.left=b;   a.right=c;
        b.left=d;   b.right=e;
        c.left=f;   c.right=g;
        d.right=h;

        display(a); // display the tree element
        System.out.println();
        // System.out.println("Sum     :: "+sum(a, 0));
        // System.out.println("product :: "+product(a, 1));
        System.out.println("Maximum val :: "+Max(a,Integer.MIN_VALUE));
        System.out.println("Minimum val :: "+Min(a,Integer.MAX_VALUE));
        System.out.println("Size :: "+size(a, 0));
        System.out.println("level :: "+level(a, 0));
        System.out.println("Height:: "+height(a, 0));


               
        
    }

    
}