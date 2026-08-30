import java.util.ArrayList;
import java.util.Scanner;

public class ModerateList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits: " + fruits);

        System.out.print("Enter fruit to search: ");
        String search = sc.nextLine();

        if (fruits.contains(search)) {
            System.out.println("Fruit found.");
        } else {
            System.out.println("Fruit not found.");
        }

        System.out.print("Enter fruit to remove: ");
        String remove = sc.nextLine();

        if (fruits.remove(remove)) {
            System.out.println("Fruit removed.");
        } else {
            System.out.println("Fruit not found.");
        }

        System.out.print("Enter position to update: ");
        int position = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new fruit: ");
        String newFruit = sc.nextLine();

        if (position >= 0 && position < fruits.size()) {
            fruits.set(position, newFruit);
        }

        System.out.println("Final List: " + fruits);

        sc.close();
    }
}
