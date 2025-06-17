class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    // Function to print non-leaf nodes
    void printNonLeafNodes(TreeNode node) {
        if (node == null) return;

        // Check if current node is NOT a leaf
        if (node.left != null || node.right != null) {
            System.out.print(node.data + " ");
        }

        // Recur for left and right subtrees
        printNonLeafNodes(node.left);
        printNonLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(25);

        System.out.println("Non-leaf nodes are:");
        tree.printNonLeafNodes(tree.root);
    }
}
