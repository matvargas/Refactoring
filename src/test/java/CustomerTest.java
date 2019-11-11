import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTest {
    @Test
    public void statementTest() {
        Customer customer = new Customer("customer");

        Movie interstellar = new Movie("Interstellar", 25);
        Movie scream = new Movie("Scream", 30);
        Movie fastAndFurious = new Movie("Fast and Furious", 15);
        Movie inception = new Movie("Inception", 13);
        Movie it = new Movie("It", 12);
        Movie revenant = new Movie("revenant", 20);
        Movie ghost = new Movie("Ghost", 5);

        Rental rental = new Rental(interstellar, 15);
        Rental rental2 = new Rental(scream, 15);
        Rental rental3 = new Rental(fastAndFurious, 15);
        Rental rental4 = new Rental(inception, 15);
        Rental rental5 = new Rental(it, 15);
        Rental rental6 = new Rental(revenant, 15);
        Rental rental7 = new Rental(ghost, 15);

        customer.addRental(rental);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);
        customer.addRental(rental5);
        customer.addRental(rental6);
        customer.addRental(rental7);

        Assert.assertEquals(customer.statement(), "java.Rental Record for customer\n" +
                "\tInterstellar\t0.0\n" +
                "\tScream\t0.0\n" +
                "\tFast and Furious\t0.0\n" +
                "\tInception\t0.0\n" +
                "\tIt\t0.0\n" +
                "\trevenant\t0.0\n" +
                "\tGhost\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 7 frequent renter points");
    }
}
