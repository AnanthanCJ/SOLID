package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Actor;
import com.ilp.entity.Celeb;
import com.ilp.entity.Director;

public class Main {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        String mainChoice;
        Scanner scanner = new Scanner(System.in);
        Celeb celeb = new Actor("A1111", "Ramu"); // Liskov 's substitution principle
        Celeb celeb1 = new Celeb("B2222", "Ravi");
        Actor actor = new Actor("C3333", "Raju");
        Director director = new Director("D5555", "jeevan", "Ameen");
        System.out.println("Welcome to Celebs");
        do {
            System.out.println("Enter your options");
            System.out.println("1. Display any celebrity");
            System.out.println("2. Display Actor");
            System.out.println("3. Display Director");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    celeb1.display();
                    break;
                case 2:
                    actor.display();
                    actor.displayRemuneration();
                    actor.displayDateOfBirth();
                    break;
                case 3:
                    director.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");

            mainChoice = scanner.next();

        } while (mainChoice.equals("y"));

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
