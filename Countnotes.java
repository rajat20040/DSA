import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class main {

    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    
    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorderHelper(node.left, result);         // Traverse left subtree
        postorderHelper(node.right, result);        // Traverse right subtree
        result.add(node.val);                       // Visit the root
    }

    
    public static void main(String[] args) {
        // Creating a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        main solution = new main();  // Create object of class 'main'
        List<Integer> result = solution.postorderTraversal(root);

        System.out.println("Postorder Traversal:");
        for (int val : result) {
            System.out.print(val + " ");

        }
    }
}
