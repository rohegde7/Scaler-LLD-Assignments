package dsa.trees;

import java.util.ArrayList;
import java.util.HashMap;

public class RightViewOfTree {

    ArrayList<Integer> res = new ArrayList<>();
    int level = 0;
    HashMap<Integer, Integer> levelRightViewMap = new HashMap();

    public ArrayList<Integer> solve(TreeNode A) {

        if(A == null || A.val == -1) return res;

        if(!levelRightViewMap.containsKey(0)) {
            levelRightViewMap.put(level, A.val);
        }

        solve2(A.right, level + 1);
        solve2(A.left, level + 1);

        for(int i = 0; i< levelRightViewMap.size(); i++) {
            res.add(levelRightViewMap.get(i));
        }

        return res;
    }

    public ArrayList<Integer> solve2(TreeNode A, int level) {
        if(A == null) return res;

        if(!levelRightViewMap.containsKey(level)) {
            levelRightViewMap.put(level, A.val);
        }

        solve2(A.right, level + 1);
        solve2(A.left, level + 1);

        return res;
    }
}

class MainRightViewOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(9);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(8);
        root.right.left.right = new TreeNode(3);

        RightViewOfTree rightViewOfTree = new RightViewOfTree();
        System.out.println(rightViewOfTree.solve(root));
    }
}


