package Methods;

public class Vehicle {
    private String name ="";            // The "" is an empty placeholder that will hold a String value only. It does not work for primitives.
    private String color = "";
    private String model = "";
    public String company = "";
    private int engine;
    private int speed;

    public Vehicle() {}                   //for every class we create, this is the empty constructor java creates for us, and we must always create it if we will create an empty constructor object later.

    public Vehicle(String name, String color, String model, String company, int engine, int speed) {   //this is an all argument constructor
        this.name = name;                //here we tell the constructor to set (this) the name entered to the Instance variable "name".
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.speed = speed;
    }

    // Here we are creating a "Setter method" so that we can change the values of the instance variables using the command i.e vehicle1.setName("Toyota");
    //  "set" is not a keyword so u can use another word in place of set i.e we can use changeTheNameTo, instead of using setName.
    public void changeTheNameTo(String name) {      // this is the function code that enables us to assign new value to the Instance of the class i.e Vehicle 3 in the drivers class.
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void changeTheModelTo(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Here we will create a 'getter method' for all the instance variables of the class...
    // Why because we are using the private access modifier, and we cannot access the values of the instance variables directly.
    // from another class like our "VehicleDrive class". instead of using the command i.e vehicle2.name to get the value of the instance variable directly
    // Instead we will now use vehicle2.getName();


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }
    private int getEngine() {
        return engine;
    }

    //just imagine that the highest Speed a Car can attain is dependent on the engine capacity (int).
    // So instead of writing the normal getter method, we will insert conditional statements to justify our code.

    public int getSpeed() {                // here we declared a getter method of (int Speed) and added conditional statement to it.
        if (getEngine() <= 100) {
            return 180;                  // here 180 is the highest speed the car can attain
        } else {
            return 360;                 // here 360 is the highest speed the car can attain
        }
    }
}