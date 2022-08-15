package OOPassignment;

public class StackClass {

        public static void main(String[] args) {
            java.util.Stack<String> animals = new java.util.Stack<>();

            // Add elements to stack
            animals.push("Dog");
            animals.push("Horse");
            animals.push("Cat");

            System.out.println("Initial Stack: " + animals);

            // Remove element stacks
            String element = animals.pop();
            System.out.println("Removed Element: " + element);
            System.out.println(animals);

            // Access element from the top
            String element1 = animals.peek();
            System.out.println("Element1 at top: " + element);
            System.out.println(animals);

            //  Search an element
            int position = animals.search("Horse");
            System.out.println("Search Position of Horse: " + position);

            // Check if stack is empty
            boolean result = animals.empty();
            System.out.println("Is the stack empty: " + result);

        }
    }


