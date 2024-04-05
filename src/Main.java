import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Pattern Programs");
    }
}


/*
Question 1. Solid Rectangle
* * * * *
* * * * *
* * * * *
* * * * *

int r = 4;  //r = rows
int c = 5;  //c = columns
for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
*/


/*
Question 2. Hollow Rectangle
*****
*   *
*   *
*****


        int r = 4;  //r = rows
        int c = 5;  //c = columns
        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++ ){
                if( i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/


/*
Question 3. Half Pyramid
*
* *
* * *
* * * *

        int r = 4;  //r = rows
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


/*
Question 4. Reverse Half Pyramid
* * * *
* * *
* *
*

        int r = 4;  //r = rows
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


/*
Question 5. Inverted Half Pyramid
      *
    * *
  * * *
* * * *

        int r = 4;  //r = rows
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/


/*
Question 6. Half Pyramid with Numbers
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

       int r = 5;
       for (int i = 1; i <= r; i++){
           for (int j = 1; j <= i; j++){
               System.out.print(j);
           }
           System.out.println();
       }
*/


/*
Question 7. Inverted Half Pyramid with Numbers
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

       int r = 5;
       for (int i = r; i >= 1; i--){
           for (int j = 1; j <= i; j++){
               System.out.print(j);
           }
           System.out.println();
       }
*/


/*
Question 8. Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

       int r = 5;
       int num = 1;
       for (int i = 1; i <= r; i++){
           for (int j = 1; j <= i; j++){
               System.out.print(num+" ");
                num++;
           }
           System.out.println();
       }
*/


/*
Question 9. 0-1 Triangle
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

       int r = 5;
      for (int i = 1; i <= r; i++){
          for(int j = 1; j <= i; j++){
             int sum = i+j;
             if(sum % 2 == 0) {
                 System.out.print("1");
             }
             else{
                     System.out.print("0");
                 }

             }
              System.out.println();
      }

*/