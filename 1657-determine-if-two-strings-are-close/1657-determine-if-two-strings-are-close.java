class Solution {
    public boolean closeStrings(String word1, String word2) {
        int [] frekans = new int[26];
        int [] frekans1 = new int[26];

        for(char c: word1.toCharArray()){
            frekans[c - 'a']++;
        }
        for(char c: word2.toCharArray()){
            frekans1[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(frekans[i] == 0 && frekans1[i] != 0 || frekans1[i] == 0 && frekans[i] != 0){
                return false;
            }
        }
        Arrays.sort(frekans);
        Arrays.sort(frekans1);

        return Arrays.equals(frekans, frekans1);

        
    }
}