public class ArtistMetaData {
    private String name;
    private String surname;
    private String nickname;
    private String country;

    public ArtistMetaData(String name, String surname, String nickname, String country) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.country = country;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
