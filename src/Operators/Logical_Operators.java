package Operators;// There are 3 kinds of Logical Operators in java AND(&&), OR(||) NOT(!)

public class Logical_Operators {

    public static void main(String[] args) {
        int temperature =28;
        boolean roomIsWarm = temperature > 22 && temperature <30;
        System.out.println(roomIsWarm + "\n");

/*In the expression above, we used the AND (&&) operators. Java in this case will first check the first conditional statement i.e "temperature > 22"
 if the statement is invalid, it executes the statement i.e "isWarm" and returns FALSE, without having to check the second conditional
 statement i.e "temperature < 30". but if the first conditional statement is true, it checks the second conditional statement and if it's Invalid,
  java returns False. so for java to return TRUE, the two conditional statements must be true.
 */

        boolean hasHighIncome = true;
        boolean hasHighCredit = true;
        boolean isEligibleForTheLoan = hasHighIncome || hasHighCredit;
        System.out.println("\n" + isEligibleForTheLoan);
        /*In the expression above, we used the OR (||) operators. To know if the customer is eligible for the loan, Java in this case will first check the first conditional statement i.e "hasHighIncome"
if the statement is valid, it executes the statement i.e "isWarm" and returns true, without having to check the second conditional
statement i.e "hasHighCredit". but if the first conditional statement is Invalid, it checks the second conditional statement and if it's Invalid,
java returns False. so for java to return TRUE, either of conditional statements must be true.*/

        boolean HighIncome = true;
        boolean HighCredit = true;
        boolean CrminalRecord = true;
        boolean EligibleForTheLoan = (HighIncome || HighCredit) && !CrminalRecord;
        System.out.println(EligibleForTheLoan);
        // Here, for the customer to be Eligble for the loan, he must have either a "HighIncome" or (||) a HighCredit and(&&) He must not(!) have a Criminal record.


    }
}
