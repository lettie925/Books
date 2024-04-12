<template>
    <div id="readers-list">
        <div id="readers" v-for="reader of readerList" v-bind:key="reader.readerId" v-bind:reader="reader">
        {{ reader.name }}
        </div>
    
    </div>
</template>

<script>
export default {
    props: ['readerList']
    
}
</script>

<style>

</style>