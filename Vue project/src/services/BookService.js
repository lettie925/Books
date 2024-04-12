import axios from "axios";

export default {
    getBooks() {
        return axios.get('/books');
    },

    getBooksByReaderId(readerId) {
        return axios.get(`/books/${readerId}`);
    }
}