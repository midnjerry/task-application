import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import axios from 'axios'

/* sets the base url for server API communication with axios */
axios.defaults.baseURL = import.meta.env.VITE_APP_REMOTE_API;

/* sets the base url for server API communication with axios */
axios.defaults.baseURL = import.meta.env.VITE_APP_REMOTE_API;

createApp(App).mount('#app')
