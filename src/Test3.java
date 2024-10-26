public class Test3 {
    public static void main(String[] args) {
        String s1 = "(){}[]";
        String s2 = "{[()]()}";
        String s3 = "({[)]}";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
}
