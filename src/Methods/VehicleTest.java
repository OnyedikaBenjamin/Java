package Methods;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();    // vehicle 1 possesses the values of the instance variables, since no values hae been assigned to it unlike vehicle2.


        Vehicle vehicle2 = new Vehicle("Lexus", "Black", "Lx350", "Honda" , 800 , 0);  // here we "Constructed" a new vehicle using all the instance variables of the class "Vehicle".
        System.out.println("We just constructed a vehicle of name " + vehicle2.getName() + ", it's color is " + vehicle2.getColor()+
                             ", It is modeled " + vehicle2.getModel() + ", and it is manufactured by a company called " + vehicle2.getCompany() +".");
        vehicle2.changeTheNameTo("ford");   // Since I created a setter method in the Vehicle class, it will enable me to change the name (or any other attribute) of the instance whenever I want to just like I did now,
        System.out.println(vehicle2.getName());

        /*Try to print this code again, ...System.out.println("We just constructed a vehicle of name " + vehicle2.name + ", it's color is " + vehicle2.color +
                ", It is modeled " + vehicle2.model + ", and it is manufactured by a company called " + vehicle2.company +".");... you will notice that the value of the name have been changed*/


        Vehicle vehicle3 = new Vehicle();

        vehicle3.changeTheNameTo("Toyota");
        System.out.println(vehicle3.getName());

        System.out.println(vehicle1.getSpeed());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle3.getSpeed());



    }
}
