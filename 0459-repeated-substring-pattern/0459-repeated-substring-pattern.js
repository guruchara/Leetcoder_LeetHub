/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
           let x1=s+s;
        
        let x2=x1.substring(1,x1.length-1);
        
        if(x2.includes(s))
            return true;
        return false;
};