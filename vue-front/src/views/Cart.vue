<template>
  <div class="pagetitle">Confirmation de votre commande</div>
  <BContainer fluid style="padding: 50px;">
    <BRow>
      <!-- Tableau des articles -->
      <BCol md="8">
        <BTable striped hover :items="cartItems" :fields="fields">
          <template #cell(actions)="data">
            <BButton @click="removeItem(data.item)" variant="danger">Supprimer</BButton>
          </template>
        </BTable>
      </BCol>

      <!-- Récapitulatif pour le paiement -->
      <BCol md="4">
        <div class="mb-3">
          <h5>Récapitulatif</h5>
          <BListGroup>
            <BListGroupItem>
              <div class="d-flex justify-content-between">
                <span>Sous-total</span>
                <span>{{ totalPrice }}€</span>
              </div>
            </BListGroupItem>
            <BListGroupItem>
              <div class="d-flex justify-content-between">
                <span>Total</span>
                <span>{{ totalPrice }}€</span>
              </div>
            </BListGroupItem>
            <BListGroupItem>
              <div class="d-flex justify-content-between">
                <span>(dont TVA)</span>
                <span>{{ totalTVA }}€</span>
              </div>
            </BListGroupItem>
          </BListGroup>
        </div>
        <BButton variant="success" block @click="proceedToPayment">Valider la commande</BButton>
      </BCol>
    </BRow>
  </BContainer>
</template>

<style>
  .pagetitle {
    font-size: 2em;
    margin: 1em;
    text-align: center;
  }

</style>

<script>
export default {
  data() {
    return {
      cartItems: [
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
  },
  computed: {
    totalPrice() {
      return this.cartItems.reduce((total, item) => total + (item.price * item.quantity), 0).toFixed(2);
    },
    totalTVA() {
      // Calcul de la TVA (par exemple 20%)
      return (this.totalPrice * 0.2).toFixed(2);
    }
  },
  methods: {
    removeItem(item) {
      const index = this.cartItems.indexOf(item);
      if (index !== -1) {
        this.cartItems.splice(index, 1);
      }
    },
    proceedToPayment() {
      // Ajoute ici la logique pour passer à l'étape de paiement
      console.log("Paiement en cours...");
    }
  }
};
</script>

<style scoped>
/* Ajoute ici des styles personnalisés si nécessaire */
</style>
