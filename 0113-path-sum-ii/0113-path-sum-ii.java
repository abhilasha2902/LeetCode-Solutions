/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void findPaths(TreeNode node, int sum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;

        path.add(node.val);  

        if (node.left == null && node.right == null && sum == node.val) {
            result.add(new ArrayList<>(path));  
        } else {
            findPaths(node.left, sum - node.val, path, result);
            findPaths(node.right, sum - node.val, path, result);
        }

        path.remove(path.size() - 1);  
    }
}
