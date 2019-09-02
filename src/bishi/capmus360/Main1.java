package bishi.capmus360;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by GaryLee on 2019-08-31 15:59.
 * 最多字符串个数
 * 比如abcc 有 a b c ab bc cc abc bcc abcc
 * 只需要算每个字符最大即可
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hashMap.containsKey(c)) {
                System.out.println("zzz:"+hashMap.get(c));
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else
            hashMap.put(c,1);
        }

        int max = Integer.MIN_VALUE;
        for(int i:hashMap.values())
            max = Math.max(max,i);
        System.out.println(max);

    }
}
