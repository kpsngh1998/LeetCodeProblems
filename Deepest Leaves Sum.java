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
    public int deepestLeavesSum(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int sum = 0;
        
        while(queue.size()>0){
            int sz = queue.size();
            int tempSum = 0;
            
            for(int i=0; i<sz; i++){
                TreeNode temp = queue.remove();
                tempSum += temp.val;
                
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            sum = tempSum;
        }
        
        return sum;
    }
}