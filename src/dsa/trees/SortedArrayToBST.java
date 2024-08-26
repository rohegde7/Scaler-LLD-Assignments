package dsa.trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(final List<Integer> A) {

        int middleElementPosition = A.size() / 2;

        TreeNode root = new TreeNode(A.get(middleElementPosition));

        if (middleElementPosition > 0) {
            root.left = sortedArrayToBST(A.subList(0, middleElementPosition));
        }

        if (middleElementPosition < A.size() - 1) {
            root.right = sortedArrayToBST(A.subList(middleElementPosition + 1, A.size()));
        }

        return root;
    }
}

class MainSortedArrayToBST {
    public static void main(String[] args) {
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        ArrayList<Integer> A = new ArrayList<>();
//        Collections.addAll(A, 1);
        Collections.addAll(
                A, 90, 228, 245, 290, 397, 471, 572, 649, 688, 710, 823, 829, 830, 859, 932, 939, 962
        );

//        Collections.addAll(A, 1, 2, 3);
        TreeNode result = sortedArrayToBST.sortedArrayToBST(A);

        System.out.println(result);
    }
}
