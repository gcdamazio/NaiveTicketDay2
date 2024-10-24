// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Naive Ticket running.");

        TicketMachine lucky = new TicketMachine(10);
        System.out.println(lucky.getPrice());
        System.out.println(lucky.insertMoney(20));
        System.out.println(lucky.getBalance());
        System.out.println(lucky.printTicket());
        System.out.println(lucky.getBalance());

        //Exercise 2.2 - It returns the insert Money value
        //             - After print ticket and ask for a value it shows ticket price=10 cents and the total =20
        // conclusion: it does not subtract the value of the ticket from the balance

        //Exercise 2.3 - Same behavior as Exercise 2.2 even the insert more or less money than the cost

        TicketMachine verylucky = new TicketMachine(5);
        System.out.println(verylucky.getPrice());
        System.out.println(verylucky.insertMoney(19));
        System.out.println(verylucky.getBalance());
        System.out.println(verylucky.printTicket());
        System.out.println(verylucky.getBalance());


        //






    }
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
}