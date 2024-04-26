<template>

  <BCard
      :title="product.title"
      :img-src="product.image"
      :img-alt="product.title"
      img-top
      tag="article"
      style="max-width: 20rem;"
  >
    <BCardText>
      {{ product.description }}
      <h5>{{ product.prix }} €</h5>
    </BCardText>

    <BButton href="#" variant="primary">Voir détails</BButton>
    <BButton href="#" variant="primary">Ajouter au panier</BButton>
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
  }
}

</script>
