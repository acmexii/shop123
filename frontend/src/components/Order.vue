<template>
    <div>
        <Number
            label="OrderId"
            v-model="value.orderId"
            :editMode="editMode"
        />
        <Date
            label="OrderDt"
            v-model="value.orderDt"
            :editMode="editMode"
        />
        <String
            label="Status"
            v-model="value.status"
            :editMode="editMode"
        />
        <div variant="outlined" class="my-2">
            <OrderItems v-model="orderItemsInput"
                offline
                label="OrderItems"
                :editMode="editMode"
                @change="change"
            />
            <v-row class="ma-0 pa-0 mt-2">
                <v-spacer></v-spacer>
                <v-btn @click="addOrderItemsList">OrderItems Add</v-btn>
            </v-row>
            <v-card v-if="value.orderItems.length > 0" variant="outlined" class="pa-4 mt-2">
                <v-card-sub-title>
                    OrderItems List
                </v-card-sub-title>
                <li v-for="(id, index) in value.orderItems" :key="index">
                    {{ id && id. ? id. : '' }}
                </li>
            </v-card>
        </div>
        <User
            offline
            label="user"
            v-model="value.user"
            :editMode="editMode"
            @change="change"
        />
        <Money
            offline
            label="Money"
            v-model="value.money"
            :editMode="editMode"
            @change="change"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Order',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "orders",
        orderItemsInput: null,
        value: {
            orderItems: [],
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
        addOrderItemsList() {
            if (this.orderItemsInput !== null && this.orderItemsInput !== '') {
                this.value.orderItems.push(this.orderItemsInput);
                this.orderItemsInput = null; // null로 초기화
            }
        },
    },
}
</script>
