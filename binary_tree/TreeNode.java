public class TreeNode {
    TreeNode left = null, right = null;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }

    public static int height(TreeNode root) {
        int rightLength = 0, leftLength = 0;

        if (root.left != null) {
            leftLength = 1 + height(root.left);
        }
        if (root.right != null) {
            rightLength = 1 + height(root.right);
        }

        return Math.max(rightLength, leftLength);
    }
}