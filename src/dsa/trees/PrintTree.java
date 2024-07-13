package dsa.trees;

public class PrintTree {

    public static void print(TreeNode root) {
        if(root == null) return;

        System.out.println(root.val);

        if(root.left != null) print(root.left);
        if(root.right != null) print(root.right);
    }
}
