<template>
    <div>
        <String
            label="EventNmae"
            v-model="value.eventNmae"
            :editMode="editMode"
        />
        <Date
            label="From"
            v-model="value.from"
            :editMode="editMode"
        />
        <Date
            label="To"
            v-model="value.to"
            :editMode="editMode"
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
    name: 'Event',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "events",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
