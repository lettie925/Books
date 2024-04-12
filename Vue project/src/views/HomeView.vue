<template>
    <div id = "home">
        <div id="heading-line">
            <h1>
                Welcome to my book manager app ♡
            </h1>
        </div>
        <div id="reader-selection">
            Select a reader:
                <reader-list v-bind:readerList="readerList" />
        </div>
    </div>
</template>

<script>
import ReaderList from '../components/ReaderList.vue';
import ReaderService from '../services/ReaderService';

export default {
  components: { ReaderList },
    data() {
        return {
            readerList: [],
        };
    },


created() {
    ReaderService.getReaders()
        .then(response => {
            this.readerList = response.data;
            
        })
        .catch((error) => {
            
        });
    }
};
</script>

<style>

</style>