<template>
  <div class="container">
    <form @submit.prevent="submitForm">
      <div class="form-group">
        <label for="email">Adresse e-mail</label>
        <input type="email" class="form-control" id="email" v-model="email">
      </div>
      <div class="form-group">
        <label for="name">Nom et prénom</label>
        <input type="text" class="form-control" id="name" v-model="name">
      </div>
      <div class="form-group">
        <label for="message">Message</label>
        <textarea class="form-control" id="message" v-model="message"></textarea>
      </div>
      <div class="button-container">
        <button class="btn btn-primary">Envoyer</button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      email: '',
      name: '',
      message: ''
    }
  },
  methods: {
    submitForm() {
      // Traitement du formulaire ici

      // Réinitialisation du formulaire
      this.resetForm();
    },
    resetForm() {
      this.email = '';
      this.name = '';
      this.message = '';
    },

  }
}
</script>
