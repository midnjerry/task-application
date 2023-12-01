<template>
    <table>
        <thead>
            <th>Description</th>
            <th>Category</th>
            <th>Due Date</th>
            <th>Completed</th>            
        </thead>
        <tbody>
            <tr v-for="task in tasks" v-bind:key="task.id">
            <td>{{task.description}}</td>
            <td>{{task.category}}</td>
            <td>{{task.dueDate}}</td>
            <td><input type="checkbox" v-model="task.done"></td>
            </tr>
        </tbody>
    </table>
</template>
<script>
export default {
    name: 'task-table',
    props: ['tasks']
}
</script>
<style>
    
</style>