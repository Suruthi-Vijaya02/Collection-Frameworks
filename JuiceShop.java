import java.util.*;

public class JuiceShop {
    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList<>();
        JuiceShop obj = new JuiceShop();
        Boolean running= true;

            System.out.println("1 to add");
            System.out.println("2 to remove");
            System.out.println("3 to get a juice");
            System.out.println("4 to display available");
            System.out.println("5 to check");
            System.out.println("any other key to exit");

        while (true) {
            Scanner sc = new Scanner(System.in);
           
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter available juice to add");
                    String s = sc.next();
                    item.add(s);
                    break;

                case 2:
                    System.out.println("enter sold juice to remove");
                    String R = sc.next();
                    item.remove(R);
                    break;

                case 3:
                    System.out.println("enter juice name to buy");
                    int p = sc.nextInt();
                    if (p < 0 || p >= item.size()) {
                        System.out.println("invalid option");
                    } else {
                        System.out.println(item.get(p));
                        item.remove(p);
                    }
                    break;

                case 4:
                    obj.display(item);
                    break;

                case 5:
                    System.out.println("what item you want to check");
                    String q = sc.next();
                    System.out.println(item.contains(q));
                    break;

                default:
                running= false;
                    return;
            }
        }
    }

    void display( ArrayList<String> item) {
        if (item.isEmpty()) {
            System.out.println("no items to buy");
        } else {
            for (int j = 0; j < item.size(); j++) {
                System.out.println(item.get(j));
            }
        }
    }
}

