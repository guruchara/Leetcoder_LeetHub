class Solution{
public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;;
        int n = grid[0].length;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }

        while (k > 0) {
            int temp = list.remove(list.size() - 1);
            list.add(0, temp);
            k--;
        }

        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < m; i++){
            list1.add(list.subList(i * n, (i + 1) * n));
        }

        return list1;  
    }
}