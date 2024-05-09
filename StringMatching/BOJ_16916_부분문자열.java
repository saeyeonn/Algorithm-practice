package StringMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_16916_부분문자열 {
//    static int count = 0;
//    static Queue<Integer> queue = new LinkedList<>();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String toFind = br.readLine();
//
//        char[] strArray = str.toCharArray();
//        char[] toFindArray = toFind.toCharArray();
//
//        int i, j;
//        for (int index = 0; index < strArray.length; index++) {
//            i = index;
//            j = 0;
//            while (strArray[i] == toFindArray[j]){
//                i++; j++;
//
//                if (i >= strArray.length || j >= toFindArray.length) {
//                    break;
//                }
//            }
//            if (j == toFindArray.length) {
//                count++;
//                queue.add(i - toFindArray.length + 1);
//            }
//        }
//        System.out.println(count);
//        while(!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }
//    }
}
