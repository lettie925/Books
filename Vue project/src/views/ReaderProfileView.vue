<template>
    <div id="readers-book-list">
        <img src="/img/duck.jpg" />
        <h2> Book List: </h2>
        <book-list v-bind:bookList="bookList" />
    </div>
</template>

<script>
import BookList from '../components/BookList.vue';
import BookService from '../services/BookService';
export default {
    components: { BookList },
    data() {
        return {
            readerId: this.$route.params.readerId,
            bookList: []
        }
    },

    created() {
        BookService.getBooksByReaderId(this.readerId)
            .then(response => {
                this.bookList = response.data;
            })
            .catch((error) => {

            });
    }
};
</script>

<style>

</style>