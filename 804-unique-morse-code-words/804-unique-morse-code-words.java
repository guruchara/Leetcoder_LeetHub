class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> hs = new HashSet<>();
        for (String word : words) 
            
            hs.add(transformMorse(word, arr));
        return hs.size();
    }
    private String transformMorse(String word, String[] arr) {
        
        StringBuilder build = new StringBuilder();
        
        for (char c : word.toCharArray())
            
            build.append(arr[(int)c - 97]);
        
        return build.toString();
    }
}