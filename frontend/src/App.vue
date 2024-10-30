<script setup>
const BASE_URL = import.meta.env.VITE_API_SERVER_URL;
</script>

<template>
  <div>
    API CALL BASE URL: {{ BASE_URL }}
  </div>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
