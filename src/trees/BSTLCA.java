//package trees;
//
//public class BSTLCA {
//
//    public static void main(String[] args) {
//        Bst root = new Bst(6);
//        root.left = new Bst(2);
//        root.right = new Bst(8);
//        root.left.left = new Bst(0);
//        root.left.right = new Bst(4);
//        root.left.right.left = new Bst(3);
//        root.left.right.right = new Bst(5);
//        root.right.left = new Bst(7);
//        root.right.right = new Bst(9);
//
//        BSTLCA bst = new BSTLCA();
//        Bst nearestNode = bst.lowestCommonAncestor(root, root.left.right.left, root.left.right.right);
//
//        System.out.println(nearestNode.value);
//    }
//
//    public Bst lowestCommonAncestor(Bst root, Bst p, Bst q) {
//        while(root != null) {
//            if (p.value < root.value && q.value < root.value) root = root.left;
//            else if (p.value > root.value && q.value > root.value) root = root.right;
//            else return root;
//        }
//        return null;
//    }
//
//}
//
//
//class BST {
//
//    int value;
//
//    Bst left;
//
//    Bst right;
//
//    public BST(int value, Bst left, Bst right) {
//        this.value = value;
//        this.left = left;
//        this.right = right;
//    }
//
//    public BST(int value) {
//        this.value = value;
//        this.left = null;
//        this.right = null;
//    }
//
//}
