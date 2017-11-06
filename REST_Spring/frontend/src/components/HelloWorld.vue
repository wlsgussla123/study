<template>
  <div class="hello">
    {{rooms.id}} <br />
    {{rooms.title}} <br/>
    <img :src="rooms.thumbnailUrl" alt="">
  </br/>

  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      rooms : null,
    }
  },

  // Fetches posts when the component is created.
  mounted() {
    axios.get(`http://localhost:8080/rooms`)
    .then(response => {
      // JSON responses are automatically parsed.
      this.rooms = response.data
    })
    .catch(e => {
      this.errors.push(e)
    })

    // async / await version (created() becomes async created())
    //
    // try {
    //   const response = await axios.get(`http://jsonplaceholder.typicode.com/posts`)
    //   this.posts = response.data
    // } catch (e) {
    //   this.errors.push(e)
    // }
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
</style>
