import java.util.*;
public class BankQueue {
    public static void main(String[] args) {
        LinkedList<String> CustomerQueue = new LinkedList<>();
        System.out.println("press 1 to add customer, 2 to serve customer, 3 to view the current queue, 4 to show nth customer");
        Boolean running=true;
        while (running) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter name of the customer");
                    String name = sc.next();
                    CustomerQueue.addLast(name);
                    System.out.println("**********added**********");
                    break;

                case 2:
                    CustomerQueue.removeFirst();
                    System.out.println("customer left the queue");
                    break;

                case 3:
                    if (CustomerQueue.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("the current Queue is " + CustomerQueue);
                    }
                    break;

                case 4:
                    System.out.println("enter the QueueNumber to display the customer name");
                    int num = sc.nextInt();
                    System.out.println(CustomerQueue.get(num));
                    break;

                default:
                    System.out.println("Exiting");
                    running=false;
                    break;
            }
        }
    }
}

