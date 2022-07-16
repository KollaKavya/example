package pack_16072022;

public class Book_det {
    public int id;
    public String name;
    public String genre;
    public float cost;
    public int sellc;

    public Book_det() {
    }

    public Book_det(int id, String name, String genre, float cost, int sellc) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.cost = cost;
        this.sellc=sellc;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getSellc() {
        return sellc;
    }

    public void setSellc(int sellc) {
        this.sellc = sellc;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                ", sellc=" + sellc +
                '}';
    }
}
