<template>
  <div class="home">Home page</div>
  <div v-if="loading">Chargement en cours...</div>
  <div v-else v-for="p in products" :key="p.title">
    <ProductCard :product="p" />
  </div>
</template>

<script>
import axios from 'axios';
import ProductCard from "@/components/ProductCard.vue";

export default {
  name: "Products",
  components: {
    ProductCard,
  },
  data() {
    return {
      products: [],
      loading: false
    };
  },
  created() {
    this.fetchProducts();
  },
  methods: {
    fetchProducts() {

      this.loading = true;
      axios.get('http://localhost:9004/spring-product/product/all', {
        headers: {
          'Content-Type': 'application/json'
        }
      })
          .then(response => {
            this.products = response.data;
            this.loading = false;
            console.log(response.data);
          })
          .catch(error => {
            console.error('Erreur lors de la récupération des produits:', error);
            this.loading = false;
          });

    }
  }
};
</script>