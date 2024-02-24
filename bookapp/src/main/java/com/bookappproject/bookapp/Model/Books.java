public class Books {
    private int book_id;
    private String title;
    private String description;
    private String genre;


    public Books(int book_id, String title) {
        this.book_id = book_id;
        this.title = title;
    }

    public Books(int book_id, String title, String description, String genre) {
        this.book_id = book_id;
        this.title = title;
        this.description = description;
        this.genre = genre;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}