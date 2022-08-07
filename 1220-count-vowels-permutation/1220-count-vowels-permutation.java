class Solution {
    
    private HashMap<Integer, String> map;
    private Integer store[][];
    
    public int countVowelPermutation(int n) {
        if (n <= 0) return 0;
        map = new HashMap<>();
        store = new Integer[n + 1][5 + 1];
        Arrays.fill(store[0], 1); 
        
        
        
        // aeiou - 01234
        map.put(0, "1");
        map.put(1, "02");
        map.put(2, "0134");
        map.put(3, "24");
        map.put(4, "0");
        map.put(5, "01234");
        return helper(n, 5);
    }
    
    public int helper(int N, int prevIDX) {
        if (store[N][prevIDX] != null) {
            return store[N][prevIDX];
        } else {
            int ans = 0;
            for (char c : map.get(prevIDX).toCharArray()) {
                int nextIDX = c - '0';
                ans += helper(N - 1, nextIDX);
                ans = ans % 1000000007;
            }
            store[N][prevIDX] = ans;
            return ans;
        }
    }
}