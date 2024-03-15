import java.util.List;

public class TVseries {
    String title;

    List <Episode> episodes;

    public TVseries(String title, List<Episode> episodes) {
        this.title = title;
        this.episodes = episodes;
    }


    public void printTVSeries(String title) {
        System.out.println(title);
        for (Episode episode : episodes) {
            episode.printEpisode();
        }
    }
}


