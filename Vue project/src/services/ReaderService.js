import axios from "axios";

export default {
    getReaders() {
        return axios.get('/readers')
    },

    getReaderByReaderId(readerId) {
        return axios.get(`/readers/${readerId}`);
    }
}