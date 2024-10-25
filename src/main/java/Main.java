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


        //Exercise 2.4

//        Create a TicketMachine object on the object bench.
//        Upon viewing its methods, getBalance, getPrice, insertMoney, printTicket.
//        Use getPrice method to view the value of the price of the tickets that was set when this object was created.
//                Use insertMoney method to simulate inserting an amount of money into the machine.
//        Use getBalance to check that the machine has a record of the amount inserted.
//        You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the printTicket method. A facsimile ticket should be printed in the BlueJ terminal window.

        //Exercise 2.5

        //Exercise 2.6
        // public class Student {}
        // public class LabClass{}
        // Exercise 2.7
        //Yes. Once change public class to class public an error message is displayed: java: <identifier> expected

        //Exercise 2.8 - With or without the word public it is possible to run the program.

        //Exercise 2.9
//
//        public class Main {
//            public static void main(String[] args) {
//                System.out.println("Naive Ticket running.");
//
//                TicketMachine lucky = new TicketMachine(10);
//                System.out.println(lucky.getPrice());
//                System.out.println(lucky.insertMoney(20));
//                System.out.println(lucky.getBalance());
//                System.out.println(lucky.printTicket());
//                System.out.println(lucky.getBalance());

        //FIELDS: price, balance, total
        //CONSTRUCTOR: TicketMachine
        //METHODS:TicketMachine, getPrice, insertMoney, printTicket, getBalance

        //Exercise 2.10
        //The constructor method do not have any return, while the other methods has some kind of return type.

        //Exercise 2.11
        //private int count; - type: int
        //private Student representative; - type: Student
        //private Server host; - type Server

        //Exercise 2.12
        //private boolean alive; - type: boolean(true or false)
        //private Person tutor; - type: Person
        //private Game game; - type: Game

        //Exercise 2.13
//        Edit the TicketMachine class to try different orderings. After each change, close the editor.
//        Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are possible?
        // Yes it throws an error
//        Check by pressing the compile button to see if there is an error message.
//                Make sure that you reinstantiate the original version after your experiments!
        // java: <identifier> expected

        //Exercise 2.14
        // Yes a semicolon states the end of the line of code
        //Exercise 2.15
        // int status;
        //Exercise 2.16
        // A Student constructor
        //Exercise 2.17
        //public Book(String title, double price)
        // 2 fields. title is a String and price is a double

        //Exercise 2.18
        // A book may have the following field names: title, author, format, color, numberOfPages



    }
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
}