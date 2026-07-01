// The first step in updating the models is to add an `id` member to each of the models.  This will allow us to uniquely
// identify each item in the database.  You should add this as a `private int id` member to each of the models, and provide
// getters and setters for the `id` member.  You should also update the constructors for each of the models to include the
// new `id` member.

package com.example.springBoot2.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
    
    @Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int year;
    private String artist;
    private int tracks;

    public Album() {
    }

    public Album(int id, String name, String artist, int year, int tracks) {
        this.id = id;           
        this.name = name;
        this.year = year;
        this.artist = artist;
        this.tracks = tracks;
    }       
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;   
    }
}
