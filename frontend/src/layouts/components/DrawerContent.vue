<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Order' }" />
        <VerticalNavLink
            :item="{
                title: 'Order',
                to: '/orders',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Delivery' }" />
        <VerticalNavLink
            :item="{
                title: 'Delivery',
                to: '/deliveries',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Inventory' }" />
        <VerticalNavLink
            :item="{
                title: 'Inventory',
                to: '/inventories',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'ProductSearch',
                to: '/productSearches',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Customercenter' }" />
        <VerticalNavLink
            :item="{
                title: 'Event',
                to: '/events',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'MyPage',
                to: '/myPages',
            }"
        />
    </ul>
</template>
