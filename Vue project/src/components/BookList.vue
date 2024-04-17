<template>
    <div id="book-list">
        <div id="books" v-for="book of bookList" v-bind:key="book.bookId" v-bind:book="book">
            <book-card v-bind:book="book" />
            
        </div>
    
    </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';
export default {
    components: { BookCard },
    props: ['bookList']
}
</script>

<style>
#books>img{
    width: 100px;
    margin-left: 10px;
}

#books{
    display: flex;
    justify-content: space-between;
  
}

#book-list{
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    gap: 15px;
}

</style>