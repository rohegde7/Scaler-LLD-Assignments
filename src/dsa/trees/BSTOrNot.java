package dsa.trees;

public class BSTOrNot {
    public int isValidBST(TreeNode A) {

        if (A == null) return 1;

        if(A.left != null && A.left.val >= A.val) return 0;
        if(A.right != null && A.right.val < A.val) return 0;

        return isValidBST(A.left, Integer.MIN_VALUE, A.val) & isValidBST(A.right, A.val, Integer.MAX_VALUE );
    }

    public int isValidBST(TreeNode A, int min, int max) {
        if(A == null) return 1;

        if(A.left != null && (A.left.val >= A.val || A.left.val < min)) return 0;
        if(A.right != null && (A.right.val < A.val || A.right.val >= max)) return 0;

        return isValidBST(A.left, min, A.val) & isValidBST(A.right, A.val, max);
    }
}

class MainBSTOrNot {
    public static void main(String[] args) {

//        TreeNode root = new TreeNode(4);
//
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(5);
//
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(5);

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(2);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        BSTOrNot bstOrNot = new BSTOrNot();
        System.out.println(bstOrNot.isValidBST(root));
    }
}

/*
                     4
                 2       5
              1      5



        3 2 4 1 3 -1 -1 -1 -1 -1 -1

                3
             2      4
         1      3


                4
                    5
                3
*/
