<template>
  <div class="hello">
    <h1>hello, {{ this.name }} !</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App',
      name: '',
    };
  },

  mounted() {
    this.axios.get('http://localhost:8080/2')
    .then((res) => {
      console.log(res);
      this.name = res.data.userName;
    });
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

#test {
  h1 {
    color: red;
  }
}
</style>
