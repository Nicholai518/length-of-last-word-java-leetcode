class Solution {
    public int lengthOfLastWord(String s) {
        // space is our delimiter
        // turn each word / string into a "token"
        String[] tokens = s.split(" ");

        // return the length of the last String token
        return tokens[tokens.length - 1].length();
    }
}
