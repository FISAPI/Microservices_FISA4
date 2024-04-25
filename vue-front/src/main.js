import { createApp } from 'vue'
import { createBootstrap } from 'bootstrap-vue-next'

import App from './App.vue'
import router from './router'


// Add the necessary CSS
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue-next/dist/bootstrap-vue-next.css'


createApp(App).use(router).use(createBootstrap({components: true, directives: true})).mount('#app')
