
// creating an integer array, getting input for 5 numbers and printing their sum

import java.util.Scanner;
public class arrayMarks {
    public static void main(String args[])
    {
        int[] score=new int[5];         //creating an array and fixing the index value
        Scanner scan=new Scanner(System.in);

        //getting inputs from the user for score[0],[1],[2],[3],[4]

        score[0]=scan.nextInt();
        score[1]=scan.nextInt();
        score[2]=scan.nextInt();
        score[3]=scan.nextInt();
        score[4]=scan.nextInt();

        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);   //printing the total score

    }
}
