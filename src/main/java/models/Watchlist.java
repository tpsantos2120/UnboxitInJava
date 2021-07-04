package models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;

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

}
