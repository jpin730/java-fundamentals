package Videogame;

public class Videogame {

    private int id;
    private String title;
    private String console;
    private int players;
    private String category;

    public Videogame() {
    }

    public Videogame(int id, String title, String console, int players, String category) {
        this.id = id;
        this.title = title;
        this.console = console;
        this.players = players;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Videogame{" + "id=" + id + ", title=" + title + ", console=" + console + ", players=" + players + ", category=" + category + '}';
    }

}
