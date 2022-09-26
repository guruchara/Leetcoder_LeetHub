var reverseOnlyLetters = function(s) {
    const A = s.match(/[a-z]/gi);
    return s.replace(/[a-z]/gi, () => A.pop());
};