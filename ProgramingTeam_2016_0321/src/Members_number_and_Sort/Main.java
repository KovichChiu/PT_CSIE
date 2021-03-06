package Members_number_and_Sort;

import java.util.Scanner;

/*
 * Problem Description
 * The digit sum of a number, say 9122, is just the sum of the digits, 9+1+2+2=14.
 * Given N positive integers, sort these N integers in ascending order of their digit sums. 
 * In the case that two integers have the same digit sum, the smaller integer should appear before the larger one. 
 * For example, both 3128 and 9122 have the same digit sum (i.e., 14). As 3128 < 9122, 3128 should appear before 9122.
 * 
 * INPUT
 * The first line is an integer which indicates the number of test cases. 
 * Each test case consists of two lines.
 * This first line of a test case is an integer indicates N. 
 * The second line of the test case contains N integers delimited by a space.
 * 
 * OUTPUT
 * For each test case, sort N integers based on the rule mentioned in the problem description section. 
 * You should separate the output integers by a space.
 */
 
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        while(count -- > 0){
            int num = scn.nextInt();
            int []data = new int[num];
            for(int i=0;i<data.length;i++){
                data[i] = scn.nextInt();
            }
            for(int i=0;i<data.length;i++){
                for(int j=i+1;j<data.length;j++){
                    if(data[i]>data[j]){
                        int datatmp=data[i];
                        data[i] = data[j];
                        data[j] = datatmp;
                    }
                }
            }
             
            for(int i=0;i<data.length;i++){
                for(int j=i+1;j<data.length;j++){
                    String datastri = data[i]+"";
                    String datastrj = data[j]+"";
                    char []datachari = datastri.toCharArray();
                    int tmpi = 0;
                    for(int ai=0;ai<datachari.length;ai++){
                        tmpi+=datachari[ai]-'0';
                    }
                    char []datacharj = datastrj.toCharArray();
                    int tmpj = 0;
                    for(int ai=0;ai<datacharj.length;ai++){
                        tmpj+=datacharj[ai]-'0';
                    }
                    if(tmpi>tmpj){
                        int datatmp=data[i];
                        data[i] = data[j];
                        data[j] = datatmp;
                    }
                }
            }
            for(int i=0;i<data.length;i++){
                System.out.print(data[i]+((i<data.length-1)?" ":""));
            }
            System.out.println();
        }
         
    }
 
}
