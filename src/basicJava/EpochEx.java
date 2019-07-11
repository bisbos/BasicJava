package basicJava;

import java.time.Instant;

public class EpochEx {

    public static void main(String[] args) {
        Instant epoch = Instant.now();
        System.out.println(epoch.getEpochSecond());
    }
}
