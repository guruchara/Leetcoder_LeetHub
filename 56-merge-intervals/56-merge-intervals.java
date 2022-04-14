class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> answer = new ArrayList<>();
        
        // first We check length to khi 0 nhi he ya fir null to nhi he
        if(intervals.length != 0 || intervals != null){
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            
            // take two variable leneg 
            int start = intervals[0][0];
            int end = intervals[0][1];
            
            for(int[] i: intervals){
                // compare krenege ki new interval ka phla value pre vali value se chhota he kabhi chhota rhta he to max se compare krke aage badayenge 
                if(i[0] <= end){
                    end = Math.max(end, i[1]);
                }
            // kabhi match nhi krta us case pre vale ke first element pre ke last ka ek interval bna denge or start or end me new value kr denge
                else {
                    answer.add(new int[]{start,end});
                    start = i[0];
                    end = i[1];
                }
            }
            // jb hm sabhi interval visit kr lenge to start ki last time value or end value ka interval na lenge
            answer.add(new int[]{start,end}); 
            
        }
        // hmre int [][] return so we convert list into matrix 
        return answer.toArray(new int[0][]); 
    }
}