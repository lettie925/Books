<template>
    <div id="book-card">
        <img src="/img/book.jpg" />
        <book id="book-title">
           <h3> Title: </h3>  {{ book.title }}
        </book>
        <book id="genre">
           <h3> Genre:</h3>  {{ book.genre }}
        </book>
    </div>
</template>

<script>
export default {
    props: ['book']
}
</script>

<style>
#book-card>img{
    width: 100px;
    height: 100px;
}

#book-card {
    width: 180px;
    
}
</style>