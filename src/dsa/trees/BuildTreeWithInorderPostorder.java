package dsa.trees;

import java.util.ArrayList;

public class BuildTreeWithInorderPostorder {

    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        TreeNode root = new TreeNode(0);

        if (postorder.size() == 0) return null;

        int rootValue = postorder.get(postorder.size() - 1);
        root.val = rootValue;

        int rootValueIndexInInOrder = inorder.indexOf(rootValue);

        if (postorder.size() == 1) return root;

//        if(postorder.size() == 2) {
//            root.left = new TreeNode(postorder)
//        }

        root.left = buildTree(
                new ArrayList<>(inorder.subList(0, rootValueIndexInInOrder)),
                new ArrayList<>(postorder.subList(0, rootValueIndexInInOrder)));

        root.right = buildTree(
                new ArrayList<>(inorder.subList(rootValueIndexInInOrder + 1, inorder.size())),
                new ArrayList<>(postorder.subList(rootValueIndexInInOrder, inorder.size() - 1)));

        return root;
    }
}

class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        inorder.add(6);
        inorder.add(1);
        inorder.add(3);
        inorder.add(2);

        postorder.add(6);
        postorder.add(3);
        postorder.add(2);
        postorder.add(1);

        TreeNode finalTree = new BuildTreeWithInorderPostorder().buildTree(inorder, postorder);
        PrintTree.print(finalTree);
    }
}
