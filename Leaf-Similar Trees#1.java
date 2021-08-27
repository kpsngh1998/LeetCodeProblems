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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> first = new ArrayList<Integer>();
        List<Integer> second = new ArrayList<Integer>();
        
        createLeafSequence(root1, first);
        createLeafSequence(root2, second);
        
        if(first.size() != second.size()) return false;
        
        for(int i=0; i<first.size(); i++){
            if(first.get(i) != second.get(i))
                return false;
        }
        
        return true;
    }
    
    public void createLeafSequence(TreeNode root, List<Integer> list){
        
        if(root!=null){
            createLeafSequence(root.left, list);
      
            if(root.left == null && root.right==null){
                 list.add(root.val);
            }
            createLeafSequence(root.right, list);
        }
    }
}