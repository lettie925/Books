import { createRouter as _createRouter, createRouter, createWebHistory } from 'vue-router';
import { useStore } from 'vuex'
import HomeView from '../views/HomeView.vue';
import ReaderProfileView from '../views/ReaderProfileView.vue';

const routes = [
    {
        path: '/',
        name: 'home', 
        component: HomeView
    },

    {
        path: "/reader/:readerId",
        name: "readerProfile",
        component: ReaderProfileView
    }
];

// Created router
const router = createRouter({
    history: createWebHistory(),
    routes: routes
});



export default router;