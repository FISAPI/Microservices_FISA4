<template>
  <div class="pagetitle">Confirmation de votre commande</div>
  <BContainer fluid style="padding: 50px;">
    <BRow>
      <!-- Tableau des articles -->
      <BCol md="8">
        <BTable striped hover :items="cartItems" :fields="fields">
          <!-- Symbole "X" pour la suppression -->
          <template #cell(actions)="data">
            <span
                style="cursor: pointer; color: red;"
                @click="removeItem(data.item)"
            >
              X
            </span>
          </template>
          <!-- Miniature du produit -->
          <template #cell(thumbnail)="data">
            <img :src="data.item.image" alt="Miniature" width="50" />
          </template>
          <!-- Champ ajustable pour la quantité -->
          <template #cell(quantity)="data">
            <BFormInput
                type="number"
                min="1"
                v-model.number="data.item.quantity"
                @change="updateQuantity(data.index, data.item.quantity)"
                style="width: 60px;"
            />
          </template>
          <!-- Sous-total pour chaque ligne -->
          <template #cell(subtotal)="data">
            {{ calculateSubtotal(data.item) }}€
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
        <div class="mb-3">
          <h5>Information de paiement</h5>
          <BFormGroup label="Numéro de Carte Bancaire">
            <BFormInput
                type="text"
                v-model="creditCardNumber"
                placeholder="Entrez votre numéro de carte"
            />
          </BFormGroup>
        </div>
        <BButton variant="success" block @click="proceedToPayment">Valider la commande</BButton>
      </BCol>
    </BRow>
  </BContainer>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      cartItems: [],
      creditCardNumber: '',
      fields: [
        { key: "actions", label: "", sortable: false },
        { key: "thumbnail", label: "Miniature" },
        { key: "titre", label: "Produit" },
        { key: "prix", label: "Prix" },
        { key: "quantity", label: "Quantité" },
        { key: "subtotal", label: "Sous-total" }
      ]
    };
  },
  created() {
    this.loadCart();
  },
  computed: {
    totalPrice() {
      return this.cartItems
          .reduce((total, item) => total + parseFloat(item.prix) * parseInt(item.quantity), 0)
          .toFixed(2);
    },
    totalTVA() {
      // Calcul de la TVA (par exemple 20%)
      return (this.totalPrice * 0.2).toFixed(2);
    }
  },
  methods: {
    loadCart() {
      const cartData = localStorage.getItem("cart");
      this.cartItems = cartData ? JSON.parse(cartData) : [];
    },
    saveCart() {
      localStorage.setItem("cart", JSON.stringify(this.cartItems));
    },
    updateQuantity(index, quantity) {
      // Vérifie que la quantité soit au moins 1
      if (quantity < 1) {
        quantity = 1;
      }

      // Utilise `Vue.set` pour garantir la réactivité
      this.$set(this.cartItems, index, {
        ...this.cartItems[index],
        quantity: quantity
      });

      this.saveCart();
    },
    removeItem(item) {
      const index = this.cartItems.indexOf(item);
      if (index !== -1) {
        this.cartItems.splice(index, 1);
        this.saveCart();
      }
    },
    calculateSubtotal(item) {
      const prix = parseFloat(item.prix);
      const quantity = parseInt(item.quantity);
      return (prix * quantity).toFixed(2);
    },
    proceedToPayment() {
      const payload = {
        creditCardNumber: this.creditCardNumber
      };

      axios
          .post('http://localhost:9004/spring-pay/pay/validate', payload)
          .then(response => {
            console.log('Commande validée:', response.data);
            alert('Commande validée avec succès!');
            // Tu peux vider le panier ici si besoin
          })
          .catch(error => {
            console.error('Erreur lors de la validation de la commande:', error);
            alert('Erreur lors de la validation de la commande.');
          });
    }
  }
};
</script>

<style scoped>
.pagetitle {
  font-size: 2em;
  margin: 1em;
  text-align: center;
}
</style>
