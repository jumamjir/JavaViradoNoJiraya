package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1730232512908L); // long 10000

        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
