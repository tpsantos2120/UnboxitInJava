package models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Watchlist {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String poster;
    private String media_type;
    private String title;
    private String description;
    private String year;
    private String release_date;
    private String imdb_id;
    private String imdb_rating;
    private String vote_count;
    private String youtube_trailer_key;
    private int runtime;
    private Date createdAt = new Date();
    private ArrayList<String> stars;
    private ArrayList<String> directors;
    private ArrayList<String> creators;
    private ArrayList<String> added_by;

    public Watchlist() {
    }

    public Watchlist(ObjectId id, String poster, String media_type, String title, String description, String year, String release_date, String imdb_id, String imdb_rating, String vote_count, String youtube_trailer_key, int runtime, Date createdAt, ArrayList<String> stars, ArrayList<String> directors, ArrayList<String> creators, ArrayList<String> added_by) {
        this.id = id;
        this.poster = poster;
        this.media_type = media_type;
        this.title = title;
        this.description = description;
        this.year = year;
        this.release_date = release_date;
        this.imdb_id = imdb_id;
        this.imdb_rating = imdb_rating;
        this.vote_count = vote_count;
        this.youtube_trailer_key = youtube_trailer_key;
        this.runtime = runtime;
        this.createdAt = createdAt;
        this.stars = stars;
        this.directors = directors;
        this.creators = creators;
        this.added_by = added_by;
    }

    public ObjectId getId() {
        return id;
    }

    public Watchlist setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Watchlist setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public String getMedia_type() {
        return media_type;
    }

    public Watchlist setMedia_type(String media_type) {
        this.media_type = media_type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Watchlist setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Watchlist setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Watchlist setYear(String year) {
        this.year = year;
        return this;
    }

    public String getRelease_date() {
        return release_date;
    }

    public Watchlist setRelease_date(String release_date) {
        this.release_date = release_date;
        return this;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public Watchlist setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
        return this;
    }

    public String getImdb_rating() {
        return imdb_rating;
    }

    public Watchlist setImdb_rating(String imdb_rating) {
        this.imdb_rating = imdb_rating;
        return this;
    }

    public String getVote_count() {
        return vote_count;
    }

    public Watchlist setVote_count(String vote_count) {
        this.vote_count = vote_count;
        return this;
    }

    public String getYoutube_trailer_key() {
        return youtube_trailer_key;
    }

    public Watchlist setYoutube_trailer_key(String youtube_trailer_key) {
        this.youtube_trailer_key = youtube_trailer_key;
        return this;
    }

    public int getRuntime() {
        return runtime;
    }

    public Watchlist setRuntime(int runtime) {
        this.runtime = runtime;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Watchlist setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ArrayList<String> getStars() {
        return stars;
    }

    public Watchlist setStars(ArrayList<String> stars) {
        this.stars = stars;
        return this;
    }

    public ArrayList<String> getDirectors() {
        return directors;
    }

    public Watchlist setDirectors(ArrayList<String> directors) {
        this.directors = directors;
        return this;
    }

    public ArrayList<String> getCreators() {
        return creators;
    }

    public Watchlist setCreators(ArrayList<String> creators) {
        this.creators = creators;
        return this;
    }

    public ArrayList<String> getAdded_by() {
        return added_by;
    }

    public Watchlist setAdded_by(ArrayList<String> added_by) {
        this.added_by = added_by;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watchlist watchlist = (Watchlist) o;
        return runtime == watchlist.runtime && id.equals(watchlist.id) && poster.equals(watchlist.poster) && media_type.equals(watchlist.media_type) && title.equals(watchlist.title) && description.equals(watchlist.description) && year.equals(watchlist.year) && release_date.equals(watchlist.release_date) && imdb_id.equals(watchlist.imdb_id) && imdb_rating.equals(watchlist.imdb_rating) && vote_count.equals(watchlist.vote_count) && youtube_trailer_key.equals(watchlist.youtube_trailer_key) && createdAt.equals(watchlist.createdAt) && stars.equals(watchlist.stars) && directors.equals(watchlist.directors) && creators.equals(watchlist.creators) && added_by.equals(watchlist.added_by);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, poster, media_type, title, description, year, release_date, imdb_id, imdb_rating, vote_count, youtube_trailer_key, runtime, createdAt, stars, directors, creators, added_by);
    }

    @Override
    public String toString() {
        return "Watchlist{" +
                "id=" + id +
                ", poster='" + poster + '\'' +
                ", media_type='" + media_type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", release_date='" + release_date + '\'' +
                ", imdb_id='" + imdb_id + '\'' +
                ", imdb_rating='" + imdb_rating + '\'' +
                ", vote_count='" + vote_count + '\'' +
                ", youtube_trailer_key='" + youtube_trailer_key + '\'' +
                ", runtime=" + runtime +
                ", createdAt=" + createdAt +
                ", stars=" + stars +
                ", directors=" + directors +
                ", creators=" + creators +
                ", added_by=" + added_by +
                '}';
    }
}
