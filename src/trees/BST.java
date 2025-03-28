package trees;

public class BST {

    int data;
    BST leftNode;
    BST rightNode;

    public BST(int data, BST leftNode, BST rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public BST(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BST() {

    }
}
