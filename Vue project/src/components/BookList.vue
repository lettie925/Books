<template>
    <div id="book-list">
        <div id="books" v-for="book of bookList" v-bind:key="book.bookId" v-bind:book="book">
            <div id="book-name"> {{ book.title }} </div>
            
        </div>
    
    </div>
</template>

<script>
export default {
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

</style>