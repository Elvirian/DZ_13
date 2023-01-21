

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "abc";
        List<String> arrayList = Arrays.asList("abc", "abs", "acb", "acb", "hdj", "dkf", "kfk", "fkf", "abc", "acb");
        List<Integer> ListInt = Arrays.asList(1,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9);
        List<Integer> resultList = toList(new int[]{1, 2, 3});
        System.out.println("toList//"+resultList);
        countOccurance(arrayList, a);
        System.out.println("findUnique//"+ findUnique(ListInt));

        calcOccurance(arrayList);
        System.out.println("findOccurance//"+findOccurance(arrayList));






    }

    public static void countOccurance(List<String> a, String b) {
        int s = 0;
        for (String v : a) {
            if (v.equals(b)) {
                s++;
            }
        }
        System.out.println("countOccurance//" + b + ": Зустрічается = " + s);
    }

    public static List toList(int[] a) {
        List<String> list = new ArrayList<>();
        for (int j : a) {
            list.add(String.valueOf(j));
        }
        return list;
    }

    public static List<Integer> findUnique (List<Integer> myListInt) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < myListInt.size(); i++) {
            if(!resultList.contains(myListInt.get(i))) {
                resultList.add(myListInt.get(i));
            }
        }

        return resultList;
    }
    public static void calcOccurance(List<String> strList) {
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            if(!bufferList.contains(strList.get(i))) {
                bufferList.add(strList.get(i));
                int count = 0;

                for (int j = 0; j < strList.size(); j++) {
                    if(strList.get(i).equals(strList.get(j))) {
                        count++;
                    }
                }

                System.out.println(strList.get(i) + ": " + count);
            }
        }
    }

    public static List<MyStructure> findOccurance(List<String> strList) {
        List<MyStructure> result = new ArrayList<>();
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            if(!bufferList.contains(strList.get(i))) {
                bufferList.add(strList.get(i));
                int count = 0;

                for (int j = 0; j < strList.size(); j++) {
                    if(strList.get(i).equals(strList.get(j))) {
                        count++;
                    }
                }

                result.add(new MyStructure(strList.get(i), count));
            }
        }

        return result;
    }

}

