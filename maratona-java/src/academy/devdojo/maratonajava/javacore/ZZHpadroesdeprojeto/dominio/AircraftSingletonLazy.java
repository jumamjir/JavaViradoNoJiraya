package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");

                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaliableSeats.remove(seat);
    }
}
