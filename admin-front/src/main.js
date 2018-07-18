// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import  VueResource  from 'vue-resource'

Vue.use(VueResource) 

Vue.config.productionTip = false

// Vue.prototype.HOST = ''

// router.beforeEach((to, from, next) => {
//   if(to.meta.requireAuth) {
//     if(localStorage.getItem('username') === 'username'){
//       // alert(from)
//       console.log(to)
//       next()
//     } else {
//       next({
//         path: '/login'
//       })
//     }
    
//   } else {
//     next()
//   }
// })

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
