package OOP_CA1_DylanMcCarthy;

import javax.swing.*;

public class Album1 extends TestAlbum{
    private String name;
    private Song[] tracks = new Song[5];
    private String producer;
    private int releaseYear;


    public Album1(String name,String producer,int releaseYear,Song[] tracks){
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || name != "")
        {
            this.name = name;
        }
        else{
            this.name="No name specified";
        }
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getNumberOfTracks(int tracks){
        int count=0;
        for (int i=0;i<5;i++) {
          count=i;
        }
        return count;
    }
    public int getPlayingTime(int duration){
        int time=0;
        for (int j=0;time<1000;j++)
        time+=duration;
        return time;
    }
    public void playTrack(Song[] tracks, int trackId) {
        int choice = 0;
        String choiceAsString;
        choiceAsString = JOptionPane.showInputDialog(null,"What song would you like to play", "Track Selection",JOptionPane.INFORMATION_MESSAGE);
        choice=Integer.parseInt(choiceAsString);

        if (choice < 0 || choice > 5) {
            JOptionPane.showMessageDialog(null, "An invalid track number was supplied!", "Bad Track Number", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Playing track " + choice, "Track Selection", JOptionPane.INFORMATION_MESSAGE);

    }
        return ;
    }
    public void shuffle(Song[] tracks){
        Song[] songs= new Song[5];
        boolean alreadyPicked=false;
        for (int x=0;x<5;x++){
            if (tracks[x]==songs[x]){
                alreadyPicked=true;
            }
            else {
                alreadyPicked = false;
            }
        }
    }

}
