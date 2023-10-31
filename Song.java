public class Song {
    private String name;
    private int durationInSeconds;
    private SongData musicData;
    private MusicGenre genre;
    private Artist artist;
    private Album album;

    public Song(String name, int durationInSeconds, MusicGenre genre, SongData musicData, Artist artist, Album album) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
        this.musicData = musicData;
        this.artist = artist;
        this.album = album;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getDurationInSecond() {
        return this.durationInSeconds;
    }

    public void setDurationInSecond(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public MusicGenre getGenre() {
        return this.genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    public SongData getMusicData() {
        return this.musicData;
    }

    public void setMusicData(SongData data) {
        this.musicData = data;
    }

    public int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return this.album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
