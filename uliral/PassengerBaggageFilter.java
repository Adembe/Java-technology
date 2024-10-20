package uliral;

@FunctionalInterface
public interface PassengerBaggageFilter {
    boolean test(PassengerBaggage baggage);
}
