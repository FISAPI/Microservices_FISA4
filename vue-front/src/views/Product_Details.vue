<template>
  <div class="container">
    <div class="row" v-if="product">
      <div class="col-md-6">
        <img :src="'../' + product.image" alt="Produit" class="img-fluid">
      </div>
      <div class="col-md-6">
        <h2>{{ product.title }}</h2>
        <p>{{ product.description }}</p>
        <p>Prix : {{ product.prix }} €</p>
        <button @click="addtoCart(product)" class="btn btn-primary">Ajouter au panier</button>
      </div>
    </div>
    <div v-else>
      <p>Chargement du produit...</p>
    </div>
  </div>
</template>


<style scoped>
.img-fluid {
  max-width: 100%;
  height: auto;
}
</style>

<script>
import axios from 'axios';
export default {
  name: "Product_details",
  components: {},
  data() {
    return {
      product: {
        title: '',
        description: '',
        prix: 0,
        image: ''
      },
      loading: false
    };
  },
  created() {
    const productId = this.$route.params.id
    this.fetchProducts(productId);
  },
  methods: {
    fetchProducts(id) {
      this.loading = true;

      axios.get('http://localhost:9004/spring-product/product/${id}', {
      headers: {
        'Content-Type': 'application/json'
      }
    })
    .then(response => {
      this.product = response.data;
      this.loading = false;
      console.log(response.data);
    })
    .catch(error => {
      console.error('Erreur lors de la récupération du produit:', error);
      this.loading = false;
    });
    },
    addtoCart(product) {
      // s'assurer que l'utilisateur a entré quelque chose
      if (!product) {
        return;
      }

      super.cart.push(product);
      this.saveCart();
    },
    saveCart() {
      const parsed = JSON.stringify(super.cart);
      localStorage.setItem('cart', parsed);
    },

}

};
</script>