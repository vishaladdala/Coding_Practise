/*
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"

Explanation: Originallay it needs to be "1(2(4)())(3()())", 
but you need to omit all the unnecessary empty parenthesis pairs. 
And it will be "1(2(4))(3)".
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class StringFromBinaryTree {
    public String tree2str(TreeNode t) {
       if (t == null){
           return "";
       }
       if ( t.left == null && t.right == null){
           return t.val+ "";
       }
        
       if( t.right == null){
           return t.val + "("+tree2str(t.left)+")";
       }
       else{
           return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
       }
}}{
    public String tree2str(TreeNode t) {
       if (t == null){
           return "";
       }
       if ( t.left == null && t.right == null){
           return t.val+ "";
       }
        
       if( t.right == null){
           return t.val + "("+tree2str(t.left)+")";
       }
       else{
           return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
       }
}}