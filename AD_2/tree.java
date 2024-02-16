package AD_2;

public class tree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    class BiTree {
        Node root;

        public void traverseRoot(Node node) {
            if (node != null) {
                traverseRoot(node.left);
                System.out.println(" " + node.key);
                traverseRoot(node.right);
            }
        }
    }
public static void main(String[] args) {
    BiTree t= new BiTree();
    t.root=new Node(1);
    t.root.left=new Node(2);
    t.root.right=new Node(3);
    t.root.left.left=new Node(4);
    System.out.println("Binary tree");
    t.traverseRoot(t.root);
}
    
}