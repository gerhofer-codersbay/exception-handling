package com.codersbay.gerhofer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidUserException {

        Integer integer = readNumber();
        System.out.printf("The number that was entered is %d\n", integer);

        User user = UserManager.findUser(4L);
        System.out.printf("The user with id %d has name %s\n", 4L, user.getName());

        try {
            UserManager.addUser(7L, "Maria");
            System.out.println("Added Maria");

            UserManager.addUser(9L, "Pi"); // throws InvalidNameException
            System.out.println("Added Pi");

            UserManager.addUser(null, "Johannes"); // throws InvalidUserException
            System.out.println("Added Johannes");
        } catch (InvalidUserException e) {
            e.printStackTrace();
            System.out.println("Could not create user");
        } finally {
            System.out.println("finally!");
        }

        System.out.println("After Try Catch Block");

    }

    private static Integer readNumber() {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (number == 0) {
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("That was not a number");
            }
        }

        return number;
    }
}
