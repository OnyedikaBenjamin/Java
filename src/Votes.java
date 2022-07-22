import java.util.Scanner;

public class Votes {

    private int upVote;
    private int downVote;

    public int voteCount(){
        return upVote - downVote;
    }

    public static void main(String[] args) {

        Votes votes = new Votes();
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Enter up votes : ");
        votes.upVote= myScanner.nextInt();

        System.out.print("Enter down votes : ");
        votes.downVote = myScanner.nextInt();

        System.out.print("Therefore the vote count is : " + votes.voteCount());

    }
}
