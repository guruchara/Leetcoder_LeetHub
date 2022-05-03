class Solution {
    
    ArrayList<List<String>> answer;
    
    public List<List<String>> partition(String s) {
        answer = new ArrayList<>();
        solution(s, new ArrayList<String>());
        
        return answer;
    }

	public boolean isPalindrome(String str) {
		
		int length = str.length();
		for(int idx = 0; idx < length/2; idx++) {
			if(str.charAt(idx) != str.charAt(length - 1 - idx)) return false;
		}

		return true;
	}
 
	public void solution(String str, ArrayList<String> asf) {
		
		if(str.length() == 0) {            
            answer.add(new ArrayList<>(asf));
			return;
		}


		// Take out palindromes from the starting of the question string which is left.
		for(int idx = 0; idx < str.length(); idx++) {
			String sub = str.substring(0, idx + 1);
			
			if(isPalindrome(sub)) {
                
                asf.add(sub);
                solution(str.substring(idx + 1), asf);
				// backtrack and remove the palindromic substring added and found the next one starting from the same letter as this one `sub`.
                asf.remove(asf.size() - 1);
			}

		}
		
	}

    
}