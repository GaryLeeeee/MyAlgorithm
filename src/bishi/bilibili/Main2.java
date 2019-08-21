package bishi.bilibili;

import java.util.*;

/**
 * Created by GaryLee on 2019-08-20 18:58.
 * 把数组排成最小的数
 * input:23 312
 * ouput:23312
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(",");
        List<String> list = new ArrayList<>();
        for(String s:nums)
            list.add(s);
        int min = Integer.MAX_VALUE;
        Collections.sort(list,new LeeComparator());
        String result = "";
        for(int i=0;i<list.size();i++){
            result+=list.get(i);
        }
        System.out.println(result);
    }
    static class LeeComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            String str1 = o1 + o2;
            String str2 = o2 + o1;
            return str1.compareTo(str2);
        }
    }
}
