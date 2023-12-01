import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import axios from 'axios'
import { createRouter } from './router'

/* sets the base url for server API communication with axios */
axios.defaults.baseURL = import.meta.env.VITE_APP_REMOTE_API;

/* sets the base url for server API communication with axios */
axios.defaults.baseURL = import.meta.env.VITE_APP_REMOTE_API;

const router = createRouter();

const app = createApp(App)
app.use(router);
app.mount('#app')
