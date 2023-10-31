import java.util.List;

public class Album implements IMusicCollection{
    private String title;
    private List<Song> listSongs;
    private Artist artist;

    public Album(String title) {
        this.title = title;
    }

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }    

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Song> getListSongs() {
        return this.listSongs;
    }

    @Override
    public void setListSongs(List<Song> listSongs) {
        this.listSongs = listSongs;
    }

    @Override
    public void addSong(Song song) {
        this.listSongs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        this.listSongs.remove(song);
    }
}
