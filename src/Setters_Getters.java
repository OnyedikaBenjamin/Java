
public class Setters_Getters {

    public Setters_Getters (String name){
        this.name = name;
    }
  public String name;

  public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

         public static void main(String[] args) {  // this is where execution starts,it is advisible to create a different driver's class for this shit

             Setters_Getters object1 = new Setters_Getters("Jane");
             System.out.println(object1.getName());

             java.util.Scanner input = new java.util.Scanner(System.in);  //Dear reader, this is another way of imporitng your scanner instead of saying Scanner input = new Scanner
             System.out.println("The inital value of the name is : " + object1.getName());

             System.out.println("Input the name");
             String theNewName = input.nextLine();

             object1.setName(theNewName) ; //here, we assign the name after input to the instance variable "name".

             System.out.printf("Now, the new name value after using the setter to set it is : %n%s%n" , object1.getName());

         }

    }
