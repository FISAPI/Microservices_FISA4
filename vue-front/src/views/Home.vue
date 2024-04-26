<template>
  <BCarousel indicators ride="carousel">
    <BCarouselSlide img-src="https://picsum.photos/1920/920/?image=10">
      <div class="custom-caption">
        <h1>Prenez une bouffée de France</h1>
        <h4>Voyagez à travers les arômes uniques de nos régions, de la douceur des champs de lavande provençaux aux embruns salés de la Bretagne.</h4>
        <br>
        <router-link to="/products"><BButton pill variant="primary">Découvrez nos produits</BButton></router-link>
      </div>
    </BCarouselSlide>
    <BCarouselSlide img-src="https://picsum.photos/1920/920/?image=11">
      <div class="custom-caption">
        <h1>L'air pur à votre portée</h1>
        <h4>Chaque flacon capture l'essence pure d'un lieu, vous offrant une expérience sensorielle directement issue des paysages les plus emblématiques de France.</h4>
        <br>
        <router-link to="/products"><BButton pill variant="primary">Découvrez nos produits</BButton></router-link>
      </div>
    </BCarouselSlide>
    <BCarouselSlide img-src="https://picsum.photos/1920/920/?image=12">
      <div class="custom-caption">
        <h1>Nous, on ne manque pas d'air !</h1>
        <h4>Nos bouteilles, véritables concentrés de terroir, vous transportent instantanément dans les régions les plus pittoresques et respirent la diversité culturelle et naturelle de notre pays.</h4>
        <br>
        <router-link to="/products"><BButton pill variant="primary">Découvrez nos produits</BButton></router-link>
      </div>
    </BCarouselSlide>
  </BCarousel>
</template>

<style>
.carousel-caption {
  height: 100%;
  width: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  color: white;
  right: 0 !important;
  bottom: 0 !important;
  left: 0 !important;
  padding-top: 0 !important;
  padding-bottom: 0 !important;
}

.custom-caption {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
  color: white;
}
</style>

<script>
export default {
  name: "Home",
  components: {},
};
</script>