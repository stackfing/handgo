import Vue from 'vue'
import Router from 'vue-router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import Category from '@/pages/category'
import ProductList from '@/pages/productList'
import Kill from '@/pages/Kill'
import login from '@/pages/login'
import banner from '@/pages/banner'
import home from '@/components/Home'
import users from '@/components/Users'
import notice from '@/components/Notice'

Vue.use(ElementUI)
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Category',
      component: login,
    },
    {
      path: '/login',
      component: login
    },
    {
      path: '/home',
      component: home,
      children: [
        {
          path: '',
          name: 'product',
          component: ProductList,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/product',
          name: 'product',
          component: ProductList,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/kill',
          name: 'kill',
          component: Kill,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/category',
          name: 'Category',
          component: Category,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/banner',
          name: 'banner',
          component: banner
        },
        {
          path: '/users',
          name: 'user',
          component: users
        },
        {
          path: '/notice',
          name: 'notice',
          component: notice
        }
      ]
    }
  ]
})
