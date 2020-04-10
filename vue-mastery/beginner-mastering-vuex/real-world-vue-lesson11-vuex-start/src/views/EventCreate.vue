<template>
  <div>
    <h1>Create Event, {{ user.name }}</h1>
    <p>This event was created by {{ user.name }}</p>
    <ul>
      <li v-for="cat in categories" :key="cat">{{ cat }}</li>
    </ul>
    <p>There are {{ catLength }} categories.</p>
    <p>{{ $store.getters.doneTodos.length }}</p>
    <p>{{ $store.getters.activeTodosCount }}</p>
    <p>{{ getTodoById(1) }}</p>
  </div>
</template>

<script>
import { mapState, mapGetters } from 'vuex'

export default {
  computed: {
    ...mapGetters(['catLength', 'getTodoById']),
    ...mapState(['user', 'categories'])
  }
}
</script>
