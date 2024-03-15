import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Breaking Bad
        Episode episode1 = new Episode(1, 1);
        Episode episode2 = new Episode(2, 1);
        Episode episode3 = new Episode(1, 2);
        Episode episode4 = new Episode(2, 2);

        List<Episode> episodesList1 = new ArrayList<>();
        episodesList1.add(episode1);
        episodesList1.add(episode2);
        episodesList1.add(episode3);
        episodesList1.add(episode4);

        TVseries Breaking_Bad = new TVseries("Breaking bad", episodesList1);
        Breaking_Bad.printTVSeries();
        System.out.println();

        //Game of Thrones
        Episode episode5 = new Episode(1, 1);
        Episode episode6 = new Episode(2, 1);
        Episode episode7 = new Episode(1, 2);
        Episode episode8 = new Episode(2, 2);

        List<Episode> episodesList2 = new ArrayList<>();
        episodesList2.add(episode5);
        episodesList2.add(episode6);
        episodesList2.add(episode7);
        episodesList2.add(episode8);

        TVseries GOT = new TVseries("GOT", episodesList2);
        GOT.printTVSeries();


    }
}
