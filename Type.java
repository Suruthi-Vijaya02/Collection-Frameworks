import java.util.*;

public class Type {
    public static void main(String[] args) {
        Stack<String> text = new Stack<>();
        System.out.println("press 1 to add text, 2 to undo, 3 to view the current sentence, any key to exit");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the word");
                    String word = sc.next();
                    text.add(word);
                    System.out.print("added");
                    break;

                case 2:
                    String removed = text.pop();
                    System.out.print("removed: " + removed);
                    break;

                case 3:
                    System.out.println("your current sentence is:");
                    if (!text.isEmpty()) {
                        for (int w = 0; w < text.size(); w++) {
                            System.out.print(text.get(w) + " ");
                        }
                    } else {
                        System.out.println("no words");
                    }
                    break;

                default:
                    return;
            }
        }
    }
}

