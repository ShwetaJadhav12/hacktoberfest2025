class Solution {
    int count =0;
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        kthSmallest(root.left,k);
        count++;
        if(count == k){
            ans = root.val;
        }
        kthSmallest(root.right,k);
        return ans;


        
    }
}
