package dsa.trees;

import java.util.ArrayList;

public class LevelOrderTraversal {


    public ArrayList<ArrayList<Integer>> solve(TreeNode root) {
        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
        int level = 0;
        return solve(root, level, solution);
    }

    public ArrayList<ArrayList<Integer>> solve(TreeNode root, int level, ArrayList<ArrayList<Integer>> solution) {
        if (root == null) return solution;

        if (level == solution.size()) {
            solution.add(new ArrayList<>());
        }

        solution.get(level).add(root.val);

        solve(root.left, level + 1, solution);
        solve(root.right, level + 1, solution);

        return solution;
    }
}

class MainLevelOrderTraversal {
    public static void main(String[] args) {
        LevelOrderTraversal lot = new LevelOrderTraversal();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(17);

        System.out.println(lot.solve(root));
    }
}
