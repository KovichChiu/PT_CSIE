package Square_and_Cube;

import java.util.Scanner;
/*
 * Problem Description
 * Ali is a primary school student and is learning multiplication of integers. 
 * He has a homework assignment asking for calculate the squares and cubes of integers. 
 * You are asked to write a program to verify the answers of his math homework.
 * 
 * INPUT
 * The first line is an integer which indicates the number of test cases. 
 * Each test case is a number in one line. There are at most 10 cases.
 * 
 * OUTPUT
 * For each test case, output the square and cube of the given number in a line.
 */
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        while(count -- > 0){
            int num = scn.nextInt();
            int square = (int) Math.pow(num, 2);
            int cube = (int) Math.pow(num, 3);
            System.out.println( square +" "+ cube );
        }
         
    }
 
}
