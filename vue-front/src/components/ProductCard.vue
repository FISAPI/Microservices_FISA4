<template>
  <BCard no-body class="overflow-hidden" style="max-width: 540px;">
    <BRow class="g-0">
      <BCol md="6" style="display: flex; justify-content: center; align-items: center;">
        <BCardImg
            :src="product.image"
            :alt="product.titre"
            class="rounded-0"
            style="height: 200px; width: auto;"
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
          <BButton @click="$emit('add-to-cart', product)" variant="primary">Ajouter au panier</BButton>
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
  }
}
</script>
