<template>
  <div class="contains bg-purple">
    <h1 style="text-align: center">À propos</h1>
    <div class="row">
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=13" class="img-left" alt="Image 1">
      </div>
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-white mx-5" style="font-size: 30px;">Bienvenue chez FIS'Air, votre destination ultime pour une bouffée d'air frais, aromatisée aux saveurs exquises des régions françaises les plus pittoresques. Nous sommes bien plus qu'une simple entreprise de bouteilles d'air ; nous sommes des artisans passionnés, dédiés à capturer l'essence même de la France à travers nos produits uniques.</p>
      </div>
    </div>
    <div class="row">
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-white mx-5" style="font-size: 30px;">Chez FIS'Air, nous croyons fermement en l'importance de la connexion entre l'homme et la nature. Inspirés par la diversité et la richesse des paysages français, nous avons entrepris le voyage fascinant de capturer ces moments éphémères dans chaque bouteille d'air que nous offrons.</p>
      </div>
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=14" class="img-right" alt="Image 2">
      </div>
    </div>
    <div class="row">
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=15" class="img-left" alt="Image 1">
      </div>
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-white mx-5" style="font-size: 30px;">Nos équipes parcourent les recoins les plus emblématiques de la France, des champs de lavande de Provence aux vignobles vallonnés de Bordeaux, à la recherche des arômes les plus délicats et des fragrances les plus envoûtantes. Chaque bouteille de FIS'Air est le fruit de cet engagement inébranlable envers l'authenticité et la qualité.</p>
      </div>
    </div>
    <div class="row">
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-white mx-5" style="font-size: 30px;">Que vous soyez un amateur de voyage cherchant à revivre les souvenirs d'une escapade passée en France, ou simplement à la recherche d'une bouffée d'inspiration au quotidien, FIS'Air est là pour vous transporter, littéralement, vers des horizons lointains et des expériences sensorielles uniques.</p>
      </div>
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=16" class="img-right" alt="Image 2">
      </div>
    </div>
    <div class="row">
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=17" class="img-left" alt="Image 1">
      </div>
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-white mx-5" style="font-size: 30px;">Nous nous engageons à offrir à nos clients une expérience exceptionnelle, de la qualité de nos produits à notre service client attentif. Rejoignez-nous dans cette aventure olfactive et découvrez la magie des saveurs françaises avec FIS'Air - là où chaque inhalation est une invitation au voyage.</p>
      </div>
    </div>
    <div class="row">
      <div class="col-md-6 d-flex align-items-center justify-content-center">
        <p class="text-black mx-5" style="font-size: 30px;">PS : En réalité, nous sommes juste 3 petits plaisantins qui utilisent ce sujet factice pour un projet d'école, si cela vous intéresse jetez un oeil sur GitHub : <a href="https://github.com/FISAPI/Microservices_FISA4" target="_blank">Microservices_INSA_FISA4_2024</a></p>
      </div>
      <div class="col-md-6">
        <img src="https://picsum.photos/1024/480/?image=18" class="img-right" alt="Image 2">
      </div>
    </div>
  </div>
</template>

<style scoped>
.img-left {
  max-width: 100%;
  height: auto;
  /* Ajoutez un trait oblique à l'image */
  clip-path: polygon(0 0, 100% 0, 75% 100%, 0 100%);
}
.img-right {
  max-width: 100%;
  height: auto;
  /* Faites pivoter l'image de 180 degrés autour de l'axe Y */
  transform: scaleX(-1);
  /* Ajoutez un trait oblique à l'image */
  clip-path: polygon(0 0, 100% 0, 75% 100%, 0 100%);
}

.bg-purple {
  background-color: rgba(109, 173, 193, 0.75);
  /*background-color: rgba(109, 173, 193, 0.75);*/
}

.fs-5 {
  font-size: 40px;
}
.contains {
  max-width: 100%;
  height: auto;
}
</style>
<script setup lang="ts">
</script>