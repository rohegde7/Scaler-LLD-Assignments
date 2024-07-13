package dsa.trees;


import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Inorder i = new Inorder();

//        TreeNode tn = new TreeNode(1);
//        tn.left = null;
//        tn.right = new TreeNode(2);
//        tn.right.left = new TreeNode(3);

        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);

        System.out.println(i.inorderTraversal(tn));
    }
}

public class Inorder {
    List<Integer> list = new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }
}
