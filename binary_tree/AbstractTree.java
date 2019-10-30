import java.util.function.Consumer;

public abstract class AbstractTree {
    protected TreeNode root = null;
    abstract void insert(int val);

    public static void inOrderWalk(TreeNode root, Consumer<TreeNode> callback) {
        if (root == null) { return; }
        if (root.left != null) {
            inOrderWalk(root.left, callback);
        }
        callback.accept(root);
        if (root.right != null) {
            inOrderWalk(root.right, callback);
        }
    }
}