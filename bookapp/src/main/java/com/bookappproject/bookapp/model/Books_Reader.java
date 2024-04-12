public class Books_Reader {
    private int reader_id;
    private int book_id;
    private boolean book_read;
    private boolean book_wtr;
    private boolean book_dnf;
    private boolean book_owned;

    // constructors


    public Books_Reader(int reader_id, int book_id, boolean book_read, boolean book_wtr, boolean book_dnf, boolean book_owned) {
        this.reader_id = reader_id;
        this.book_id = book_id;
        this.book_read = book_read;
        this.book_wtr = book_wtr;
        this.book_dnf = book_dnf;
        this.book_owned = book_owned;
    }

    public Books_Reader(int reader_id, int book_id, boolean book_owned) {
        this.reader_id = reader_id;
        this.book_id = book_id;
        this.book_owned = book_owned;
    }

    // getters and setters
    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public boolean isBook_read() {
        return book_read;
    }

    public void setBook_read(boolean book_read) {
        this.book_read = book_read;
    }

    public boolean isBook_wtr() {
        return book_wtr;
    }

    public void setBook_wtr(boolean book_wtr) {
        this.book_wtr = book_wtr;
    }

    public boolean isBook_dnf() {
        return book_dnf;
    }

    public void setBook_dnf(boolean book_dnf) {
        this.book_dnf = book_dnf;
    }

    public boolean isBook_owned() {
        return book_owned;
    }

    public void setBook_owned(boolean book_owned) {
        this.book_owned = book_owned;
    }
}