package dsa.trees;

import java.lang.reflect.Array;
import java.util.*;

public class VerticalOrderTraversalTree {

    ArrayList<ArrayList<Integer>> result;

    TreeMap<Integer, TreeMap<Integer, LinkedList<Integer>>> map = new TreeMap<>();

    int level = 0;
    int height = 0;

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

        if (A == null || A.val == -1) return result;

        TreeMap<Integer, LinkedList<Integer>> levelMap = map.get(level);
        if (levelMap == null) {
            map.put(level, new TreeMap<Integer, LinkedList<Integer>>());
            levelMap = map.get(level);
        }

        LinkedList<Integer> sameLevelList = levelMap.get(height);
        if(sameLevelList == null) sameLevelList = new LinkedList<>();
        sameLevelList.add(A.val);
        levelMap.put(height, sameLevelList);
        map.put(level, levelMap);

        verticalOrderTraversal2(A.left, -1, height + 1);
        verticalOrderTraversal2(A.right, 1, height + 1);

        result = new ArrayList<>(map.size());
        int arrPos = 0;

       ArrayList<Integer> mapKeys =  new ArrayList<>(map.keySet());

        for(int i = 0; i<map.size(); i++) {
            TreeMap<Integer, LinkedList<Integer>> eachTreeMap = map.get(mapKeys.get(i));

            LinkedList<Integer> entireListOfSameHeight = new LinkedList<>();
            for(Integer key : eachTreeMap.keySet()) {

                for(Integer value : eachTreeMap.get(key)) {
                    entireListOfSameHeight.add(value);
                }
            }

            result.add(arrPos, new ArrayList<>(entireListOfSameHeight));
            arrPos++;
        }

        return result;
    }

    public void verticalOrderTraversal2(TreeNode A, int level, int height) {

        if (A == null || A.val == -1) return;

        TreeMap<Integer, LinkedList<Integer>> levelMap = map.get(level);
        if (levelMap == null) {
            map.put(level, new TreeMap<Integer, LinkedList<Integer>>());
            levelMap = map.get(level);
        }

        LinkedList<Integer> sameLevelList = levelMap.get(height);
        if(sameLevelList == null) sameLevelList = new LinkedList<>();
        sameLevelList.add(A.val);
        levelMap.put(height, sameLevelList);
        map.put(level, levelMap);

        verticalOrderTraversal2(A.left, level - 1, height + 1);
        verticalOrderTraversal2(A.right, level + 1, height + 1);

    }
}

class MainVerticalOrderTraversalTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(200);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(12);
        root.left.left.left = new TreeNode(6);

        root.right.left = new TreeNode(44);
        root.right.right = new TreeNode(100);

        root.right.right.left = new TreeNode(33);
        root.right.right.right = new TreeNode(443);

        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(5);

        root.right.right.left.right.left = new TreeNode(45);

        root.right.right.left.right.left.left = new TreeNode(111);

//        TreeNode root = new TreeNode(460);
//
//        root.left = new TreeNode(3871);
//        TreeNode node3871 = root.left;
//        root.right = new TreeNode(4698);
//        TreeNode node4698 = root.right;
//
//        TreeNode node8399 = node3871.left;
//        node8399.val = 8399;
//        TreeNode n504 = node3871.right;
//        n504.val = 504;
//        TreeNode n4421 = node4698.left;
//        n4421.val = 4421;
//        TreeNode n7515 = node4698.right;
//        n7515.val = 7515;
//
//        // doubt
//        TreeNode n4167 = node8399.left;
//        n4167.val = 4167;
//        TreeNode n5727 = n504.left;
//        n5727.val = 5727;
//        TreeNode n3096 = n4421.right;
//        n3096.val = 3096;
//        TreeNode n7389 = n7515.right;
//        n7389.val = 7389;
//        TreeNode n434 = n7515.right;
//        n434.val = 434;
//
//        TreeNode n2667 = n4167.left;
//        n2667.val = 2667;
//        TreeNode n1969 = n5727.left;
//        n1969.val = 1969;
//        TreeNode n5661 = n4167.right;
//        n5661.val = 5661;
//        TreeNode n7815 = n5727.right;
//        n7815.val = 7815;
//        TreeNode n3006 = n3096.right;
//        n3006.val = 3006;
//        TreeNode n6693 = n434.right;
//        n6693.val = 6693;
//        TreeNode n6906 = n7389.right;
//        n6906.val = 6906;
//
//        TreeNode n4292 = n3006.left;
//        n4292.val = 4292;
//        TreeNode n9750 = n6693.left;
//        n9750.val = 9750;


        VerticalOrderTraversalTree rightViewOfTree = new VerticalOrderTraversalTree();
        System.out.println(rightViewOfTree.verticalOrderTraversal(root));
    }
}

/*

                             200
                          2         3
                      4      44         100
                   6     12        33        443
                             10         5
                                   45
                             111




                                                            Test Case Tree:

                                                              460
                                              3871                          4698
                                8399                         504/4421                   7515
                          -1                 4167L/5727R                    3096/434                   7389

                             2667 R/1969 R                 5661 L/7815 L            3006 L/ 6693 L          6906 L
                                                           4292 R/9750 R

* */
