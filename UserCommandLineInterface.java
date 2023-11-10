import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserCommandLineInterface {
    private MusicCollection collection;
    private PlayListCollection playListCollection;
    private ArtistsCollection artistsCollection;
    private AlbumCollection albumCollection;
    private Scanner scanner;

    public UserCommandLineInterface() {
        collection = new MusicCollection();
        playListCollection = new PlayListCollection();
        artistsCollection = new ArtistsCollection();
        albumCollection = new AlbumCollection();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        int choice = 9;

        while (running) {
            System.out.println("Options:");
            System.out.println("1 Add Artist");
            System.out.println("-1 Remove Artist");
            System.out.println("2 Add Album");
            System.out.println("-2 Remove album");
            System.out.println("3 Add Song"); 
            System.out.println("-3 Remove Song");
            System.out.println("4 Add Playlist"); 
            System.out.println("-4 Remove Playlist");
            System.out.println("5 Search songs by Genre");
            System.out.println("6 Search songs by Playlist Title");
            System.out.println("7 Search songs by artist nickname");
            System.out.println("8 Search song by name");
            System.out.println("9 Exit");
            System.out.print("Enter your choice: ");

            String userInput = scanner.nextLine();
            try {
                choice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }

            switch (choice) {
                case 1:
                    addArtist();
                    break;
                case 2:
                    addAlbum();
                    break;
                case 3:
                    addSong();
                    break;
                case 4:
                    addPlaylist();
                    break;
                case 5:
                    getMusicsByGenre();
                    break;
                case 6:
                    getMusicsByPlaylistTitle();
                    break;
                case 7:
                    getMusicsByArtistNickname();
                    break;
                case 8:
                    getMusicByName();
                    break;
                case 9:
                    running = false;
                    break;
                case -1:
                    removeArtist();
                    break;
                case -2:
                    removeAlbum();
                    break;
                case -3:
                    removeSong();
                    break;
                case -4:
                    removePlaylist();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addArtist() {
        System.out.print("Enter artist firstname: ");
        String artistName = scanner.nextLine();

        System.out.print("Enter artist surname: ");
        String artistSurname = scanner.nextLine();

        System.out.print("Enter artist nickname: ");
        String artistNickname = scanner.nextLine();

        System.out.print("Enter artist nationality: ");
        String artistNationality = scanner.nextLine();

        ArtistMetaData artistData = new ArtistMetaData(artistName, artistSurname, artistNickname, artistNationality);
        Artist artist = new Artist(artistData);

        artistsCollection.addArtist(artist);

        System.out.println("Artist added successfully!");
    }

    public void removeArtist() {
        System.out.print("Enter artist nickname: ");
        String artistNickname = scanner.nextLine();

        List<Artist> artistResp = artistsCollection.findByNickName(artistNickname);
        Artist artist = artistResp.get(0);
        artistsCollection.removeArtist(artist);

    }

    public void addSong() {
        try {
            if (artistsCollection.isEmpty()) {
                System.out.println("The list of artists in the database is empty." +  
                "You need to add an artist first. Select the \"1 Add Artist\"" + 
                "option from the main menu.");
                return;
            }

            if (albumCollection.isEmpty()) {
                System.out.println("The list of albums in the database is empty." +  
                "You need to add an album first. Select the \"2 Add Album\"" + 
                "option from the main menu.");
                return;
            }

            System.out.print("Enter song name: ");
            String name = scanner.nextLine();

            System.out.print("Enter song's duration in seconds: ");
            int durationInSeconds = scanner.nextInt();

            System.out.print("Enter song's genre: ");
            String genre = scanner.nextLine();

            System.out.println("\nThere are albums in database: ");

            List<Album> curAlbums = albumCollection.getList();

            for (int i = 0; i < curAlbums.size(); i++) {
                System.out.println(i + " " + curAlbums.get(i).getTitle());
            }

            System.out.print("Choose album number from the list: ");
            int indexAlbum = scanner.nextInt();
            
            if (indexAlbum < 0 || indexAlbum > curAlbums.size() - 1) {
                System.out.println("Error: You should pick a number from the list");
                return;
            }

            Album curAlbum = curAlbums.get(indexAlbum);

            System.out.println("There are artists in database: ");
            
            List<Artist> curArtists = artistsCollection.getList();
            for (int i = 0; i < curArtists.size(); i++) {
                System.out.println(i + " " + curArtists.get(i).getArtistMetaData().getNickname());
            }

            System.out.print("Choose artists nickname number from the list: ");
            int indexArtist = scanner.nextInt();
            
            if (indexArtist < 0 || indexArtist > curArtists.size()) {
                System.out.println("Error: You should pick a number from the list");
                return;
            }

            Artist curArtist = curArtists.get(indexArtist);

            Song song = new Song(name, durationInSeconds, genre, null, curArtist, curAlbum);
            collection.addSong(song);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeSong() {
        System.out.print("Enter song name: ");
        String name = scanner.nextLine();

        List<Song> resultList = collection.findByName(name);

        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the song by name " + name);
        } else {
            collection.removeSong(resultList.get(0));
        }
    }

    public void addAlbum() {
        System.out.print("Enter title of Album: ");
        String title = scanner.nextLine();

        Album album = new Album(title);
        albumCollection.addAlbum(album);
    }

    public void removeAlbum() {
        System.out.print("Enter title of album: ");
        String title = scanner.nextLine();

        List<Album> resultList = albumCollection.findByTitle(title);

        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the album by title " + title);
        } else {
            albumCollection.removeAlbum(resultList.get(0));
        }
    }

    public void addPlaylist() {
        System.out.print("Enter title of playlist: ");
        String title = scanner.nextLine();

        PlayList playList = new PlayList(title);
        playListCollection.addPlaylist(playList);
    }

    public void removePlaylist() {
        System.out.print("Enter title of playlist: ");
        String title = scanner.nextLine();

        List<PlayList> resultList = playListCollection.findByTitle(title);

        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the playlist by title " + title);
        } else {
            playListCollection.removePlaylist(resultList.get(0));
        }
    }

    public void getMusicsByGenre() {
        System.out.print("Enter genre name: ");
        String name = scanner.nextLine();

        List<Song> resultList = collection.findByGenreName(name);

        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the musics by genre " + name);
        } else {
            for (int i = 0; i < resultList.size(); i++) {
                Song item = resultList.get(i);
                System.out.println(item.getName() + " " + item.getAlbum().getTitle() + " " + item.getArtist().getArtistMetaData().getNickname());
            }
        }
    }

    public void getMusicsByPlaylistTitle() {
        System.out.print("Enter playlist title: ");
        String title = scanner.nextLine();

        List<PlayList> resultList = playListCollection.findByTitle(title);
        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the playlist by title " + title);
        } else {
             List<Song> playlistSongs = resultList.get(0).getListSongs();
             for (int i = 0; i < playlistSongs.size(); i++) {
                Song item = playlistSongs.get(i);
                System.out.println(item.getName() + " " + item.getAlbum().getTitle() + " " + item.getArtist().getArtistMetaData().getNickname());
             }
        }

    }

    public void getMusicsByArtistNickname() {
        System.out.print("Enter artist nickname: ");
        String nickname = scanner.nextLine();

        List<Song> resultList = collection.findByArtistNickName(nickname);
        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the songs of " + nickname);
        } else {
             for (int i = 0; i < resultList.size(); i++) {
                Song item = resultList.get(i);
                System.out.println(item.getName() + " " + item.getAlbum().getTitle() + " " + item.getArtist().getArtistMetaData().getNickname());
             }
        }
    }

    public void getMusicByName() {
        System.out.print("Enter song name: ");
        String name = scanner.nextLine();

        List<Song> resultList = collection.findByName(name);
        if (resultList.isEmpty()) {
            System.out.println("Couldn't find the songs " + name);
        } else {
             for (int i = 0; i < resultList.size(); i++) {
                Song item = resultList.get(i);
                System.out.println(item.getName() + " " + item.getAlbum().getTitle() + " " + item.getArtist().getArtistMetaData().getNickname());
             }
        }
    }

}
