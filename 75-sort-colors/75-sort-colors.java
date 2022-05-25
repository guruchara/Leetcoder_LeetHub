// public class Solution {
// public void sortColors(int[] arr) {
//     int one = 0; 
//     int two = 0;
    
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==0){
//             arr[i] = arr[two];
//             arr[two] = arr[one];
//             arr[one] = 0;
//             one++;
//             two++;
//         }
//         else if(arr[i]==1){
//             arr[i] = arr[two];
//             arr[two] = 1;
//             two++;
//         }
//     }
// }
// }


class Solution {
    public void sortColors(int[] nums) {
          Arrays.sort(nums);        
    }
}