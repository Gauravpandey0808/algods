package trees;

public class BinaryTree {

    private Node insertRecord(int data , Node node) {
        if(node == null) {
            return new Node(data);
        }

        if(data < node.data) {
            node.left = insertRecord(data,node.left);
        } else if (data > node.data) {
            node.right = insertRecord(data , node.right);
        }
        return node;
    }

    private void preOrder(Node root) {
        if(null != root) {
            System.out.print(root.data + " " + "->" + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void postOrder(Node root) {
        if(null != root) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " " + "->" + " ");
        }
    }

    private void inOrder(Node root) {
        if(null != root) {
            inOrder(root.left);
            System.out.print(root.data + " " + "->" + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Node root;
        root = tree.insertRecord(5 , null);
        root = tree.insertRecord(10 , root);
        root = tree.insertRecord(20 , root);
        root = tree.insertRecord(2 , root);
        root = tree.insertRecord(6 , root);
        root = tree.insertRecord(22 , root);
        root = tree.insertRecord(80 , root);
        System.out.println("---------------------------Start of inOrder Traversal---------------------------");
        tree.inOrder(root);
        System.out.println("null");
        System.out.println("---------------------------End of inOrder Traversal---------------------------");
    }
}






