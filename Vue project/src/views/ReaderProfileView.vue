<template>
    <h2> Hi, {{reader.name}}! ♡ </h2>
    <img src="/img/duck.jpg" />
    <div id="button-div">
    <button id="view-book-list" type ="button" v-on:click="showReadersBookList"> View book list </button>
    </div>
    <div id="readers-book-list" v-show="showList">
        
        <h2> Book List: </h2>
        <book-list v-bind:bookList="bookList" />
    </div>
</template>

<script>
import BookList from '../components/BookList.vue';
import BookService from '../services/BookService';
import ReaderService from '../services/ReaderService';
export default {
    components: { BookList },
    data() {
        return {
            readerId: this.$route.params.readerId,
            bookList: [],
            showList: false,
            reader: []
        }
    },

    methods: {
        showReadersBookList() {
            if (this.showList == false) {
                this.showList = true;
            } else {
                this.showList = false;
            }
        }
    },

    created() {
        BookService.getBooksByReaderId(this.readerId)
            .then(response => {
                this.bookList = response.data;
            })
            .catch((error) => {

            });

        ReaderService.getReaderByReaderId(this.readerId)
            .then(response => {
                this.reader = response.data;
            })
            .catch((error) => {

            });
    }
};
</script>

<style>
h2 {
    margin-left: 40px;
    
}

#button-div {
    margin-left: 40px;
}

#readers-book-list {
    margin-left: 40px;
}
</style>