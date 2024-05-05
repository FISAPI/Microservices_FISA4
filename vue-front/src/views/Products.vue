<template>
  <div class="pagetitle">Nos produits</div>
  <BContainer>
    <div v-if="loading">Chargement en cours...</div>
    <div v-else class="products-container">
      <ProductCard class="product" v-for="p in products" :key="p.title" :product="p" @add-to-cart="addToCart" />
    </div>
  </BContainer>
</template>

<style>
.pagetitle {
  font-size: 2em;
  margin: 1em;
  text-align: center;
}

.products-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.product {
  margin: 1em;
}
</style>

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
      cart: [],
      loading: false
    };
  },
  created() {
    this.loadCart();
    this.fetchProducts();
  },
  methods: {
    fetchProducts() {
      this.loading = true;
      axios
          .get('http://localhost:9004/spring-product/product/all', {
            headers: { 'Content-Type': 'application/json' }
          })
          .then(response => {
            this.products = response.data;
            this.loading = false;
          })
          .catch(error => {
            console.error('Erreur lors de la récupération des produits:', error);
            this.loading = false;
          });
    },
    loadCart() {
      const cartData = localStorage.getItem('cart');
      this.cart = cartData ? JSON.parse(cartData) : [];
    },
    saveCart() {
      localStorage.setItem('cart', JSON.stringify(this.cart));
    },
    addToCart(product) {
      const existingProduct = this.cart.find(item => item.id === product.id);
      if (existingProduct) {
        // Augmenter la quantité du produit existant
        existingProduct.quantity += 1;
      } else {
        // Ajouter un nouveau produit avec une quantité de 1
        this.cart.push({ ...product, quantity: 1 });
      }
      this.saveCart();
    }
  }
};
</script>