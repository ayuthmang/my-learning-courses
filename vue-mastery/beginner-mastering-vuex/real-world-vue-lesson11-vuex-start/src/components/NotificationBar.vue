<template>
  <div class="notification-bar" :class="notificationTypeClass">
    <p>{{ notification.message }}</p>
  </div>
</template>

<script>
import { mapActions } from 'vuex'

export default {
  props: {
    notification: {
      type: Object,
      required: true
    }
  },
  mounted() {
    this.timeout = setTimeout(() => this.remove(this.notification), 5000)
  },
  computed: {
    notificationTypeClass() {
      return `-text-${this.notification.type}`
    }
  },
  beforeDestroy() {
    clearTimeout(this.timeout)
  },
  methods: mapActions('notification', ['remove'])
}
</script>

<style scoped>
.notification-bar {
  margin: 1em 0 1em;
}
</style>
