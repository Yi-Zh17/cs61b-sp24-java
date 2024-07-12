public class Dessert {
    // Instance variables
    public int flavor;
    public int price;

    // Static variable that keeps track of the number of desserts created so far
    public static int numDesserts;

    // Constructor
    public Dessert(int flavor, int price) {
        // Set instance variables
        this.flavor = flavor;
        this.price = price;

        // Static variable count + 1
        numDesserts += 1;
    }

    // Method
    public void printDessert() {
        System.out.println(this.flavor + " " + this.price + " " + numDesserts);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
