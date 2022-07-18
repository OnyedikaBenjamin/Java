package ImportingDifferentReferences;

import java.time.LocalDate;

public class DateImportation {

        public static void main(String[] args) {
            LocalDate now =  LocalDate.now();
            System.out.println(now);   // here we got Today's date

            //Aside using the command above to get the current date, we can also use the command "now." to import different things

            System.out.println(now.getMonth());  //here we got the month

            System.out.println(now.getYear());    //here we got the year

            System.out.println(now.getDayOfYear());  //here we got day of the year..... you can also import other things aside the day of the year, month and year.


        }

        }

