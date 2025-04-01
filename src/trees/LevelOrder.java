//package trees;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LevelOrder {
//
//    public static void main(String[] args) {
//
//        BinaryTree head = new BinaryTree(1,
//                new BinaryTree(2,
//                        new BinaryTree(4),
//                        new BinaryTree(5)),
//                new BinaryTree(3,
//                        null,
//                        new BinaryTree(6, null, null)));
//
//    }
//
//    public List<List<Integer>>  getLevelOrder(BinaryTree head) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<BinaryTree> temp = List.of(head);
//
//
//        for(int i = 0; i < temp.size(); i++) {
//
//        }
//
//
//    }
//
//
//    private static class BinaryTree {
//        BinaryTree leftNode;
//        BinaryTree rightNode;
//        int value;
//
//        BinaryTree(int value, BinaryTree leftNode, BinaryTree rightNode) {
//            this.leftNode = leftNode;
//            this.rightNode = rightNode;
//            this.value = value;
//        }
//
//        BinaryTree(int value) {
//            this.leftNode = null;
//            this.rightNode = null;
//            this.value = value;
//        }
//
//
//
//    }
//}
