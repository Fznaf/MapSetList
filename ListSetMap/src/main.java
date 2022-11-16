import java.util.*;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        System.out.println("BOOK GENRE LIST");
        System.out.println("\n\n");


        Set<String> Set = new HashSet<String>();
        Set.add("Thriller");
        Set.add("Mystery");
        Set.add("Sci-fi");

        System.out.println("Set :");
        System.out.println(Set);
        System.out.println("");

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Thriller");
        map.put(2, "Mystery");
        map.put(3, "Sci-fi");

        System.out.println("Map :");
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("");

        //using LinkedList (Stack)
        LinkedList<String> linkedListStack = new LinkedList<String>();
        linkedListStack.add("Thriller");
        linkedListStack.add("Mystery");
        linkedListStack.add("Sci-fi");

        System.out.println("LinkedList (Stack)");
        System.out.println(linkedListStack);
        System.out.println("After pop");
        linkedListStack.removeLast();
        System.out.println(linkedListStack);
        System.out.println("\n");


        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Thriller");
        shoppingList.add("Mystery");
        shoppingList.add("Sci-fi");

        System.out.println("List :");
        for (String fruit : shoppingList)
        {
            System.out.println(fruit);
        }
        System.out.println("");
    }
}