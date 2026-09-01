import java.util.ArrayList;

public class BasicList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vansh");
        names.add("Rahul");
        names.add("Aman");
        names.add("Riya");

        System.out.println("Names in the list:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}