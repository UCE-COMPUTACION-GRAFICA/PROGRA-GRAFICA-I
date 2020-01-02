var scene = new THREE.Scene();
var ancho = window.innerWidth,
  largo = window.innerHeight;
var angulo = 45,
  aspecto = ancho / largo,
  cerca = 0.1,
  lejos = 10000;
var camera = new THREE.PerspectiveCamera(angulo, aspecto, cerca, lejos);
var renderer = new THREE.WebGLRenderer();
var teclado = new THREEx.KeyboardState();
THREEx.WindowResize(renderer, camera); //se adapta al tamaño de la pantalla
var figura, material, textura;
var controls;
var cuboUno=new Cubo(1,2,3, 10, 20, 30, textura,false,0,0,0, 0, 0,0);  



inicio();
animacion();

function inicio() {
    renderer.setSize(ancho, largo);
    document.body.appendChild(renderer.domElement);
    material = new THREE.MeshBasicMaterial({ color: 0x00ff0000 });
    camera.position.z = 1000;
    camera.position.y = 100;
    camera.rotation.y = Math.PI;
    controls = new THREE.OrbitControls(camera, renderer.domElement);

    crear_texturas("texturas/adoquin_calle.jpg", 10, 10);

     
    cuboUno.crear_cubo();

  }

  function animacion() {
    requestAnimationFrame(animacion);
  
    render_modelo();
  }
  
  function render_modelo() {


    controls.update();
    renderer.render(scene, camera);
  }

  function crear_texturas(nombre, pasox, pasoy) {
    textura = new THREE.ImageUtils.loadTexture(nombre);
    //repetir la textura figura
    textura.repeat.set(pasox, pasoy);
    //repetir la textura de la figura
    textura.wrapS = textura.wrapT = THREE.RepeatWrapping;
  
    //textura_piedra=textura;
  }
  
  class Cubo{

    
    constructor(pos_x,pos_y,pos_z, tam_x, tam_y, tam_z,text,esq,rot_x,rot_y,rot_z, esc_x, esc_y,esc_z ){

        this.pos_x=pos_x;
        this.pos_y=pos_y;
        this.pos_z=pos_z;

        this.tam_x=tam_x;
        this.tam_y=tam_y;
        this.tam_z=tam_z;

        this.text=text;
        this.esq=esq;

        this.rot_x=rot_x;
        this.rot_y=rot_y;
        this.rot_z=rot_z;

        this.esc_x=esc_x;
        this.rot_y=rot_y;
        this.rot_z=rot_z;


    }




 crear_cubo() {
        var geometry = new THREE.BoxGeometry(this.tam_x, this.tam_y, this.tam_z);
        /* para ancho, largo, profunsdidad*/
        var material = new THREE.MeshBasicMaterial({
          map: this.text,
          side: THREE.DoubleSide,
          wireframe: this.esq
        });
      
        //var cube=new THREE.Mesh(geometry, material);
        var cubo = new THREE.Mesh(geometry, material);

        cubo.position.x = this.pos_x;
        cubo.position.y = this.pos_y;
        cubo.position.z = this.pos_z;

        
        cubo.rotation.x = this.rot_x;
        cubo.rotate.y = this.rot_y;
        cubo.rotate.z = this.rot_z;

        cubo.scalate.x = this.esc_x;
        cubo.scalate.y = this.esc_y;
        cubo.scalate.z = this.esc_z;


      }
}