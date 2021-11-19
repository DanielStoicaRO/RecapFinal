package com.sda.recapFinalExercises;

public class JavaExercises {
    public static void main(String[] args) {

//       EXE 1 EVEN NUMBERS
//        write a program witch prints the even numbers in 1 and 100 increase order
//        solution 1 iterate over the numbers over 1 and 100
//        if "i" is even print "i"

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("--");
//
//        for (int i = 100; i >= 1; i--) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("--");
//
//        int i = 1;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            } i++;
//        }

        //======================================================

//       EXE 2 SUM OF NUMBERS 100
//write a program witch read integer from user and stop by display "done" when the sum exceed 100
//        solution 1 declare a variable to store the SUM, read value from the user and add to SUM as long < 100
//        when SUM > 100 display DONE

//        VAR1 - mea
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input 2 number: ");
//        Integer number1 = scanner.nextInt();
//        Integer number2 = scanner.nextInt();
//        Integer sumOfNumbers = number1 + number2;
//
//        if (sumOfNumbers <= 100) {
//            System.out.println(sumOfNumbers);
//        } else
//            System.out.println("Done, sum exceed 100");

//        Var 2 on net
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter val");
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter nr");
//            sum += scanner.nextInt();
//            if (sum > 100) {
//                break;
//            }
//        }
//        System.out.println("Done " + sum);

//======================================================

//        EXE 3 STRICT DIVIDER
//create a program that display the SUM of strict divider of int given by user
//exe: 6 strict divider = 1,2,3
//        strict divider of n are <= n/2
//        if n % i == 0 ==> i is divider of n
//        1. take input from user
//        2. iterate over all divider with loop n/2
//        3. if "i" is divider of n, add i to SUM
//        4. display SUM

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("SUM: ");
//        System.out.println(sum);
//        System.out.println("SUM + N: ");
//        System.out.println(sum + n);

//======================================================

//        EXE 4 PRIME NUMBER
//        write a program that read a positive number N from user, that indicate is prime or not!?
//        prime number = N / dividers is 1 or N
//        Ex.: Prime Number : 3, 5, 7 //  Not Prime: 10,15
//        1. iterate over all dividers except 1 and N !
//        2. if "i" is a divider of N, then N is not Prime
//        3. N is prime if not divider are found

//        VAR 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Input number to be check prime or Not: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i < n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum == 1 ? " is Prime" : " Not Prime");

//        VAR 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Input number to be check prime or Not: ");
//        int n = scanner.nextInt();
//        boolean isPrime = true;
//
//        for (int i = 2; i < n / 2; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(isPrime ? " is Prime" : " not Prime");

//======================================================

//        EXE 5 MAX and MIN
//        a program that read a sequence of positive integers
//        the program stop when user give a negative value and show max and min of numbers
//        Ex.: 6,0,5,7,-1 => max = 7, min = 0
//        Ex.: n = 3, min = 3, max = 3;
//        n = 5, min = 3, max = 5; if n > max
//        1. read first value from user and take it as max and min in 2 variable max and min
//        2. keep update min and max as long as user give positive numbers
//        3. display result when user give negative numbers
//VAR 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number: ");
//
//        int n = scanner.nextInt();
//        int max = n;
//        int min = n;
//
//        while (true) {
//            n = scanner.nextInt();
//            if (n < 0) {
//                break;
//            }
//            if (n > max) {
//                max = n;
//            }
//            if (n < min){
//                min = n;
//            }
//        }
//        System.out.println("max: " + max + "   min: " + min);

//VAR 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number: ");
//
//        int n = scanner.nextInt();
//        int max = n;
//        int min = n;
//
//        if (n >= 0) {
//            while (true) {
//                n = scanner.nextInt();
//                if (n < 0) {
//                    break;
//                }
//                max = n > max ? n : max;
//                min = n < min ? n : min;
//            }
//        }
//        System.out.println("max: " + max + "   min: " + min);

//======================================================

//   EXE 6 SUM OF DIGITS
//        write a program that display the SUM of digits of numbers input by user
//       Ex.: 123 = 6
//        read numbers from user
//        keep extracting digits using % and division operator + add to SUM, display SUM

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input number: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        System.out.println("The SUM is: " + sum);

//======================================================
//   EXE 7 FIBONACCI
//      F  is a sequence of numbers where the first 2 numbers in sequence are 1 and 1 then each additional number is the sum of previous numbers
//        Ex.:  1, 1, 2, 3, 5, 8, 13, 21, 34
//        write a program that read int N and displays the Nth Fibonacci
//     Ex.: n = 4,  => 1+1=2, 1+2=3  / 2 steps
//     Ex.: n = 6,  => 1+1=2, 1+2=3, 2+3=5, 3+5=8 / 4 steps / to get the Nth F we need n-2 steps
//  1 + 1 = 2
//  V1 + V2 = Results
// Results = V1 + V2
//        V1 = V2
//        V2 = Results

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Display the Nth FIBONACCI Number (1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377......) : ");
//        int n = scanner.nextInt();
//        int result = 0;
//        int v1 = 1;
//        int v2 = 1;
//
//        for (int i = 1; i <= n - 2; i++) {
//            result = v1 + v2;
//            v1 = v2;
//            v2 = result;
//        }
//        System.out.println("Result = " + (result == 0 ? 1 : result));

//======================================================
//   EXE 8 String with Space
//        display a string with a space after each char
// use charAt() method
//iterate on String with FOR, variable i start from 0, index of last char in string length-1.
//        display char concatenated with a space

//        String message = "String With Space";
//        for (int i = 0; i <= message.length()-1; i++) {
//
//            System.out.print(message.charAt(i) + " ");
//        }

//======================================================
//   EXE 9 PALINDROME
//     check string is a palindrome?!
//        EX.: ABA, 12321

//        String example = "ABA";
//        boolean isPalindrome = true;
//
//        for (int i = 0, j = example.length() - 1; i < j; i++, j--) {
//            if (example.charAt(i) == example.charAt(j)) {
//                continue;
//            }
//            isPalindrome = false;
//            break;
//        }
//
//        System.out.println("String is: " + example);
//        System.out.println(isPalindrome ? "is Palindrome" : "Not Palindrome");

//======================================================
//   EXE 10 NUMBER OF LINES
//        displays the number of lines counted by user input

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//======================================================
//   EXE 11 PYRAMID OF STARS

//        Scanner scanner = new Scanner(System.in);
//        int stars = scanner.nextInt();
//
//        for (int i = 1; i <= stars; i++) {
//            for (int j = 1; j <= stars - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //======================================================
//   EXE 12 LOTTERY TICKET
        // we store the 6 numbers on the lottery ticket
        // using an array of int with 6 elements
//        int[] ticket = new int[6];
//        Random random = new Random();
//        int noOfGeneratedNumbers = 0;
//        while (noOfGeneratedNumbers < ticket.length) {
//            // we generate a number between 1 and 30
//            // random.nextInt(30) generate a number between 0 and 29
//            // by adding 1 we get numbers between 1 and 30
//            int luckyNumber = random.nextInt(30) + 1;
//            boolean isUnique = true;
//            // we check if the generated number is unique
//            // that means that is not already on the ticket
//            for (int i = 0; i < noOfGeneratedNumbers; i++) {
//                if (luckyNumber == ticket[i]) {
//                    isUnique = false;
//                }
//            }
//            if (isUnique) {
//                ticket[noOfGeneratedNumbers] = luckyNumber;
//                noOfGeneratedNumbers++;
//                //ticket[noOfGeneratedNumbers-1] = luckyNumber;
//            }
//        }
//        System.out.println("The lucky numbers are:");
//        for (int i = 0; i < ticket.length; i++) {
//            System.out.print(ticket[i] + " ");
//        }





    }
}



