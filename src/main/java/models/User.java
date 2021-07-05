package models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class User {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Date createdAt = new Date();
    private ArrayList<Watchlist> watchlistId;

    public User() {
    }

    public User(ObjectId id, String firstName, String lastName, String username, String email, String password, Date createdAt, ArrayList<Watchlist> watchlistId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.watchlistId = watchlistId;
    }

    public ObjectId getId() {
        return id;
    }

    public User setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public User setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ArrayList<Watchlist> getWatchlistId() {
        return watchlistId;
    }

    public User setWatchlistId(ArrayList<Watchlist> watchlistId) {
        this.watchlistId = watchlistId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && firstName.equals(user.firstName) && lastName.equals(user.lastName) && username.equals(user.username) && email.equals(user.email) && password.equals(user.password) && createdAt.equals(user.createdAt) && watchlistId.equals(user.watchlistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, username, email, password, createdAt, watchlistId);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", watchlistId=" + watchlistId +
                '}';
    }
}
