package DominoHasAItemsProject;

import java.util.Scanner;

public class Staff {
    public void placeOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is offline Domino's service");
        System.out.println("Enter item to order (pizza/burger):");
        String item = sc.nextLine().toLowerCase();

        System.out.println("To confirm order, type 'yes':");
        String confirm = sc.nextLine().toLowerCase();

        if (confirm.equals("yes")) {
            Order o = new Order();
            if (item.equals("pizza")) {
                o.pizza();
            } else if (item.equals("burger")) {
                o.burger();
            } else {
                System.out.println("Sorry, this item is not available.");
            }
        } else {
            System.out.println("Order canceled.");
        }
    }
}

