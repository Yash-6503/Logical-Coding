/*
Program to find Fibonacii Series
*/

import java.util.*;

public class Fibonacii{
    void main(){
        try(Scanner sc = new Scanner(System.in);){

            System.out.println("Enter a number : ");
            int n = sc.nextInt();

            if(n < 0){
                IO.println("Please provide positive input.");
                return;
            }

            int first = 0;
            int second = 1;
            int sum = 0;
            for(int i=0; i<=n; i++){
                int third = first + second;
                IO.print(first+" ");
                first = second;
                second = third;
            }

        }catch(Exception e){
            IO.println(e.getMessage());
        }
    }
}