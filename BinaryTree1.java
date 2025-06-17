import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTree1 {
    TreeNode root;
    void mirror(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }
    void levelOrder(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(25);
        System.out.println("Level-order traversal before mirroring:");
        tree.levelOrder(tree.root);
        tree.mirror(tree.root);
        System.out.println("Level-order traversal after mirroring:");
        tree.levelOrder(tree.root);
    }
}
