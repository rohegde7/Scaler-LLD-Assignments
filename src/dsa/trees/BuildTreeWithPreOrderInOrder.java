package dsa.trees;

import java.util.ArrayList;

public class BuildTreeWithPreOrderInOrder {

    public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {

        TreeNode root = new TreeNode(0);

        if (preorder.size() == 0) return null;

        int rootValue = preorder.get(0);
        root.val = rootValue;

        int rootValueIndexInInOrder = inorder.indexOf(rootValue);

        if (preorder.size() == 1) return root;

        root.left = buildTree(
                new ArrayList<>(preorder.subList(1, rootValueIndexInInOrder + 1)),
                new ArrayList<>(inorder.subList(0, rootValueIndexInInOrder)));

        root.right = buildTree(
                new ArrayList<>(preorder.subList(rootValueIndexInInOrder + 1, inorder.size())),
                new ArrayList<>(inorder.subList(rootValueIndexInInOrder + 1, inorder.size())));

        return root;
    }
}

class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> preorder = new ArrayList<>();

        inorder.add(6);
        inorder.add(1);
        inorder.add(3);
        inorder.add(2);

        preorder.add(1);
        preorder.add(6);
        preorder.add(2);
        preorder.add(3);

        TreeNode finalTree = new BuildTreeWithPreOrderInOrder().buildTree(preorder, inorder);
        PrintTree.print(finalTree);
    }
}
