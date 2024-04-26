<template>
  <div class="home">Home page</div>
  <ProductCard product=""/>
</template>

<script>
import ProductCard from "@/components/ProductCard.vue";

export default {
  name: "Home",
  components: {
    ProductCard,
  },
};
</script>