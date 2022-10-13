//    https://leetcode.com/problems/reverse-words-in-a-string

// Input: s = "the sky is blue"
// Output: "blue is sky the"


class Solution {
    public String reverseWords(String s) {
         String a = "";
        String[] b = s.split(" ");
        
        for(String i : b){
            if(i.trim().isEmpty()) continue;
            a = i +" "+a;
        }
        return a.trim();
    }
}
