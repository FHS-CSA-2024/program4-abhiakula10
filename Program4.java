//Youre on your own!!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a = 475;
        int b = 821;
        int c = 369;
        int d = 562;
        Scanner numScanner = new Scanner(System.in);
        a = numScanner.nextInt();
        b = numScanner.nextInt();
        c = numScanner.nextInt();
        d = numScanner.nextInt();
        int sum = a+b+c+d;
        double average = sum/4.0;
        System.out.println(" Sum is " + sum);
        System.out.println(" Average is " + average);
    }
}


//Paste console output below:
/*
Assign 4 three-digit number to four different variables.
Then have the computer sum them and store the sum in a fifth variable.
Compute the average and store the answer in a sixth variable.
Print out the results.
Use the numbers 475, 821, 369, and 562 for your test data.
Notice the extra space between the word “IS” and the number “2227” and the blank line between the two lines of output.
Requirements:
Read user input data
Store input data in 4 separate variables
Store sum in a separate variable
Store average in a separate variable
Output average with decimal places
Can be more than 2
Sample Output:
The sum of the four numbers is 2227

The average of the four numbers is 556.75



*/
