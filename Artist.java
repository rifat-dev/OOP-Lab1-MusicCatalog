public class Artist {
    private ArtistMetaData artistMetaData;

    public Artist(ArtistMetaData artistMetaData) {
        this.artistMetaData = artistMetaData;
    }


    public ArtistMetaData getArtistMetaData() {
        return this.artistMetaData;
    }

    public void setArtistMetaData(ArtistMetaData artistMetaData) {
        this.artistMetaData = artistMetaData;
    }
    
}
