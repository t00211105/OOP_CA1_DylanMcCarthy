package OOP_CA1_DylanMcCarthy;

public class Song {
    private static int trackID=1;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(int trackID,int trackNumber,String title,String artist,String genre,int duration,int releaseYear){
        setTrackID(trackID);
        setTrackNumber(trackNumber);
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
