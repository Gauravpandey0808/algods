package trees;

public class BSTKthSmallest {

    private int counter = 0;

    public static void main(String[] args) {
        BNode root = new BNode(6);
        root.left = new BNode(2);
        root.right = new BNode(8);
        root.left.left = new BNode(0);
        root.left.right = new BNode(4);
        root.left.right.left = new BNode(3);
        root.left.right.right = new BNode(5);
        root.right.left = new BNode(7);
        root.right.right = new BNode(9);

        BSTKthSmallest smallest = new BSTKthSmallest();
        System.out.println(smallest.kthSmallest(root, 4));


    }

    public int kthSmallest(BNode root, int k) {
        if(root == null) return -1;
        int left = kthSmallest(root.left, k);
        if(left != -1) return left;
        if(++counter == k) return root.value;
        return kthSmallest(root.right, k);
    }


}

class BNode {
    int value;
    BNode left, right;

    BNode(int value) {
        this.value = value;
    }

}
