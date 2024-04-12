import { createApp } from 'vue'
import { createStore } from './store'
import MyApp from './App.vue'
import router from './router'
import axios from 'axios'

import { library } from '@fortawesome/fontawesome-svg-core'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { createRouter } from 'vue-router'

axios.defaults.baseURL = import.meta.env.VITE_REMOTE_API;

const store = createStore();

const app = createApp(MyApp);
app.use(store);
app.use(router);
app.component('font-awesome-icon', FontAwesomeIcon)
app.mount('#app');