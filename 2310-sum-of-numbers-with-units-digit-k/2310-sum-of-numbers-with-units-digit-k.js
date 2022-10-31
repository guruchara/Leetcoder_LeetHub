/**
 * @param {number} num
 * @param {number} k
 * @return {number}
 */
var minimumNumbers = function(num, k) {
    if (num == 0)
        return 0

    for (let n = 1; n <= 10 && n * k <= num; ++n)
        if ((num - n * k) % 10 == 0)
            return n;
    
    return -1;
};