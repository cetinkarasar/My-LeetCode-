class Solution {
    public int maxVowels(String s, int k) {

        char[] sb = s.toCharArray();
        int maxVowels = 0;

        for (int i = 0; i < k; i++){
            if(vowels(sb[i])){
                maxVowels++;
            }
         }
         int currentVowels = maxVowels;
         for(int i = k; i < s.length(); i++){
            if(vowels(sb[i])){
                currentVowels++;

            }
            if(vowels(sb[i - k])){
                currentVowels--;
            }

            maxVowels = Math.max(currentVowels, maxVowels);

         }
         return maxVowels;


        
    }
    public boolean vowels(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }


}