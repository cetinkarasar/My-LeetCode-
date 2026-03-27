class Solution {
    public String removeStars(String s) {
        Stack<Character> sb = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '*'){
                sb.pop();
            }
            else{
                sb.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c: sb){
            result.append(c);
        }

        return result.toString();
        
    }
}