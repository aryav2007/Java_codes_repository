class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        StringBuilder sc = new StringBuilder();
        for(int i=0;i<Math.max(n1,n2);i++){
            if(i<n1){
                sc.append(word1.charAt(i));
            }
            if(i<n2){
                sc.append(word2.charAt(i));
            }
        }
        return sc.toString();
    }
}