import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/orders',
      component: () => import('../components/ui/OrderGrid.vue'),
    },
    {
      path: '/deliveries',
      component: () => import('../components/ui/DeliveryGrid.vue'),
    },
    {
      path: '/inventories',
      component: () => import('../components/ui/InventoryGrid.vue'),
    },
    {
      path: '/events',
      component: () => import('../components/ui/EventGrid.vue'),
    },
    {
      path: '/myPages',
      component: () => import('../components/MyPageView.vue'),
    },
  ],
})

export default router;
