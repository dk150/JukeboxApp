package rs.epicescape.epicjukebox;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.Date;

/**
 * every fetched song's data(tags) and set clue is encapsulated in a Song object
 */

public class Song {
    private final int id;
    private final String artist;
    private final String title;
    private final String album;
    private final String year;
    private final Bitmap cover;
    private final ArrayList<String> genre;
    private final String comment;
    private final String fileName;
    private final Date dateModified;
    private String clue;

    public Song(int songId, String songArtist, String songTitle, String songAlbum, String songYear, Bitmap songCover, ArrayList<String> songGenre, String songComment, String songFileName, Date songDateModified, String songClue) {
        id = songId;
        artist = songArtist;
        title = songTitle;
        album = songAlbum;
        year = songYear;
        cover = songCover;
        genre = songGenre;
        comment = songComment;
        fileName = songFileName;
        dateModified = songDateModified;
        clue = songClue;
    }

    public int getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getYear() {
        return year;
    }

    public Bitmap getCover() {
        return cover;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public String getComment() {
        return comment;
    }

    public String getFileName() {
        return fileName;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }
}
