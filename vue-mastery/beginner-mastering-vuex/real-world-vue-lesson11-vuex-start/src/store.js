import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    user: { id: 'abc123', name: 'Adam Jahr' },
    categories: [
      'sustainability',
      'nature',
      'animal walfare',
      'housing',
      'education',
      'food',
      'community'
    ],
    todos: [
      { id: 1, text: '...', done: true },
      { id: 2, text: '...', done: false },
      { id: 3, text: '...', done: true },
      { id: 4, text: '...', done: false }
    ]
  },
  mutations: {},
  actions: {},
  getters: {
    catLength: state => state.categories.length,
    doneTodos: state => state.todos.filter(todo => todo.done),
    activeTodosCount: state => state.todos.filter(todo => !todo.done).length,
    getTodoById: state => id => state.todos.find(todo => todo.id === id)
  }
})
