<template>
    <div id="readers-list">
        <div id="readers" v-for="reader of readerList" v-bind:key="reader.readerId" v-bind:reader="reader">
        <img src="img/totoro.jpg" />
        <div id="reader-name"> {{ reader.name }} </div>
        </div>
    
    </div>
</template>

<script>
export default {
    props: ['readerList']
    
}
</script>

<style>
#readers>img{
    width: 100px;
    margin-left: 10px;
}
#reader-name {
margin-left: 40px;

}
#readers{
    margin-left: 75px;
}

</style>