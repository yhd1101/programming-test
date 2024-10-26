public class ProgramersParentheses {
    public static void main(String[] args) {
        String s = "(()))))";
        boolean answer = true;
        String[] str = s.split("");
        int last = str.length -1;
        if(str[0].equals("(") && str[last].equals(")")) {
            System.out.println(answer);
        } else {
            answer= false;
            System.out.println(answer);
        }
    }
}
