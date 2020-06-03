/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/


class Solution {
    void swap(TreeNode curr)
    {
        if(curr==null)
            return;
        swap(curr.left);
        swap(curr.right);
        
        TreeNode temp;
        temp=curr.left;
        curr.left=curr.right;
        curr.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {
        
        swap(root);
        return root;
        
    }
}