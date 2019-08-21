package bishi.bilibili;

import java.util.Scanner;

/**
 * Created by GaryLee on 2019-08-20 18:58.
 * 原地反转英文句子
 * input:   i'm a student.
 * output:  student. a i'm
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input==null)
            System.out.println(" ");
        String[] strs = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=strs.length-1;i>=0;i--)
            stringBuilder.append(strs[i]+" ");
        stringBuilder.deleteCharAt(input.length());
//        stringBuilder.reverse();
//        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);
    }
}
