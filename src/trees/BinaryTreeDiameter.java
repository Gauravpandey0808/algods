//package trees;
//
//import java.util.Scanner;
//
//public class BinaryTreeDiameter {
//
//    public static void main(String[] args) {
//
//        int[] diameter = new int[1];
//
//        BinaryTreeDiameter diameter1 = new BinaryTreeDiameter();
//
//
//
//
//
//
//
//    }
//
//    public BST createTree() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter how many nodes will be there in a bst");
//        int i = scanner.nextInt();
//        int[] data = new int[i];
//
//        for(int j = 0; j < i; j++) {
//            System.out.println("Enter the data which needs to be insered in the bst");
//            int d = scanner.nextInt();
//            if(d != -1) {
//                BST bst = new BST(d);
//            }
//        }
//
//
//    }
//    public int getTreeDiameter(BST root, int[] diameter) {
//        if(root == null) return 0;
//
//        int leftDiameter = getTreeDiameter(root.leftNode, diameter);
//
//        int rightDiameter = getTreeDiameter(root.rightNode, diameter);
//
//        diameter[0] =  Math.max(diameter[0], leftDiameter + rightDiameter);
//
//        return Math.max(leftDiameter, rightDiameter )+ 1;
//    }
//}
