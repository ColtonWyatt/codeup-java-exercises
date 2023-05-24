package Movies;

public class Movie {

    private String name;

    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
