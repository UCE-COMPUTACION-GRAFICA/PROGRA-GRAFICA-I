var textura;
class Texturas{
   

constructor(nombre, pasox, pasoy){
    this.nombre=nombre;
    this.pasox=pasox;
    this.pasoy=pasoy;


}


 crear_texturas() {
    
        textura = new THREE.ImageUtils.loadTexture(this.nombre);
        //repetir la textura figura
       textura.repeat.set(this.pasox, this.pasoy);
        //repetir la textura de la figura
      textura.wrapS = textura.wrapT = THREE.RepeatWrapping;
      
        //textura_piedra=textura;

        return textura;
      }
}