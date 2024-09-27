/* AI Chatbot program that takes user name and asks questions about them
 * Steven Driver 09-27-2024
 * Version 1.0 
 */

package trimester1; //This is just for github/VSC testing

import java.util.Scanner;

public class Chatbot2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Introduction */
        System.out.println("Hello! My name is David. What is your first name?");
        String fName = scn.nextLine();
        System.out.println("What is your last name?");
        String lName = scn.nextLine();
        String init = (fName.substring(0, 1) + lName.substring(0, 1)).toUpperCase();

        System.out.println(
                "Nice to meet you, " + fName + "! For the rest of the program, I will refer to you as " + init + ".\n");

        /* Questions */
        // First question
        System.out.println("What is your favorite color?");
        String color = new String(scn.nextLine());
        System.out.println(color + " is a beautiful color!");

        // Second question
        System.out.println("What is your favorite video game?");
        String game = new String(scn.nextLine());
        System.out.println(game + " is a fun game!");

        scn.close();
    }
}
