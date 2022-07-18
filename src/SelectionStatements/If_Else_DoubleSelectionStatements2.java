package SelectionStatements;

public class If_Else_DoubleSelectionStatements2 {


        public static void main(String[] args) {

            int age = 16;           //"age" is a local variable

            if (age>=18){     //Here we are only saying 'if the age is greater or equal to 18, then the statement following it should execute.
                System.out.println("Hello guys!!! \n i am an adult");
            }

            //the && means "And"..... so here we are only saying 'If the statement above is not valid
            // then execute this statement beneath. The "If else" statement is to be used repeatedly
            // until we come to the final conditional statement then we use "else".
            else if (age <18 && age >=15){
                System.out.println("Hey babes!!  I am gonna be an adult soon");
            }
            else{
                System.out.println("I am still a kid, i only gat to read my book");
            }

        }
    }







