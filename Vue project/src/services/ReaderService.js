import axios from "axios";

export default {
    getReaders() {
        return axios.get('/readers')
    }
}