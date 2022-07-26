//
//import java.util.Scanner;
//
//    public class Diary {
//
//        private static final Scanner input = new Scanner(System.in);
//        static ArrayList<String> addentrys = new ArrayList<>();
//
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Enter Diary Name");
//            String name = input.nextLine();
//
//            System.out.println("Welcome to " + name + " Diary");
//
//
//            System.out.println();
//            System.out.println("""
//                Select an Option to Continue
//                    1. Add entries
//                    2. Edit entries
//                    3. Search for entries
//                    4. Delete entries
//                    5. Quiet
//                """);
//            int entries = input.nextInt();
//            switch (entries) {
//                case 1:
//                    addEntries();
//                    break;
//                case 2:
//                    EditEntries();
//                    break;
//                case 3:
//                    SearchForEntries();
//                    break;
//                case 4:
//                    DeleteEntries();
//                    break;
//                case 5:
//                    Quiet();
//                    System.out.println("See you leter " + name);
//
//            }
//        }
//
//        private static void Quiet() {
//        }
//
//        private static void addEntries() {
//            System.out.println("Add entries");
//            String addentry = input.nextLine();
//            addentrys.add(addentry);
//        }
//
//        private static void EditEntries() {
//            System.out.println("Enter the number of entry to Edit");
//            String EditEntry = input.nextLine();
//            addentrys.remove(0);
//            System.out.println("Entry" + EditEntry);
//        }
//
//        private static void SearchForEntries() {
//            System.out.println("Enter entry to Search for");
//            String SearchEntry = input.nextLine();
//            System.out.printf("%s%s%n","SearchEntry",SearchEntry);
//        }
//
//        private static void DeleteEntries() {
//            System.out.println("Enter entry to Delete");
//            String Delete = input.nextLine();
//            System.out.printf("%s%s%n","Deleted", Delete);
//            addentrys.clear();
//        }
//
//    }
//
//
