package trees;

public class LearnBinaryTree {

    private Node insertData(int data, Node root) {
        if (null == root) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertData(data, root.left);
        } else if (data > root.data) {
            root.right = insertData(data, root.right);
        }
        return root;
    }

    private void printHighestNo(Node root) {

        if(null == root.right) {
            System.out.print("this is the highest no : " + root.data);
            return ;
        }
        printHighestNo(root.right);

    }

    public static void main(String[] args) {
        LearnBinaryTree tree = new LearnBinaryTree();
        Node root;
        root = tree.insertData(5 , null);
        root = tree.insertData(10000 , root);
        root = tree.insertData(20 , root);
        root = tree.insertData(80,root);
        root = tree.insertData(8, root);
        root = tree.insertData(30 , root);
        root = tree.insertData(100 , root);
        tree.printHighestNo(root);
    }
}
