import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {
        // input bjt, output utc
        time1 bjt = new time1();
        Scanner sc = new Scanner(System.in);
        // input hour
        System.out.println("HH?");
        bjt.setHour(sc.nextInt());
        // input minute
        System.out.println("MM?");
        bjt.setMinute(sc.nextInt());

        bjt.returnTime();
        bjt.returnUTC();

        sc.close();
    }
}