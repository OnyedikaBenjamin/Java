class HelloWorld {

     int myInstanceVariable = 10;
     static int myStaticVariable = 50;
     public void nonStaticTest() {
         myInstanceVariable =11; // the value of the instance variable can be changed just as we did here cuz the access modifier is not final
        System.out.println(myInstanceVariable);  //if you run this, the value has changed from 10 to 11.
    }
    public static void staticTest(){
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {

        System.out.println("Hello world!!!");
        HelloWorld helloWorldObject1 = new HelloWorld();
        HelloWorld helloWorldObject2 = new HelloWorld();

        helloWorldObject1.nonStaticTest();
        helloWorldObject1.myStaticVariable = 1000;
        System.out.println("");

        staticTest();
        //We do not need an instance(Object) i.e the helloWorldObject1 to call a static method
    }
}
