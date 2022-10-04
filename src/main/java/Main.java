public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String exampleOne = "Hello World";
        String exampleTwo = "   fly me   to   the moon  ";
        String exampleThree = "pizza is the best";

        System.out.println("Example One : " + solution.lengthOfLastWord(exampleOne));
        System.out.println("Example Two : " + solution.lengthOfLastWord(exampleTwo));
        System.out.println("Example Three : " + solution.lengthOfLastWord(exampleThree));
    }
}
