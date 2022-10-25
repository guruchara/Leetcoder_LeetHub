/**
 * @param {string} num
 * @return {string}
 */
var largestGoodInteger = function(num) {
      if(num.length===0){
           return ''
      }
    
     let arr=["999","888","777","666","555","444","333","222","111","000"]
     
     for(let i=0;i<arr.length;i++){
          if(num.indexOf(arr[i])>=0){
              return arr[i];
          }
     }
    return ''
};
 // public String largestGoodInteger(String num) {
 //        String res = "";
 //        int n= num.length();
 //        if(n==0)
 //            return res;
 //    String arr[]= {"999","888","777","666","555","444","333","222","111","000"};
 //        for(int i=0;i<arr.length;i++){
 //            if(num.indexOf(arr[i])>=0){
 //                return arr[i];
 //            }
 //        }
 //        return res;
        


 