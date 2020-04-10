<template>
  <div>
    <p>Count: {{ $store.state.count.count }}</p>
    <button @click="$store.dispatch('count/increment')">increment</button>

    <div>Name: {{ $store.state.user.user.name }}</div>
    <input
      @keypress="$store.dispatch('user/setUser', user)"
      v-model.trim="user.name"
    />
  </div>
</template>

<script>
export default {
  data() {
    return {
      user: {
        name: "anonymous"
      }
    };
  }
};
</script>
