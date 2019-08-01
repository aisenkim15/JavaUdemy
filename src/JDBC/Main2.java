package JDBC;

import JDBC.model.Artist;
import JDBC.model.DataSource;
import JDBC.model.SongArtist;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtist(DataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No Artists");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + " Name = " + artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsFromArtist("Iron Maiden", DataSource.ORDER_BY_ASC);
        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistForSong("She's On Fire", DataSource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for (SongArtist artist : songArtists) {
            System.out.println("Artist Name: " + artist.getArtistName() + " Album Name: " + artist.getAlbumName() +
                    "Song Track: " + artist.getTrack());
        }
        datasource.queryMetaData();
        datasource.close();
    }

}
