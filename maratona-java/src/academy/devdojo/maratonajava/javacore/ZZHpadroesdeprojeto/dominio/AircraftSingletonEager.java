package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    // Eager Initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaliableSeats.remove(seat);
    }
}
