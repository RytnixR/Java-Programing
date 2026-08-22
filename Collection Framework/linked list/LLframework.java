
import java.util.LinkedList;


public class LLframework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Rytnix");
        list.addLast("ji");

        System.out.println(list);

        list.add("Making linkedlist");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");

        list.remove();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(0);
        
        System.out.println(list);

    }
}
