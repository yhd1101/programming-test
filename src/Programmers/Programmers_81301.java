package Programmers;

import java.util.HashMap;
import java.util.Set;

public class Programmers_81301 {
    public static void main(String[] args) {
        String s = "twoonefour";

        HashMap<String, String> hash = new HashMap<>();
        hash.put("0", "zero");
        hash.put("1", "one");
        hash.put("2", "two");
        hash.put("3", "three");
        hash.put("4", "four");
        hash.put("5", "five");
        hash.put("6", "six");
        hash.put("7", "seven");
        hash.put("8", "eight");
        hash.put("9", "nine");
        String str = "";
        int result = 0;
        //String replaceAll(String regex, String replacement)
        //문자열내에 있는 정규식 regex와 매치되는 모든 문자열을 replacement문자열로 바꾼 문자열을 반환
        Set<String > keys = hash.keySet();
        for (String key : keys) {
            s= s.replaceAll(hash.get(key), key);
        }


        //내가한 풀이 틀림 이유: 순서가 없음
//        for (String key: keys) {
//            if(s.contains(key)) {
//                str = str +key;
//            }
//            if(s.contains(hash.get(key)) ) {
//                str = str + key;
//            }
//        }
       result = Integer.parseInt(s);
        System.out.println(result);
    }
}
