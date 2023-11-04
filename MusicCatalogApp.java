import java.util.List;

public class MusicCatalogApp {
    public static void main(String[] args) {

        UserCommandLineInterface cmdInterfaceApp = new UserCommandLineInterface();
        cmdInterfaceApp.start();
        
        // ArtistMetaData artistData_1 = new ArtistMetaData("Group", "-", "Blacksnipers", "Us");
        // ArtistMetaData artistData_2 = new ArtistMetaData("Group", "-", "The Black Queen", "Eng");
        // ArtistMetaData artistData_3 = new ArtistMetaData("Group", "-", "LAVBLAST", "Rus");
        // ArtistMetaData artistData_4 = new ArtistMetaData("Group", "-", "CREAM SODA", "Rus");

        // Artist artist_1 = new Artist(artistData_1);
        // Artist artist_2 = new Artist(artistData_2);
        // Artist artist_3 = new Artist(artistData_3);
        // Artist artist_4 = new Artist(artistData_4);

        // ArtistsCollection artistList = new ArtistsCollection();
        // artistList.addArtist(artist_1);
        // artistList.addArtist(artist_2);
        // artistList.addArtist(artist_3);
        // artistList.addArtist(artist_4);

        
        // MusicGenre genre_1 = new MusicGenre("Pop");
        // MusicGenre genre_2 = new MusicGenre("Rock");
        // MusicGenre genre_3 = new MusicGenre("Electronic");

        
        // Album album_1 = new Album("GGP/RMX");
        // Album album_2 = new Album("Infinite Games");
        // Album album_3 = new Album("НЕБО");
        // Album album_4 = new Album("LOOK AROUND_3_4");
        // Album album_5 = new Album("Pull Up");
        // album_1.setDescription("GoGo Penguin");

        
        // Song song_1 = new Song("Lotus Eater", 181, genre_3, null, artist_1, album_1);
        // Song song_2 = new Song("Небо", 126, genre_2, null, artist_1, album_1);
        // Song song_3 = new Song("Дождь", 314, genre_3, null, artist_1, album_1);
        // Song song_4 = new Song("Вечерело", 98, genre_1, null, artist_1, album_1);
        // Song song_5 = new Song("Moire", 62, genre_1, null, artist_1, album_1);
        // Song song_6 = new Song("Palm", 133, genre_1, null, artist_2, album_3);
        // Song song_7 = new Song("Meet Lime Cookie!", 172, genre_1, null, artist_2, album_3);
        // Song song_8 = new Song("Магадан", 110, genre_2, null, artist_3, album_2);
        // Song song_9 = new Song("Владивосток 2000", 140, genre_2, null, artist_4, album_4);
        // Song song_10 = new Song("Ветер", 126, genre_3, null, artist_1, album_5);
        // Song song_11 = new Song("Eple (Original Edit)", 211, genre_3, null, artist_4, album_4);
        
        // MusicCollection collection = new MusicCollection();
        // collection.addSong(song_1);
        // collection.addSong(song_2);
        // collection.addSong(song_3);
        // collection.addSong(song_4);
        // collection.addSong(song_5);
        // collection.addSong(song_6);
        // collection.addSong(song_7);
        // collection.addSong(song_8);
        // collection.addSong(song_9);
        // collection.addSong(song_10);
        // collection.addSong(song_11);
        // collection.removeSong(song_11);

        // PlayList myPlayList_1 = new PlayList("My favorites");
        // myPlayList_1.addSong(song_10);
        // myPlayList_1.addSong(song_2);
        // myPlayList_1.addSong(song_1);
        // myPlayList_1.addSong(song_11);
        // myPlayList_1.addSong(song_4);
        // myPlayList_1.removeSong(song_11);

        // PlayList myPlayList_2 = new PlayList("For sleep");
        // myPlayList_2.addSong(song_9);
        // myPlayList_2.addSong(song_8);
        // myPlayList_2.addSong(song_6);
        // myPlayList_2.addSong(song_7);
        // myPlayList_2.addSong(song_5);

        // PlayListCollection playListCollection = new PlayListCollection();
        // playListCollection.addPlaylist(myPlayList_1);
        // playListCollection.addPlaylist(myPlayList_2);

        // List<Song> res_1 = collection.findByGenreName("Rock");
        // for (Song item : res_1) {
        //     System.out.println(item.getName() + " " + item.getArtist());
        // }

        // List<PlayList> res_2 = playListCollection.findByTitle("My favorites");
        // for (PlayList item : res_2) {
        //     System.out.println(item.getTitle());
        //     List<Song> list = item.getListSongs();
        //     for (Song itemSong : list) {
        //         System.out.println(itemSong.getName() + " " + itemSong.getArtist().getArtistMetaData().getName());
        //     }
        // }

    }
}
