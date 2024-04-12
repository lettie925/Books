<template>
    <div id = "home">
        <div id="welcome-msg">
            <h1>
                Welcome! ♡
            </h1>
            <img src="/img/totoro-umbrella.jpg" />
        </div>
        <div id="reader-selection">
            <div id="select-reader-text"> Select a reader: </div>
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
#welcome-msg>img {
    width: 250px;
}

#welcome-msg>h1 {
    text-align: center;
    margin-left: 75px;
}

#select-reader-text {
    margin-left: 75px;
}
</style>