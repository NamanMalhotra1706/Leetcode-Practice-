// Minimum Depth of Binary Tree

import java.util.LinkedList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class depthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;
        LinkedList<TreeNode> tree = new LinkedList<TreeNode>();
        tree.offer(root);

        while (!tree.isEmpty()) {
            int size = tree.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = tree.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    tree.offer(node.left);
                }
                if (node.right != null) {
                    tree.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
