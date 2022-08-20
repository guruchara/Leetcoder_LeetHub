var findReplaceString = function(S, indexes, sources, targets) {
    const n = indexes.length;
    const chars = S.split("");
   
    for (let i = 0; i < n; i++) {
        const [index, source, target] = [indexes[i], sources[i], targets[i]];
        
        if (S.substring(index).startsWith(source)) {
            replaceChars(chars, index, source, target);
        }
    }
    
    return chars.join("");
    
    
    function replaceChars(chars, start, source, target) {
        chars[start] = target;
        
        for (let i = 1; i < source.length; i++) {
            chars[start + i] = "";
        }
    }
};