<template>

  <BCard no-body class="overflow-hidden" style="max-width: 540px;">
    <BRow class="g-0">
      <BCol md="6" style="display: flex; justify-content: center; align-items: center;">
        <BCardImg
            :src="product.image"
            :alt="product.titre"
            class="rounded-0"
            style="height: 200px; !important; width: auto !important;"
        />
      </BCol>
      <BCol md="6">
        <BCardBody>
          <BCardTitle>{{ product.titre }}</BCardTitle>
          <BCardText>
            {{ product.description }}
            <h5>{{ product.prix }} €</h5>
          </BCardText>

          <BButton :href="'/product/' + product.id" variant="primary">Voir détails</BButton>
          <BButton href="#" variant="primary"  @click="addtoCart(product)">Ajouter au panier</BButton>
        </BCardBody>
      </BCol>
    </BRow>
  </BCard>

</template>


<script>
export default {
  name: 'ProductCard',
  props: {
    product: {
      type: Object,
      required: true
    }
  },
  methods: {
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
}

</script>
