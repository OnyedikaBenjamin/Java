import java.util.Scanner;

public class MyersBriggs {

    public static void main(String[] args) {

        String [][] feedBacks = new String[5][8];
        Scanner scanner = new Scanner(System.in);

        String feedback;
        int aCount = 0;
        int bCount = 0;
        int aCount1 = 0;
        int bCount1 = 0;
        int aCount2 = 0;
        int bCount2 = 0;
        int aCount3 = 0;
        int bCount3 = 0;

        System.out.println("Choose A or B as appropriate for the following personality test questions");
        System.out.println();
        System.out.printf("%s%n", "Question 1: \n A. Expend energy, enjoy groups \t B. Conserve, enjoy one-on-one");
        feedback = scanner.nextLine();

        switch (feedback) {
            case ("A") , ("a"):
                feedBacks[0][0] = "A";

                break;
            case ("B"),("b"):
                feedBacks[0][1] = "B";
                break;
        }

        System.out.println();
        System.out.printf("%s%n", "Question 2: \n A. interpret literally \t B. look for meaning and possibilities");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[0][2] = "A";

                break;
            case "B","b":
                feedBacks[0][3] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 3: \n A. logical, thinking, questioning \t B. empathetic, feeling, accommodating");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[0][4] = "A";

                break;
            case "B","b":
                feedBacks[0][5] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 4: \n A. organized, orderly \t B. flexible, adaptable");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[0][6] = "A";

                break;
            case "B","b":
                feedBacks[0][7] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 5: \n A. more outgoing, think out loud \t B. more reserved, think to yourself");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[1][0] = "A";

                break;
            case "B","b":
                feedBacks[1][1] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 6: \n A. practical, realistic, experiential \t B. imaginative, innovation, theoretical");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[1][2] = "A";

                break;
            case "B","b":
                feedBacks[1][3] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 7: \n A. candid, straight forward, frank \t B. tactful, kind, encouraging");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[1][4] = "A";

                break;
            case "B","b":
                feedBacks[1][5] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 8: \n A. plan, schedule \t B. unplanned, spontaneous");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[1][6] = "A";

                break;
            case "B","b":
                feedBacks[1][7] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 9: \n A. seek many tasks, public activities, interaction with user \t B. seek private, solitary activities with quiet to concentrate");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[2][0] = "A";

                break;
            case "B","b":
                feedBacks[2][1] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 10: \n A. standard, usual, conventional \t B. different, novel, unique");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[2][2] = "A";

                break;
            case "B","b":
                feedBacks[2][3] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 11: \n A. firm, tend, to criticize, hold the line \t B. gentle, tend to appreciate, conciliate");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[2][4] = "A";

                break;
            case "B","b":
                feedBacks[2][5] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 12: \n A. regulated, structured \t B. easygoing, \"live\" and \"let live\" ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[2][6] = "A";

                break;
            case "B","b":
                feedBacks[2][7] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 13: \n A. external, communicative, express yourself \t B. internal, reticent, keep to yourself");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[3][0] = "A";

                break;
            case "B","b":
                feedBacks[3][1] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question14: \n A. focus on here-and-now \t B. look to the future, global perspective, \"big picture\" ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[3][2] = "A";

                break;
            case "B","b":
                feedBacks[3][3] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 15: \n A. tough-minded, just \t B. tender-hearted, merciful ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[3][4] = "A";

                break;
            case "B","b":
                feedBacks[3][5] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 16: \n A. preparation, plan ahead \t B. go with the flow, adapt as you go ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[3][6] = "A";

                break;
            case "B","b":
                feedBacks[3][7] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 17: \n A. active, initiate \t B. reflective, deliberate ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[4][0] = "A";

                break;
            case "B","b":
                feedBacks[4][1] = "B";

                break;
        }

        System.out.println();
        System.out.printf("%s%n", "Question 18: \n A. facts, things, \"what is\" \t B. ideas, dreams, \"what could be,\" philosophical");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[4][2] = "A";

                break;
            case "B","b":
                feedBacks[4][3] = "B";

                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 19: \n A. matter of fact, issue-oriented \t B. sensitive, people-oriented, compassionate ");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[4][4] = "A";

                break;
            case "B","b":
                feedBacks[4][5] = "B";
                break;
        }
        System.out.println();
        System.out.printf("%s%n", "Question 20: \n A. control, govern \t B. latitude, freedom");
        feedback = scanner.nextLine();
        switch (feedback) {
            case "A", "a":
                feedBacks[4][6] = "A";
                break;
            case "B","b":
                feedBacks[4][7] = "B";
                break;
        }
        if (aCount < bCount){
            System.out.println("you are an extrovert");
        }else {
            System.out.println("you are an introvert");
        }
        if (aCount1 < bCount1){
            System.out.println("you are sensing");
        }else {
            System.out.println("you are an intuitive");
        }
        if (aCount2 < bCount2){
            System.out.println("you are thinking");
        }else {
            System.out.println("you are an feeling");
        }if (aCount3 < bCount3){
            System.out.println("you are judging");
        }else {
            System.out.println("you are an prospecting");
        }



    }
}