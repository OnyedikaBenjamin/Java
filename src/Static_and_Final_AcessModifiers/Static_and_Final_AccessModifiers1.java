package Static_and_Final_AcessModifiers;

class Static_and_Final_AccessModifiers1 {
    private int myInstanceVariable = 10;
     final int myFinalVariable = 20;
    static int myStaticVariable = 50;

     public void nonStaticMethod() {}
    static void staticMethod(){}    // A static method. It can also be written as 'public static void staticMethod(){}'.


    public static void main(String[] args) {

         Static_and_Final_AccessModifiers1 object = new Static_and_Final_AccessModifiers1();

        object.nonStaticMethod();     // Here we called the non-static method
        staticMethod();              // Here we called the static method directly without an object of the class.

        object.myInstanceVariable = 11;   // the value of the instance variable can be changed cuz its access modifier is not final

        // helloWorldObject1.myFinalVariable = 0;       It will not work out cuz it has a final modifier.


    }
}
