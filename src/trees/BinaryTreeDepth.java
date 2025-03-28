package trees;

public class BinaryTreeDepth {
    public static void main(String[] args) {
        BNode root = new BNode(1);
        root.left = new BNode(2);
        root.right = new BNode(3);
        root.left.left = new BNode(4);
        root.left.right = new BNode(5);
        root.right.right = new BNode(6);
        root.right.right.left = new BNode(8);
        root.right.right.right = new BNode(9);
        root.right.right.left.left = new BNode(10);
        root.right.right.right.left = new BNode(11);
        root.right.right.left.right = new BNode(12);
        root.right.right.right.right = new BNode(13);



        int i = getTreeDepth(root);
        System.out.println(i);
    }

    public static int getTreeDepth(BNode root) {
        if(root == null) return 0;

        int leftDepth = getTreeDepth(root.left) + 1;
        int rightDepth = getTreeDepth(root.right) + 1;
        return Math.max(leftDepth, rightDepth);
    }
}

class TNode {

    BNode left, right;

    Integer value;

    public TNode(BNode leftNode, BNode rightNode, int value) {
        this.left = leftNode;
        this.right = rightNode;
        this.value = value;
    }

    public TNode(BNode leftNode, BNode rightNode) {
        this.left = leftNode;
        this.right = rightNode;
        this.value = 0;
    }

    public TNode(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public TNode() {

    }
}
