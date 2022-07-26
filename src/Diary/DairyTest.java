package Diary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class DairyTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        ArrayList<Diaries> myDiary  = new ArrayList<>();
        Diaries object = new Diaries();


//        int createNewDiary = 1;
//        int viewDiary      = 2;
//        int editDiary      = 3;
//        int deleteDiary    = 4;

        System.out.println("Select 1 to create a new Diary" +
                "           Select 2 to view your Diaries" +
                "           Select 3 to edit your Diaries" +
                "           Select 4 to delete a Diary");


        System.out.println("Select an option");
        int selectAnOption = input.nextInt();


        if (selectAnOption == 1){

            System.out.println("Write what you want to remember");
            String diaryBody = input.nextLine();
            object.addDiary(diaryBody);
        }
        else if (selectAnOption == 2) {


        }


    }

}
