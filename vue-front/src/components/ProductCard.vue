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
  },
  data() {
    return {
      products: [
        { id: 1, name: "Equality - Jersey 2022", size: "XS", price: 34.90, quantity: 3 }
        // Ajoute d'autres articles selon ta structure de données
      ],
      fields: [
        { key: "actions", label: "", sortable: false },
        { key: "thumbnail", label: "Miniature" },
        { key: "name", label: "Produit" },
        { key: "price", label: "Prix" },
        { key: "quantity", label: "Quantité" },
        { key: "subtotal", label: "Sous-total" }
      ]
    };
}

</script>
