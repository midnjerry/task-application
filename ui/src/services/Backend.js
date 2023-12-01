import axios from 'axios';

export default {
  getTasks() {
    return axios.get(`/api/tasks`);
  }
}