package DominoHasAItemsProject;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to Domino's");
        System.out.println("Please select the items:");
        System.out.println("Choose online item - press 1");
        System.out.println("Choose offline item - press 2");

        Scanner sc = new Scanner(System.in);
        int press = sc.nextInt();

        Domino d = new Domino();

        if (press == 1) {
            System.out.println("You chose online item");
            d.a.placeOrder();
        } else if (press == 2) {
            System.out.println("You chose offline item");
            d.s.placeOrder();
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("Thank you for buying!");
    }
}
