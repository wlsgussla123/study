<template>
  <div class="hello">
    <h1 class="h1">{{ msg }}</h1>
    <h2>Essential Links</h2>
    <ul>
      <li><a href="http://vuejs-templates.github.io/webpack/" target="_blank">Docs for This Template</a></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App',
    };
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss" scoped>
.hello {
  h1 {
    color: red
  }
}
</style>
