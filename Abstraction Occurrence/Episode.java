public class Episode {
    int episodeNumber;
    int seasonNumber;
    public  Episode() {
        this.episodeNumber = 1;
        this.seasonNumber = 1;
    }

    public  Episode(int seasonNumber, int episodeNumber) {
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }


    public  void printEpisode() {
        System.out.println("S" + seasonNumber + "E" + episodeNumber);
    }
}





