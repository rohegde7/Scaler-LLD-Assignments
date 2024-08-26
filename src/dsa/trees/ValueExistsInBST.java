package dsa.trees;

public class ValueExistsInBST {

    public int solve(TreeNode A, int B) {

        if (A == null) return 0;

        if (A.val == B) return 1;


        if(solve(A.left, B) == 1) return 1;
        if(solve(A.right, B) == 1) return 1;

        return 0;
    }
}
