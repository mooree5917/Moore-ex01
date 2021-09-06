/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Moore
 */
package Solution01;
/*
    This is a program that prints the user to enter a name.
    After entering the name the program greets the user with the submitted name.
 */
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        String UsersName;      // The user's submitted name.

        System.out.print("What is your name?: ");
        UsersName = stdin.nextLine();

        System.out.println("Hello, " + UsersName + ", nice to meet you!");
    }
}
