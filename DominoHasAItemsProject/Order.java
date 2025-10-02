package DominoHasAItemsProject;

public class Order {
    public pizza pizza() {
        System.out.println("You choose pizza.");
        pizza p = new pizza();
        p.eat();
        return p;
    }

    public Burger burger() {
        System.out.println("You choose burger.");
        Burger b = new Burger();
        b.eat();
        return b;
    }
}

