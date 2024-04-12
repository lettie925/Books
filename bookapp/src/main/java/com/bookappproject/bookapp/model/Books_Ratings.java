package com.bookappproject.bookapp.model;

public class Books_Ratings {
    private int books_ratings_id;
    private int reader_id;
    private int book_id;
    private int rating;
    private String review;
    private boolean isLoved;
    private boolean isHated;

    // constructors
    public Books_Ratings(int books_ratings_id, int reader_id, int book_id, int rating, String review, boolean isLoved, boolean isHated) {
        this.books_ratings_id = books_ratings_id;
        this.reader_id = reader_id;
        this.book_id = book_id;
        this.rating = rating;
        this.review = review;
        this.isLoved = isLoved;
        this.isHated = isHated;
    }

    public Books_Ratings(int books_ratings_id, int reader_id, int book_id, int rating) {
        this.books_ratings_id = books_ratings_id;
        this.reader_id = reader_id;
        this.book_id = book_id;
        this.rating = rating;
    }

    // getters and setters
    public int getBooks_ratings_id() {
        return books_ratings_id;
    }

    public void setBooks_ratings_id(int books_ratings_id) {
        this.books_ratings_id = books_ratings_id;
    }

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public boolean isLoved() {
        return isLoved;
    }

    public void setLoved(boolean loved) {
        isLoved = loved;
    }

    public boolean isHated() {
        return isHated;
    }

    public void setHated(boolean hated) {
        isHated = hated;
    }
}