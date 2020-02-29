public class time1 {

    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<=23 && hour>=0)
        this.hour = hour;
        else {
            System.out.println("invalid hour");
            System.exit(-1);}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<=60 && minute>=0)
        this.minute = minute;
        else {
            System.out.println("invalid minute");
            System.exit(-2);}
    }

    public void returnTime() {
        // System.out.println("BJT "+ (100 * hour + minute));
        System.out.printf("BJT %04d",(100 * hour + minute)); //pad 425 with 0 with width of 4
    }

    public void returnUTC() {
        int hour1=(this.hour-8);
        hour1+=(hour1>=0)?0:24;
                
        // System.out.println("UTC "+ (100 * hour1 + minute));
        System.out.printf("UTC %04d",(100 * hour1 + minute)); //pad 425 with 0 with width of 4
    }
}