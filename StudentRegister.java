import java.util.*;

public class StudentRegister {
    public static void main(String[] args) {
        HashMap<String, Integer> register = new HashMap<>();

        System.out.println("*********** press: ");
        System.out.println("1 to add a student");
        System.out.println("2 to remove a student");
        System.out.println("3 to get a student by name");
        System.out.println("4 to get a student by RollNumber");
        System.out.println("5 to check presence of a student name");
        System.out.println("6 to check presence of a student roll no");
        System.out.println("7 to show register");
        System.out.println("Any key to exit ***********");

        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter name and RollNumber of the student");
                    String name = sc.next();
                    int num = sc.nextInt();
                    register.put(name, num);
                    System.out.println("*****Student added successfully*****");
                    break;

                case 2:
                    System.out.println("enter name and RollNumber of the student");
                    String namer = sc.next();
                    register.remove(namer);
                    System.out.println("*****Student removed*****");
                    break;

                case 3:
                    System.out.println("enter name of the student");
                    String p = sc.next();
                    if (register.containsKey(p)) {
                        System.out.println(register.get(p));
                    } else {
                        System.out.println("invalid");
                    }
                    break;

                case 4:
                    System.out.println("enter RollNumber of the student");
                    int r = sc.nextInt();
                    if (register.containsValue(r)) {
                        for (Map.Entry<String, Integer> entry : register.entrySet()) {
                            if (entry.getValue() == r) {
                                System.out.println(entry.getKey());
                            }
                        }
                    } else {
                        System.out.println("invalid");
                    }
                    break;

                case 5:
                    System.out.println("enter name of the student");
                    String stuname = sc.next();
                    System.out.println(register.containsKey(stuname));
                    break;

                case 6:
                    System.out.println("enter RollNumber of the student");
                    int numstud=sc.nextInt();
                    System.out.println(register.containsValue(numstud));
                    break;

                case 7:
                    System.out.println("Register contents: " + register);
                    break;

                default:
                    System.out.println("exiting");
                    return;
            }
        }
    }
}

