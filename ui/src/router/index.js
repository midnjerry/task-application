import { createRouter as _createRouter, createWebHistory } from 'vue-router'
import TaskListView from '../views/TaskListView.vue';

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 */

const routes = [
  {
    path: '/',
    name: 'home',
    redirect: {name: 'allTasks'},
  },
  {
    path: '/tasks',
    name: 'allTasks',
    component: TaskListView,
  }
];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
