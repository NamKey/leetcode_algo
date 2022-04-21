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
// 재귀로 풀면 더 복잡해짐
class Solution {
    public int closestValue(TreeNode root, double target) {
        int currentVal = root.val;
        int closest = root.val;
        
        while (root != null) {
            currentVal = root.val;
            closest = Math.abs(currentVal - target) < Math.abs(closest - target) ? currentVal : closest;
            root = target < root.val ? root.left : root.right;
        }
        
        return closest;
    }
}