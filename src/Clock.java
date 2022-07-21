public class Clock {
    private int hour;
    private int minutes;
    private int seconds;
    public Clock() {}

    public Clock(int hour, int minutes, int seconds){
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
    }




    public void setHour(){
        if (hour > 23){
            this.hour=0;
        }
        else {
            this.hour = hour;
        }
    }

    public void setMinutes() {
        if (minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(){
        if (seconds>59){
            this.seconds=0;
        }
        else{
            this.seconds=seconds;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    public static void main(String[] args) {

        Clock objectClock = new Clock(45, 43, 9);



        System.out.println(objectClock.hour + ":" + objectClock.minutes + ":" + objectClock.seconds );
    }
}
