class Solution {
    int max = 1;
    
    public int[] findMode(TreeNode root) {        
        HashMap<Integer, Integer> map = new HashMap<>();
        traverse(root, map);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Integer key: map.keySet()) {
            if(map.get(key) == max) {
                list.add(key);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    
    public void traverse(TreeNode root, HashMap<Integer, Integer> map) {
        if(root == null) return;
        
        if(map.containsKey(root.val)) {
            int count = map.get(root.val) + 1;
            max = Math.max(count, max);
            map.put(root.val, count);
        }
        else {
            map.put(root.val, 1);
        }        
        
        traverse(root.left, map);
        traverse(root.right, map);
    }
}