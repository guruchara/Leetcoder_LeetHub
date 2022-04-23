class Solution {
   static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) 
   {
       // we are checking here if target ==0 then simply add and return 
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }
// iterate for loop 
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

         // if above condition not follow then we execute below condition             
            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}