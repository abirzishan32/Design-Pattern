import java.util.List;

public class TVSeries {
    String title;
    List<Occurrence> occurrences;

    public TVSeries(String title, List<Occurrence> occurrences) {
        this.title = title;
        this.occurrences = occurrences;
    }

    public void printTVSeries() {
        System.out.println(title);
        for (Occurrence occurrence : occurrences) {
            occurrence.printOccurrence();
        }
    }
}
