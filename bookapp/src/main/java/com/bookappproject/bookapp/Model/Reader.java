public class Reader {
    private int reader_id;
    private String name;
    private int age;
    private String favorite_book;
    private String favorite_genre;

    public Reader(int reader_id, String name, int age) {
        this.reader_id = reader_id;
        this.name = name;
        this.age = age;
    }

    public Reader(int reader_id, String name, int age, String favorite_book, String favorite_genre) {
        this.reader_id = reader_id;
        this.name = name;
        this.age = age;
        this.favorite_book = favorite_book;
        this.favorite_genre = favorite_genre;
    }

    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavorite_book() {
        return favorite_book;
    }

    public void setFavorite_book(String favorite_book) {
        this.favorite_book = favorite_book;
    }

    public String getFavorite_genre() {
        return favorite_genre;
    }

    public void setFavorite_genre(String favorite_genre) {
        this.favorite_genre = favorite_genre;
    }
}