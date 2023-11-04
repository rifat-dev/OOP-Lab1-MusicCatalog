import java.util.List;
import java.util.Scanner;

public class UserCommandLineInterface {
    private MusicCollection collection;
    private PlayListCollection playListCollection;
    private ArtistsCollection artistsCollection;
    private Scanner scanner;

    public UserCommandLineInterface() {
        collection = new MusicCollection();
        playListCollection = new PlayListCollection();
        artistsCollection = new ArtistsCollection();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("Options:");
            System.out.println("1 Add Artist"); // done
            System.out.println("-1 Remove Artist"); // done
            System.out.println("2 Add Album");
            System.out.println("3 Add Song"); // in work
            System.out.println("-3 Remove Song"); // in work
            System.out.println("4 Add Playlist");
            System.out.println("5 Search by Genre");
            System.out.println("6 Search by Playlist Title");
            System.out.println("7 Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addArtist();
                    break;
                case 2:
                    // Implement album addition
                    break;
                case 3:
                    addSong();
                    break;
                case 4:
                    // Implement playlist addition
                    break;
                case 5:
                    // Implement search by genre
                    break;
                case 6:
                    // Implement search by playlist title
                    break;
                case 7:
                    running = false;
                    break;
                case -1:
                    removeArtist();
                    break;
                case -3:
                    removeSong();
                    break;
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
        System.out.print("Enter song name: ");
        String name = scanner.nextLine();

        System.out.print("Enter song's duration in seconds: ");
        int durationInSeconds = scanner.nextInt();

        // фукнция, которая предложит выбрать музыкальный жанр из списка
        // select пункт жанра 1 - pop музыка, 2 - рок и тд

        Song song = new Song(name, durationInSeconds, genre_3, null, artist_1, album_1);
    }

    public void removeSong() {

    }

}
