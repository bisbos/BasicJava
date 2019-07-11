package basicJava.arraysAndNumbers;


import java.time.Instant;

public class EpochSeconds {

    public static void main(String[] args) {
        Instant epoch = Instant.now();
        System.out.println(epoch.toEpochMilli());
        System.out.println(System.currentTimeMillis());

    }
}
