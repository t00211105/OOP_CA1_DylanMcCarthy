package OOP_CA1_DylanMcCarthy;

import javax.swing.*;

public class TestAlbum {
    private static OOP_CA1_DylanMcCarthy.Song[][] Song;

    public static void main(String[] args) {

        int i=0;
        Song tracks[] = Song[4];



        Song s1 = new Song(1,1,"Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song(2,2,"Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song(3,3,"Someone Like You", "Adele", "Pop", 223, 2013);
        Song s4 = new Song(4,4,"House of Fun", "Madness", "Pop", 178, 1984 );
        Song s5 = new Song(5,5,"Not Specified",);
        //Album1.getNumberOfTracks();
        i+=s1.getDuration();
        i+=s2.getDuration();
        i+=s3.getDuration();
        i+=s4.getDuration();
        tracks[0]=s1;
        tracks[1]=s2;
        tracks[2]=s3;
        tracks[3]=s4;

        Object Album = "Now That's What I call music 98\n\n" + s1+s2+s3+s4 + "\n\nUniversal Music";
        String output ="\n\t\tAlbum Tracks\tTrack Number\tTitle\tArtist";
        Album1 a1= new Album1("Now that's what I call music 98", "Universal Music", 2016,  5+ "\n\nTotal Playing Time:"  + i  + output +tracks[0]+tracks[1]+tracks[2]+tracks[3] );

        JTextArea jTextArea= new JTextArea("monospaced",60,80);
        JTextField jTextField = new JTextField(String.valueOf(jTextArea));

        JOptionPane.showMessageDialog(null,a1,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        JTextArea jTextArea1= new JTextArea("monospaced",60,80);
        JTextField jTextField1 = new JTextField(String.valueOf(jTextArea1));

        JOptionPane.showMessageDialog(null,"Shuffled Playlist as follows:\n\n" +tracks[2]+tracks[3]+tracks[1]+tracks[5]+tracks[4],"Album Information",JOptionPane.INFORMATION_MESSAGE);



    }
}
