<template>
  <BNavbar variant="primary" v-b-color-mode="'dark'">
    <BNavbarBrand tag="h1" class="mb-0">FIS'AIR</BNavbarBrand>
    <BNavbarNav>
      <router-link to="/products"><BNavItem>Nos produits</BNavItem></router-link>
      <router-link to="/about"><BNavItem>Qui sommes-nous ?</BNavItem></router-link>
      <router-link to="/contact"><BNavItem>Contact</BNavItem></router-link>

    </BNavbarNav>

    <!-- Panier -->
    <BNavbarNav class="ml-auto">
      <router-link to="/cart"><BNavItem>Panier</BNavItem></router-link>
    </BNavbarNav>

  </BNavbar>

  <router-view/>
</template>

<script setup>
</script>