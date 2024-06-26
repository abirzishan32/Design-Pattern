public class Episode implements Occurrence {
    int episodeNumber;
    int seasonNumber;

    public Episode() {
        this.episodeNumber = 1;
        this.seasonNumber = 1;
    }

    public Episode(int seasonNumber, int episodeNumber) {
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    @Override
    public void printOccurrence() {
        System.out.println("S" + seasonNumber + "E" + episodeNumber);
    }
}
