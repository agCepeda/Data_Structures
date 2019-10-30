import java.util.Stack;

public class BinaryTree extends AbstractTree {

    @Override
    public void insert(int val) {
        if (this.root == null) {
            this.root = new TreeNode(val);
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(this.root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (val <= node.val) {
                if (node.left != null) {
                    stack.push(node.left);
                } else {
                    node.left = new TreeNode(val);
                }
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                } else {
                    node.right = new TreeNode(val);
                }
            }
        }
    }
}