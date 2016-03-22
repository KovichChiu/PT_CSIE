package ACM_B2_Sequence;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * Question Description
 * A B2-Sequence is a sequence of positive integers 1 ≤ b1 < b2 < b3 . . . such that all pairwise sums bi +bj , where i ≤ j, are different.
 * Your task is to determine if a given sequence is a B2-Sequence or not.
 * 
 * INPUT
 * Each test case starts with 2 ≤ N ≤ 100, the number of elements in a sequence. 
 * Next line will have N integers, representing the value of each element in the sequence. 
 * Each element bi is an integer such that bi ≤ 10000. 
 * There is a blank line after each test case. 
 * The input is terminated by end of file (EOF).
 * 
 * OUTPUT
 * For each test case you must print the number of the test case, starting from 1, and a message indicating if the corresponding sequence it is a B2-Sequence or not. 
 * See the sample output below. 
 * After each test case you must print a blank line.
 */

public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (scn.hasNextLine()) {
            count++;
            int num = scn.nextInt();
            boolean jujge = true;
            if(num == 0){
                jujge = false;
            }
            int[] data = new int[num];
            for(int i=0;i<data.length;i++){
                data[i] = scn.nextInt();
                if(data[i]<=0){
                    jujge = false;
                }
            }
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<data.length&&jujge;i++){
                for(int j=i+1;j<data.length&&jujge;j++){
                    int sum = data[i]+data[j];
                    if(arr.isEmpty()){
                        arr.add(sum);
                    }else{
                        if(!arr.contains(sum)){
                            arr.add(sum);
                        }else{
                            jujge = false;
                        }
                    }
                }
            }
            if(jujge){
                System.out.println("Case #"+ count +": It is a B2-Sequence.");
            }else{
                System.out.println("Case #"+ count +": It is not a B2-Sequence.");
            }
        }
    }
 
}
