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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getImdb_rating() {
        return imdb_rating;
    }

    public void setImdb_rating(String imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public String getVote_count() {
        return vote_count;
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public String getYoutube_trailer_key() {
        return youtube_trailer_key;
    }

    public void setYoutube_trailer_key(String youtube_trailer_key) {
        this.youtube_trailer_key = youtube_trailer_key;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public ArrayList<String> getStars() {
        return stars;
    }

    public void setStars(ArrayList<String> stars) {
        this.stars = stars;
    }

    public ArrayList<String> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<String> directors) {
        this.directors = directors;
    }

    public ArrayList<String> getCreators() {
        return creators;
    }

    public void setCreators(ArrayList<String> creators) {
        this.creators = creators;
    }

    public ArrayList<String> getAdded_by() {
        return added_by;
    }

    public void setAdded_by(ArrayList<String> added_by) {
        this.added_by = added_by;
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
