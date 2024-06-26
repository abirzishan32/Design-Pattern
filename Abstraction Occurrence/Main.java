import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Breaking Bad
        Occurrence episode1 = new Episode(1, 1);
        Occurrence episode2 = new Episode(2, 1);
        Occurrence episode3 = new Episode(1, 2);
        Occurrence episode4 = new Episode(2, 2);

        List<Occurrence> occurrencesList1 = new ArrayList<>();
        occurrencesList1.add(episode1);
        occurrencesList1.add(episode2);
        occurrencesList1.add(episode3);
        occurrencesList1.add(episode4);

        TVSeries breakingBad = new TVSeries("Breaking Bad", occurrencesList1);
        breakingBad.printTVSeries();
        System.out.println();

        // Game of Thrones
        Occurrence episode5 = new Episode(1, 1);
        Occurrence episode6 = new Episode(2, 1);
        Occurrence episode7 = new Episode(1, 2);
        Occurrence episode8 = new Episode(2, 2);

        List<Occurrence> occurrencesList2 = new ArrayList<>();
        occurrencesList2.add(episode5);
        occurrencesList2.add(episode6);
        occurrencesList2.add(episode7);
        occurrencesList2.add(episode8);

        TVSeries got = new TVSeries("GOT", occurrencesList2);
        got.printTVSeries();
    }
}
