package exercise2;

public class Ticket {
    private int id;
    private Movie movie;
    private Client client;

    public Ticket(int id, Movie movie, Client client) {
        this.id = id;
        this.movie = movie;
        this.client = client;
    }

    public String getInfo() {
        return id + " | " + movie.getMovieInfo() + " | " + client.getFullName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
