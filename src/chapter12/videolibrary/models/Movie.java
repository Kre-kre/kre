package chapter12.videolibrary.models;


import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Movie extends Entity {
    private String title;
    private Date releaseDate;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    private List<Country> countries = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();
    private List<Director> directors = new ArrayList<>();

    public Movie() {

    }

    public Movie(String title, LocalDate releaseDate, List<Country> countries, List<Actor> actors, List<Director> directors) {
        this.title = title;
        this.releaseDate = Date.valueOf(releaseDate);
        this.countries = countries;
        this.actors = actors;
        this.directors = directors;
    }

    public Movie(int id, String title, LocalDate releaseDate, List<Country> country, List<Actor> actors, List<Director> directors) {
        super(id);
        this.title = title;
        this.releaseDate = Date.valueOf(releaseDate);
        this.countries = country;
        this.actors = actors;
        this.directors = directors;
    }

    public Movie(String title, LocalDate releaseDate) {
        this.title = title;
        this.releaseDate = Date.valueOf(releaseDate);
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void addDirector(Director director) {
        directors.add(director);
    }

    public List<Country> getCountry() {
        return countries;
    }

    public void setCountry(List<Country> country) {
        this.countries = country;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String getReleaseDate() {
        return String.valueOf(releaseDate);
    }

    public LocalDate getRelease() {
        return Instant.ofEpochMilli(releaseDate.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }


    @Override
    public String toString() {
        return "\n" +
                " MOVIE TITLE: " + title + "\n" +
                " ACTORS:  " + actors.toString().replaceAll("[\\]\\[]", "") + "\n" +
                " DIRECTORS:  " + directors.toString().replaceAll("[\\]\\[]", "") + "\n" +
                " RELEASE DATE: " + releaseDate.toString().replaceAll("[\\]\\[]", "") + "\n" +
                " COUNTRIES: " + countries.toString().replaceAll("[\\]\\[]", "");
    }
}
