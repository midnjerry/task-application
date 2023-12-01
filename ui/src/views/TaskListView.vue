<template>
    <div>
        This is the task page
        <task-table v-bind:tasks="tasks"></task-table>  
        {{ tasks }}
    </div>
</template>
<script>
import BackendClient from '../services/BackendClient.js';
import TaskTable from '../components/TaskTable.vue';

export default {
    name: 'task-list-view',
    components: {TaskTable},
    data() {
        return {
            tasks: []
        }
    },
    created(){
        BackendClient.getTasks().then((response)=> {
            this.tasks = response.data;
        }).catch(error=>console.error(error));
    }
}
</script>
<style>
    
</style>