public class LowestCommonAncestorinaBST {

    Node LCA(Node root, int n1, int n2) {
        Node res = null;
        if (root == null)
            return res;
        else if ((int) Math.min(n1, n2) <= root.data && (int) Math.max(n1, n2) >= root.data) {
            res = root;
            return res;
        } else if (root.data <= n1 && root.data <= n2) {
            res = root;
            return LCA(root.right, n1, n2);
        } else {
            return LCA(root.left, n1, n2);
        }
    }
    }

