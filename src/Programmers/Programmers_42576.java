package Programmers;

import java.util.*;

public class Programmers_42576 {
    public static void main(String[] args) {
        String[] start = {"mislav", "stanko", "mislav", "ana"};
        String[] end = {"stanko", "ana", "mislav"};
        String answer = "";
        Arrays.sort(start);
        Arrays.sort(end);
        int i;
        for (i = 0; i < end.length; i++) {
            System.out.println("start: " + start[i] );
            System.out.println("end: " + end[i]);
            if(!start[i].equals(end[i])) {
                System.out.println(start[i]);
                break;
            }
            System.out.println(i);
        }
        System.out.println(start[i]);
//        String result = "";
//        Arrays.sort(start);
//        Arrays.sort(end);
//        for (int i = 0; i<end.length; i++) {
//            if(!start[i].equals(end[i])) {
//                result = start[i];
//            }
//        }
//        System.out.println(result);
//        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        for (int i =0; i< start.length; i++) {
//            list.add(start[i]);
//        }
//        for (int i =0; i< end.length; i++) {
//            list2.add(end[i]);
//        }
//        System.out.println(list);
//
//        for (int i = list.size() -1; i>=0; i--) {
//            for (int j = list2.size() -1; j>=0; j--) {
//                if(list.get(i).equals(list2.get(j))) {
//                    list.remove(i);
//                    list2.remove(j);
//                    break;
//                }
//            }
//        }
//
//        String result = list.get(0);
//        System.out.println(result);

//        for (int i =0; i< list.size(); i++) {
//            for (String data: end) {
//                System.out.println("list: " +list.get(i));
//                System.out.println("data: " +data);
//                if(list.get(i).equals(data)) {
//                    System.out.println(list.get(i));
//                    list.remove(i);
//                }
//            }
//        }
        //인덱스가 지워지기때문에 리스트의 크기는줄어들어서 kiki밖에 안나옴 그래서 반대로해야함

//        System.out.println(list);

    }
}
