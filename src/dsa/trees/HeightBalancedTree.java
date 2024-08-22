package dsa.trees;

public class HeightBalancedTree {

    boolean isBalanced = true;

    public int isBalanced(TreeNode A) {
        if (A == null || A.val == -1) return 1;

        if (Math.abs(height(A.left) - height(A.right)) > 1) return 0;

        if (isBalanced(A.left) == 0 || isBalanced(A.right) == 0) return 0;
        else return 1;
    }

    public int height(TreeNode A) {
        if (A == null || A.val == -1) return 0;

        int left = height(A.left);
        int right = height(A.right);

        return Math.max(left, right) + 1;
    }
}

class MainHeightBalancedTree {

    public static void main(String[] args) {
        HeightBalancedTree lot = new HeightBalancedTree();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(9);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(8);
        root.right.left.right = new TreeNode(3);

        System.out.println(lot.isBalanced(root));
    }
}
