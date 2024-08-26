package dsa.trees;

public class DeleteNodeInBST {

    public TreeNode solve(TreeNode A, int B) {

        if (A == null) return null;

//        TreeNode root = A;

        if(A.val == B)  {
            if(A.left == null && A.right == null) return null;
            if(A.left == null) return A.right;
            if(A.right == null) return A.left;

            TreeNode leafNode = A.left;

            while(leafNode.right != null) {
                leafNode = leafNode.right;
            }

            int replaceValue = leafNode.val;
            A.val = replaceValue;
            A.left = solve(A.left, leafNode.val);

        } else if(B < A.val) {
            A.left = solve(A.left, B);
        } else {
            A.right = solve(A.right, B);
        }

        return A;
    }
}

class MainDeleteNodeInBST {
    public static void main(String[] args) {

//        TreeNode node = new TreeNode(15);
//
//        node.left = new TreeNode(12);
//        node.right = new TreeNode(20);
//
//        node.left.left = new TreeNode(10);
//        node.left.right = new TreeNode(14);
//
//        node.right.left = new TreeNode(16);
//        node.right.right = new TreeNode(27);
//
//        node.left.left.left = new TreeNode(8);
//
//        DeleteNodeInBST solution = new DeleteNodeInBST();
//        TreeNode result = solution.solve(node, 10);


//        TreeNode node = new TreeNode(3);
//        node.right = new TreeNode(4);
//
//        DeleteNodeInBST solution = new DeleteNodeInBST();
//        TreeNode result = solution.solve(node, 4);


        // 4 3 7 1 -1 6 8 -1 2 5 -1 -1 -1 -1 -1 -1 -1
//        TreeNode node = new TreeNode(4);
//
//        node.left = new TreeNode(3);
//        node.right = new TreeNode(7);
//
//        node.left.left = new TreeNode(1);
//
//        node.right.left = new TreeNode(6);
//        node.right.right = new TreeNode(8);
//
////        node.left.left.left = new TreeNode(8);
//        node.left.left.right = new TreeNode(2);
//        node.right.left.left = new TreeNode(5);

        //  3 1 7 -1 2 5 -1 -1 -1 4 6 -1 -1 -1 -1
        TreeNode node = new TreeNode(3);

        node.left = new TreeNode(1);
        node.right = new TreeNode(7);

        node.left.right = new TreeNode(2);

        node.right.left = new TreeNode(5);

        node.right.left.left = new TreeNode(4);
        node.right.left.right = new TreeNode(6);

        DeleteNodeInBST solution = new DeleteNodeInBST();
        TreeNode result = solution.solve(node, 3);

        System.out.print("Hello");
    }
}

/*

             15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 10


             4(5)
          /       \
         3         7
        / \       /  \
       1   (4)   6    8
      / \       /
        2      5


        4 3 7 1 -1 6 8 -1 2 5 -1 -1 -1 -1 -1 -1 -1

                           4
                     3          7
                  1           6    8
                     2      5



        3 1 7 -1 2 5 -1 -1 -1 4 6 -1 -1 -1 -1

                        3
                  1            7
                      2      5
                          4   6


                      after deleting 3
                            1
                                2
                                    7
                                 5
                              4    6

                preorder: 1 2
*/
