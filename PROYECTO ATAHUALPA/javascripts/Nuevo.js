/* VARIABLES*/

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
var figura, material, textura_fig;
var cubo;
var sphere;
var cilindro;
var controls;
var reloj;
var figura_j;
var plano;
var triangulo;
var mallaextrusion;

var textura, textura2, textura_piedra, textura_cesped;
pivotPoint = new THREE.Object3D();
//pivotPoint.position.set(0,20,0);

pivotPuerta = new THREE.Object3D();
pivotPuerta2 = new THREE.Object3D();
pivotPuerta3 = new THREE.Object3D();
pivotPuerta4 = new THREE.Object3D();
pivotPuerta5 = new THREE.Object3D();

Puertapeque1 = new THREE.Object3D();
Puertapeque2 = new THREE.Object3D();

ventana1 = new THREE.Object3D();
ventana2 = new THREE.Object3D();

ventana3 = new THREE.Object3D();
ventana4 = new THREE.Object3D();

lado1 = new THREE.Object3D();
lado2 = new THREE.Object3D();

baseiglesia = new THREE.Object3D();



class Textura{
  crear_texturas(nombre, pasox, pasoy) {
    textura = new THREE.ImageUtils.loadTexture(nombre);
    //repetir la textura figura
    textura.repeat.set(pasox, pasoy);
    //repetir la textura de la figura
    textura.wrapS = textura.wrapT = THREE.RepeatWrapping;
  
    //textura_piedra=textura;
  }
}

class Cilindro

 {

 
crearCilindro(pos_x,
  pos_y,
  pos_z,
  rot_x,
  rot_y,
  rot_z,
  esc_x,
  esc_y,
  esc_z,
  ancho,
  altura,
  text,
  esq){

 var geometria_cilindro = new THREE.CylinderGeometry(
    ancho,
    ancho,
   altura,
    30,
    30,
    false
  );

  var material = new THREE.MeshBasicMaterial({
    map: text,
    side: THREE.DoubleSide,
    wireframe: esq
  });

  cilindro = new THREE.Mesh(geometria_cilindro, material);

  cilindro.position.x = pos_x;
  cilindro.position.y = pos_y;
  cilindro.position.z = pos_z;

  cilindro.rotation.x = rot_x;
  cilindro.rotation.y = rot_y;
  cilindro.rotation.z = rot_z;

  cilindro.scale.x = esc_x;
  cilindro.scale.y = esc_y;
  cilindro.scale.z = esc_z;

  //scene.add(pivotPuerta);
  scene.add(cilindro);
}
  
}

class PlanoBase{
   PlanoPrincipal() {

    var nuevo=new Plano();
    
  
    //crear_plano();
    t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
  
    nuevo.crear_plano(0, 0, 290, 2000, 2000, Math.PI / 2, 0, textura);
  }
}


class Cubo{
 crear_cubo(
    pos_x,
    pos_y,
    pos_z,
    x,
    z,
    y,
    text,
    esq,
    rot_x,
    rot_y,
    rot_z,
    esc_x,
    esc_y,
    esc_z
  ) {
    var geometry = new THREE.BoxGeometry(x, z, y);
    /* para ancho, largo, profunsdidad*/
    var material = new THREE.MeshBasicMaterial({
      map: text,
      side: THREE.DoubleSide,
      wireframe: esq
    });
  
    //var cube=new THREE.Mesh(geometry, material);
    cubo = new THREE.Mesh(geometry, material);
    cubo.position.x = pos_x;
    cubo.position.y = pos_y;
    cubo.position.z = pos_z;
  
    cubo.rotation.x = rot_x;
    cubo.rotation.y = rot_y;
    cubo.rotation.z = rot_z;
  
    cubo.scale.x = esc_x;
    cubo.scale.y = esc_y;
    cubo.scale.z = esc_z;
  
    // scene.add(pivotPuerta);
  
    scene.add(pivotPoint);
    scene.add(cubo);
  }
}


class Esfera{
   crear_esfera(
    pos_x,
    pos_y,
    pos_z,
    rot_x,
    rot_y,
    rot_z,
    esc_x,
    esc_y,
    esc_z,
    textura,
    esq,
    t,
    par
  ) {
    var geometry = new THREE.SphereGeometry(t, par, par);
  
    var material = new THREE.MeshBasicMaterial({
      map: textura,
      side: THREE.DoubleSide,
      wireframe: esq
    });
  
    sphere = new THREE.Mesh(geometry, material);
  
    sphere.position.x = pos_x;
    sphere.position.y = pos_y;
    sphere.position.z = pos_z;
  
    sphere.rotation.x = rot_x;
    sphere.rotation.y = rot_y;
    sphere.rotation.z = rot_z;
  
    sphere.scale.x = esc_x;
    sphere.scale.y = esc_y;
    sphere.scale.z = esc_z;
  
    scene.add(pivotPoint);
    scene.add(sphere);
  }
    
}

class Plano{
  crear_plano(pos_x, pos_y, pos_z, ancho, largo, rotx, roty, text) {
    //geometria plano
    plano = new THREE.PlaneGeometry(ancho, largo, 10, 10);
    //material Y textura
    var material_plano = new THREE.MeshBasicMaterial({
      map: text,
      side: THREE.DoubleSide
    });
    //plano territorio
    var territorio = new THREE.Mesh(plano, material_plano);
  
    territorio.position.x = pos_x;
    territorio.position.y = pos_y;
    territorio.position.z = pos_z;
  
    territorio.rotation.y = roty;
    territorio.rotation.x = rotx;
  
    scene.add(territorio);
  }
} 




class Iglesia{
  constructor( pos_x,
    pos_y,
    pos_z,
    rot_x,
    rot_y,
    rot_z,
    esc_x,
    esc_y,
    esc_z){

this.pos_x=pos_x;
this.pos_y=pos_y;
this.pos_z=pos_z;

this.rot_x=rot_x;
this.rot_y=rot_y;
this.rot_z=rot_z;

this.esc_x=esc_x;
this.esc_y=esc_y;
this.esc_z=esc_z;

  }

  crearIglesia(){


//iglesia

  //parte baja
  t.crear_texturas("texturas/muro.jpg", 10, 5);
  //100-140
  cu.crear_cubo(200, 50, -350, 450, 140, 590, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //parte de columnas
  t.crear_texturas("texturas/muro2.jpg", 1, 2);
  //izquierda
  cu.crear_cubo(-13, 50, -50, 25, 140, 10, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //derecha
  cu.crear_cubo(115, 50, -50, 25, 140, 10, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //del otro lado
  //izquierda
  cu.crear_cubo(280, 50, -50, 25, 140, 10, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //derecha
  cu.crear_cubo(413, 50, -50, 25, 140, 10, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //parte amarilla
  t.crear_texturas("texturas/amarillo_4.jpg", 1, 1);
  //190-210
  cu.crear_cubo(200, 195, -350, 450, 150, 590, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  //partes altas
  //izquierda
  t.crear_texturas("texturas/amarillo.jpg", 2, 2);
  cu.crear_cubo(50, 290, -130, 150, 50, 150, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //derecha
  cu.crear_cubo(350, 290, -130, 150, 50, 150, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //crear parte abajo gradas----parte izquierda
  t.crear_texturas("texturas/muro3.jpg", 5, 1);
  cu.crear_cubo(-6, 15, -30, 275, 30, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  t.crear_texturas("texturas/muro.jpg", 5, 0.5);
  cu.crear_cubo(-6, 35, -7, 275, 10, 5, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  //pRTE DERECHA
  t.crear_texturas("texturas/muro3.jpg", 5, 1);
  cu.crear_cubo(400, 15, -30, 275, 30, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  t.crear_texturas("texturas/muro.jpg", 5, 0.5);
  cu.crear_cubo(400, 35, -7, 275, 10, 5, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  //gradas centrales

  t.crear_texturas("texturas/muro.jpg", 4, 0.1);
  cu.crear_cubo(197, 2.5, -30, 131, 5, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  //crear_texturas("texturas/piedra.webp",4,0.1);
  cu.crear_cubo(197, 7.5, -35, 131, 5, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);
  t.crear_texturas("texturas/muro.jpg", 4, 0.1);
  cu.crear_cubo(197, 12.5, -40, 131, 5, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  //crear_texturas("texturas/piedra.webp",4,0.1);
  cu.crear_cubo(197, 17.5, -45, 131, 5, 50, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  t.crear_texturas("texturas/muro.jpg", 4, 0.1);
  cu.crear_cubo(197, 22.5, -50, 131, 5, 50, textura, false, 0, 0, 0, 1, 1, 1);
  //crear_texturas("texturas/piedra.webp",4,0.1);
  //crear_cubo(197,30,-55,131, 2, 50,textura, false);

  pivotPoint.add(cubo);

  t.crear_texturas("texturas/amarillo_3.jpg", 4, 0.1);
  cu.crear_cubo(200, 150, -515, 800, 300, 250, textura, false, 0, 0, 0, 1, 1, 1);
  pivotPoint.add(cubo);

  //PUERTAS

  t.crear_texturas("texturas/puerta.png", 1, 0.6);
  textura2 = textura;
  t.crear_texturas("texturas/puerta.png", 1, 1);

  i.puertas(-66, -55, 0, 0, 0, 0, 1.9, 1.55, 1, textura2, textura);

  pivotPoint.add(pivotPuerta);

  //*******puerta izquierda

  pivotPuerta = pivotPuerta2;
  i.puertas(-133, -47, 0, 0, 0, 0, 1.3, 1.4, 1, textura2, textura);

  pivotPoint.add(pivotPuerta);

  //puerta derecha
  pivotPuerta = pivotPuerta3;
  i.puertas(165, -47, 0, 0, 0, 0, 1.3, 1.4, 1, textura2, textura);

  pivotPoint.add(pivotPuerta);

  //puerta del otro lado DERECHO
  pivotPuerta = pivotPuerta4;

  i.puertas(655, -75, -270, 0, Math.PI / 2, 0, 1.8, 1.55, 1, textura2, textura);

  pivotPoint.add(pivotPuerta);

  //puerta del otro lado izquierdo

  pivotPuerta = pivotPuerta5;
  i.puertas(-80, -65, -225, 0, -Math.PI / 2, 0, 0.85, 1.55, 1, textura2, textura);

  pivotPoint.add(pivotPuerta);

  //VENTANAS

  //ventana derecha
  //cuadrado
  t.crear_texturas("texturas/ventana.png", 1, 0.5);
  textura2 = textura;
  t.crear_texturas("texturas/ventana.png", 1, 1.05);

  pivotPuerta = ventana1;
  i.puertas(250, 205, 0, 0, 0, 0, 0.7, 0.5, 1, textura2, textura);
  pivotPoint.add(pivotPuerta);
  //ventana izquierd

  pivotPuerta = ventana2;
  i.puertas(-50, 205, 0, 0, 0, 0, 0.7, 0.5, 1, textura2, textura);
  pivotPoint.add(pivotPuerta);

  //VENTANAS CENTRALES

  pivotPuerta = ventana3;
  i.puertas(160, 175, 0, 0, 0, 0, 0.6, 0.4, 1, textura2, textura);
  pivotPoint.add(pivotPuerta);

  pivotPuerta = ventana4;
  i.puertas(60, 175, 0, 0, 0, 0, 0.6, 0.4, 1, textura2, textura);
  pivotPoint.add(pivotPuerta);

  //ventana redonda

  //parte blanca
  t.crear_texturas("texturas/blanco.jpg", 1, 1.05);
  ci.crearCilindro(
    195,
    210,
    -50,
    Math.PI / 2,
    0,
    0,
    1.5,
    1,
    1,
    11.5,
    2,
    textura,
    false
  );
  pivotPoint.add(cilindro);

  t.crear_texturas("texturas/ventana.png", 1, 1.05);
  ci.crearCilindro(
    195,
    210,
    -49,
    Math.PI / 2,
    Math.PI / 2,
    0,
    0.7,
    5,
    1,
    11,
    1,
    textura,
    false
  );
  pivotPoint.add(cilindro);

  //PARTES ALTAS DE IGLESIA

  i.partealta(50);
  i.partealta(350);

  //TRIANGULO
  t.crear_texturas("texturas/amarillo_2.jpg", 1, 1.05);
  i.cargar_triangulo(120, 270, -85, 0, 0, 0, textura, false);
  pivotPoint.add(triangulo);

  //partes de lados figura
  i.cargar_modelo(-60, 0, -85, 0, 0, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(-60, 0, -160, 0, 0, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(-60, 0, -235, 0, 0, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(-60, 0, -305, 0, 0, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(-60, 0, -375, 0, 0, 0);
  pivotPoint.add(mallaextrusion);

  //derecha

  i.cargar_modelo(460, 0, -55, 0, Math.PI, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(460, 0, -130, 0, Math.PI, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(460, 0, -205, 0, Math.PI, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(460, 0, -275, 0, Math.PI, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(460, 0, -345, 0, Math.PI, 0);
  pivotPoint.add(mallaextrusion);

  //atras izquierda
  i.cargar_modelo(-120, 0, -355, 0, Math.PI / 2, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(-190, 0, -355, 0, Math.PI / 2, 0);
  pivotPoint.add(mallaextrusion);

  //atras derecha
  i.cargar_modelo(560, 0, -355, 0, Math.PI / 2, 0);
  pivotPoint.add(mallaextrusion);

  i.cargar_modelo(480, 0, -355, 0, Math.PI / 2, 0);
  pivotPoint.add(mallaextrusion);

  pivotPoint.position.x = this.pos_x;
  pivotPoint.position.y = this.pos_y;
  pivotPoint.position.z = this.pos_z;

  pivotPoint.rotation.x = this.rot_x;
  pivotPoint.rotation.y = this.rot_y;
  pivotPoint.rotation.z = this.rot_z;

  pivotPoint.scale.x = this.esc_x;
  pivotPoint.scale.y = this.esc_y;
  pivotPoint.scale.z = this.esc_z;

  }

  partealta(posx_a){
    //izquierda
    t.crear_texturas("texturas/amarillo_2.jpg", 1, 1);
    ci.crearCilindro(
    posx_a,
    330,
    -130,
    0,
    0,
    0,
    1.5,
    1,
    1.3,
    47,
    60,
    textura,
    false
  );
  pivotPoint.add(cilindro);

  t.crear_texturas("texturas/piedra.webp", 0.1, 0.1);
  e.crear_esfera(
    posx_a,
    360,
    -130,
    0,
    0,
    0,
    0.6,
    0.5,
    0.5,
    textura,
    false,
    100,
    20
  );
  pivotPoint.add(sphere);

  //iz mas pequeña

  t.crear_texturas("texturas/blanco.jpg", 1, 1);
  ci.crearCilindro(
    posx_a,
    415,
    -130,
    0,
    0,
    0,
    1.5,
    1,
    1.3,
    11,
    20,
    textura,
    false
  );
  pivotPoint.add(cilindro);

  t.crear_texturas("texturas/piedra.webp", 0.1, 0.1);
  e.crear_esfera(
    posx_a,
    425,
    -130,
    0,
    0,
    0,
    0.6,
    0.5,
    0.5,
    textura,
    false,
    25,
    20
  );
  pivotPoint.add(sphere);

  //parte negra pequeña
  t.crear_texturas("texturas/negro.jpg", 1, 1);
  pivotPuerta = Puertapeque1;
  i.puertas(10, 395, -62, 0, 0, 0, 0.3, 0.25, 1, textura, textura);
  pivotPoint.add(pivotPuerta);

  pivotPuerta = Puertapeque2;
  i.puertas(310, 395, -62, 0, 0, 0, 0.3, 0.25, 1, textura, textura);
  pivotPoint.add(pivotPuerta);
  }

 puertas(
    pos_x,
    pos_y,
    pos_z,
    rot_x,
    rot_y,
    rot_z,
    esc_x,
    esc_y,
    esc_z,
    textura,
    textura2
  ) {
    //parte de círculo
  
    cu.crear_cubo(140, 70, -53, 40, 40, 0.5, textura, false, 0, 0, 0, 1, 1, 1);
    pivotPuerta.add(cubo);
  
    ci.crearCilindro(
      140,
      90,
      -54,
      0,
      Math.PI / 2,
      Math.PI / 2,
      1,
      1,
      1,
      20,
      0.5,
      textura2,
      false
    );
    //cuadrado
  
    pivotPuerta.add(cilindro);
  
    pivotPuerta.position.x = pos_x;
    pivotPuerta.position.y = pos_y;
    pivotPuerta.position.z = pos_z;
  
    pivotPuerta.rotation.x = rot_x;
    pivotPuerta.rotation.y = rot_y;
    pivotPuerta.rotation.z = rot_z;
  
    pivotPuerta.scale.x = esc_x;
    pivotPuerta.scale.y = esc_y;
    pivotPuerta.scale.z = esc_z;
  }


 cargar_modelo(pos_x, pos_y, pos_z, rot_x, rot_y, rot_z) {
    var geometry = new THREE.Geometry();
  
    var array_extrude = [];
    var vertices = [
      [0, 0, 0],
      [35, 0, 0],
      [35, 120, 0],
      [20, 120, 0],
      [0, 0, 0]
    ];
    var vector;
    var long_vertices = vertices.length;
    for (var i = 0; i < long_vertices; i++) {
      var x = vertices[i][0];
      var y = vertices[i][1];
      var z = vertices[i][2];
      vector = new THREE.Vector3(x, y, z);
      geometry.vertices.push(vector);
  
      array_extrude.push(vector);
    }
    //para dar profundidad
    var nueva_figura = new THREE.Shape(array_extrude);
    //excrusion
    var datos_extrusion = {
      amount: 30, //cantidad de profundidad
      bevelEnabled: false, // activando bisel
      bevelSegments: 1, // segmentos del bisel
      steps: 10, // "profundidad y N�m. de segmentos que marcan la profundidad�
      bevelThickness: 100 // grosor del bisel
    };
  
    var extrude_geometria = new THREE.ExtrudeGeometry(
      nueva_figura,
      datos_extrusion
    );
  
    //Material de la figura
    t.crear_texturas("texturas/muro3.jpg", 0.06, 0.06);
    var material = new THREE.MeshBasicMaterial({
      map: textura,
      side: THREE.DoubleSide,
      wireframe: false
    });
  
    //agregar a malla
    mallaextrusion = new THREE.Mesh(extrude_geometria, material);
  
    mallaextrusion.position.x = pos_x;
    mallaextrusion.position.y = pos_y;
    mallaextrusion.position.z = pos_z;
  
    mallaextrusion.rotation.x = rot_x;
    mallaextrusion.rotation.y = rot_y;
    mallaextrusion.rotation.z = rot_z;
  
    scene.add(mallaextrusion);
  }  


cargar_triangulo(
    pos_x,
    pos_y,
    pos_z,
    rot_x,
    rot_y,
    rot_z,
    textura,
    sqr
  ) {
    var geometry = new THREE.Geometry();
  
    var array_extrude = [];
    var vertices = [
      [0, 0, 0],
      [80, 55, 0],
      [160, 0, 0],
      [0, 0, 0]
    ];
    var vector;
    var long_vertices = vertices.length;
    for (var i = 0; i < long_vertices; i++) {
     var x = vertices[i][0];
     var y = vertices[i][1];
     var z = vertices[i][2];
      vector = new THREE.Vector3(x, y, z);
      geometry.vertices.push(vector);
  
      array_extrude.push(vector);
    }
    //para dar profundidad
    var nueva_figura = new THREE.Shape(array_extrude);
    //excrusion
    var datos_extrusion = {
      amount: 30, //cantidad de profundidad
      bevelEnabled: false, // activando bisel
      bevelSegments: 1, // segmentos del bisel
      steps: 10, // "profundidad y N�m. de segmentos que marcan la profundidad�
      bevelThickness: 100 // grosor del bisel
    };
  
    var extrude_geometria = new THREE.ExtrudeGeometry(
      nueva_figura,
      datos_extrusion
    );
  
    //Material de la figura
  
    var material = new THREE.MeshBasicMaterial({
      map: textura,
      side: THREE.DoubleSide,
      wireframe: sqr
    });
  
    //agregar a malla
    triangulo = new THREE.Mesh(extrude_geometria, material);
  
    triangulo.position.x = pos_x;
    triangulo.position.y = pos_y;
    triangulo.position.z = pos_z;
  
    triangulo.rotation.x = rot_x;
    triangulo.rotation.y = rot_y;
    triangulo.rotation.z = rot_z;
  
    scene.add(triangulo);
  }





}




class Parque{

 


  crearParque(){
  //creamos los objetos
  
  
   //parque
   t.crear_texturas("texturas/ad.jpg", 5, 5);
   cu.crear_cubo(180, 10, 500, 1100, 4, 800, textura, false, 0, 0, 0, 1, 1, 1);
  
   //cuadrado
   t.crear_texturas("texturas/adoquin2.jpg", 10, 20);
   cu.crear_cubo(169.7, 13, 340, 390, 1, 420, textura, false, 0, 0, 0, 1.03, 1.1, 1);
  
   t.crear_texturas("texturas/adoquin2.jpg", 9, 3);
  
   cu.crear_cubo(505, 13, 172, 320, 1, 70, textura, false, 0, 0, 0, 0.8, 1, 1);
   cu.crear_cubo(-168, 13, 172, 320, 1, 70, textura, false, 0, 0, 0, 0.8, 1, 1);
  
   cu.crear_cubo(-168, 13, 400, 320, 1, 70, textura, false, 0, 0, 0, 0.8, 1, 1);
   cu.crear_cubo(505, 13, 400, 320, 1, 70, textura, false, 0, 0, 0, 0.8, 1, 1);
  
   //frente
   cu.crear_cubo(
     165,
     13,
     725,
     320,
     1,
     70,
     textura,
     false,
     0,
     Math.PI / 2,
     0,
     0.73,
     1,
     1
   );
  
   //laterales
   cu.crear_cubo(
     -142,
     13,
     695,
     320,
     1,
     70,
     textura,
     false,
     0,
     Math.PI / 4.5,
     0,
     1.07,
     1,
     1
   );
   cu.crear_cubo(
     475,
     13,
     695,
     320,
     1,
     70,
     textura,
     false,
     0,
     -Math.PI / 4.5,
     0,
     1.07,
     1,
     1
   );
  
   t.crear_texturas("texturas/ad.jpg", 10, 20);
   cu.crear_cubo(200, 3, 100, 1200, 9, 1600, textura, false, 0, 0, 0, 1, 1, 1);
  
   //gradas
   a.parte_parque1(0, 10, 0, 0, 0, 0, 1, 1, 1);
   scene.add(baseiglesia);
  
   //lados
  
   a.lado(10, 10, 0, 0, 0, 0, 1.2, 1, 1);
   scene.add(lado1);
   lado1 = lado2;
   a.lado(660, 10, 0, 0, 0, 0, 1.2, 1, 1);
   scene.add(lado1);
  
   //circulo central
   t.crear_texturas("texturas/piedra.webp", 7, 7);
   ci.crearCilindro(170, 15, 380, 0, 0, 0, 1, 1, 1, 80, 1, textura, false);
   
  
   //partes de los jardines
   a.jardines();
  }
  
  
  Lineacirculo(pos_x, pos_y, pos_z, rot_x, rot_y, rot_z,esc_x, esc_y, esc_z,  radio) {
    var semicirGeometry = new THREE.Geometry();
   
  
    var material = new THREE.MeshBasicMaterial({
      map: textura,
      color: 0x8080ff,
      side: THREE.DoubleSide
    });
  
    //hacer mas grueso OJO
  
    for (var j = 0; j < 10; j = j + 0.01) {
      var a = Math.cos(j) * radio;
      var b = Math.sin(j) * radio;
  
      semicirGeometry.vertices.push(new THREE.Vector3(a, b, 0));
      // semicirGeometry.faces.push(new THREE.Face4(0,1,2,3));
    }
    var semicir = new THREE.Line(semicirGeometry, material);
    //semicir=new THREE.Mesh(semicirGeometry, material);
  
    //semicir.position.set(0,0,0);
  
    semicir.position.x=pos_x;
    semicir.position.y=pos_y;
    semicir.position.z=pos_z;
  
    semicir.rotation.x=rot_x;
    semicir.rotation.y=rot_y;
    semicir.rotation.z=rot_z;
  
    semicir.scale.x=esc_x;
    semicir.scale.y=esc_y;
    semicir.scale.z=esc_z;
  
  
  
    scene.add(semicir);
  
  
   // console.log(semicir);
  }
  
    jardines(
      pos_x,
      pos_y,
      pos_z,
      rot_x,
      rot_y,
      rot_z,
      esc_x,
      esc_y,
      esc_z
    ) {
  
      
  
      //dere
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      cu.crear_cubo(502, 15, 286.5, 250, 4, 150, textura, false, 0, 0, 0, 1, 1, 1);
    
      t.crear_texturas("texturas/cesped.jpg", 5, 5);
      cu.crear_cubo(502, 19, 286.5, 250, 5, 150, textura, false, 0, 0, 0, 1, 1, 1);
    
      //izq
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      cu.crear_cubo(-163, 15, 286.5, 250, 4, 150, textura, false, 0, 0, 0, 1, 1, 1);
      t.crear_texturas("texturas/cesped.jpg", 5, 5);
      cu.crear_cubo(-163, 19, 286.5, 250, 5, 150, textura, false, 0, 0, 0, 1, 1, 1);
    
      //figuras
      //derecha
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      a.figura_jardin(375, 14, 440, -Math.PI / 2, 0, 0, 2.5, 1, 1, textura, false);
    
      t.crear_texturas("texturas/cesped.jpg", 0.05, 0.05);
      a.figura_jardin(375, 19, 440, -Math.PI / 2, 0, 0, 2.5, 1, 1, textura, false);
    
      //izquierda
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      a.figura_jardin(
        -40,
        14,
        440,
        -Math.PI / 2,
        Math.PI,
        0,
        2.5,
        1,
        1,
        textura,
        false
      );
    
      t.crear_texturas("texturas/cesped.jpg", 0.05, 0.05);
      a.figura_jardin(
        -40,
        19,
        440,
        -Math.PI / 2,
        Math.PI,
        0,
        2.5,
        1,
        1,
        textura,
        false
      );
    
      //centrales
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      a.figura_jardin2(26, 9, 570, -Math.PI / 2, 0, 0, 1, 1, 1, textura, false);
    
    
      t.crear_texturas("texturas/cesped.jpg", 0.05, 0.05);
      a.figura_jardin2(26, 14, 570, -Math.PI / 2, 0, 0, 1, 1, 1, textura, false);
    
      t.crear_texturas("texturas/adoquin_calle.jpg", 15, 15);
      a.figura_jardin2(
        304,
        15,
        570,
        -Math.PI / 2,
        Math.PI,
        0,
        1,
        1,
        1,
        textura,
        false
      );
      t.crear_texturas("texturas/cesped.jpg", 0.05, 0.05);
      a.figura_jardin2(
        304,
        20,
        570,
        -Math.PI / 2,
        Math.PI,
        0,
        1,
        1,
        1,
        textura,
        false
      );
    
    
    
    a.vallas();
    
      
    
    }
    
     vallas(){
    
      //izquierda
     
    
      /*izq 1*/
      for(var i=0; i<63; i++){
        a.Lineacirculo(-39-4*i,17,211,0,0,0,1,5,1,2);
        a.Lineacirculo(-39-4*i,17,210.9,0,0,0,1,5,1,2);
        //central
        a.Lineacirculo(-39-4*i,18,211,0,0,0,1,1,1,2);
        a.Lineacirculo(-39-4*i,18,210.9,0,0,0,1,1,1,2);
    
        
      }
      for(var i=0; i<38; i++){
        a.Lineacirculo(-289,17,212+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(-289,17,211.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
        a.Lineacirculo(-289,18,212+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(-289,18,211.9+4*i,0,Math.PI/2,0,1,1,1,2);
    
        
      }
    
      for(var i=0; i<38; i++){
        a.Lineacirculo(-38,17,212+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(-38,17,211.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
        a.Lineacirculo(-38,18,212+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(-38,18,211.9+4*i,0,Math.PI/2,0,1,1,1,2);
    
    
      }
      for(var i=0; i<63; i++){
        a.Lineacirculo(-39-4*i,17,362,0,0,0,1,5,1,2);
        a.Lineacirculo(-39-4*i,17,361.9,0,0,0,1,5,1,2);
        //central
    
        a.Lineacirculo(-39-4*i,18,362,0,0,0,1,1,1,2);
        a.Lineacirculo(-39-4*i,18,361.9,0,0,0,1,1,1,2);
    
      }
      
    
    
    
    
      //3 abajo izquierda
      for(var i=0; i<29; i++){
        a.Lineacirculo(127-4*i,17,610,0,0,0,1,5,1,2);
        a.Lineacirculo(127-4*i,17,609.9,0,0,0,1,5,1,2);
        //central
    
        a.Lineacirculo(127-4*i,18,610,0,0,0,1,1,1,2);
        a.Lineacirculo(127-4*i,18,609.9,0,0,0,1,1,1,2);
      }
    
      for(var i=0; i<94; i++){
        a.Lineacirculo(125-4*i,17,840,0,0,0,1,5,1,2);
        a.Lineacirculo(125-4*i,17,839.9,0,0,0,1,5,1,2);
        //central
    
        a.Lineacirculo(125-4*i,18,840,0,0,0,1,1,1,2);
        a.Lineacirculo(125-4*i,18,839.9,0,0,0,1,1,1,2);
    
      }
    
      for(var i=0; i<58; i++){
        a.Lineacirculo(127,17,612+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(127,17,611.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
        a.Lineacirculo(127,18,612+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(127,18,611.9+4*i,0,Math.PI/2,0,1,1,1,2);
    
      }
    
      for(var i=0; i<59; i++){
        a.Lineacirculo(-249+4.62*i,17,839-4*i,0,0,0,1,5,1,2);
        a.Lineacirculo(-248.9+4.62*i,17,838.9-4*i,0,0,0,1,5,1,2);
        //central
        a.Lineacirculo(-249+4.62*i,17,839-4*i,0,0,0,1,1,1,2);
        a.Lineacirculo(-248.9+4.62*i,17,838.9-4*i,0,0,0,1,1,1,2);
        
       
      }
    
    
      
    
    /**** */
    
    
    
    
    
    
    /* 2 izquierdo*/ 
    
      for(var i=0; i<83; i++){
        a.Lineacirculo(-290,17,442+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(-290,17,441.9+4*i,0,Math.PI/2,0,1,5,1,2);
    
        //central
        a.Lineacirculo(-290,18,442+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(-290,18,441.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
      for(var i=0; i<30; i++){
        a.Lineacirculo(-40,17,442+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(-40,17,441.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
    
        a.Lineacirculo(-40,18,442+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(-40,18,441.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
      for(var i=0; i<63; i++){
        a.Lineacirculo(-40-4*i,17,440,0,0,0,1,5,1,2);
        a.Lineacirculo(-40-4*i,17,439.9,0,0,0,1,5,1,2);
    
        //central
        a.Lineacirculo(-40-4*i,18,440,0,0,0,1,1,1,2);
        a.Lineacirculo(-40-4*i,18,439.9,0,0,0,1,1,1,2);
    
      }
    
    
      for(var i=0; i<52; i++){
        a.Lineacirculo(-287+4.78*i,17,769-4*i,0,0,0,1,5,1,2);
        a.Lineacirculo(-286.9+4.78*i,17,768.9-4*i,0,0,0,1,5,1,2);
        //central
        a.Lineacirculo(-287+4.78*i,17,769-4*i,0,0,0,1,1,1,2);
        a.Lineacirculo(-286.9+4.78*i,17,768.9-4*i,0,0,0,1,1,1,2);
        
       
      }
      
    
    
    
    
      //derecha
    
    /* 1 derecha*/
      for(var i=0; i<63; i++){
        a.Lineacirculo(379+4*i,17,211,0,0,0,1,5,1,2);
        a.Lineacirculo(379+4*i,17,210.9,0,0,0,1,5,1,2);
    //central
    a.Lineacirculo(379+4*i,18,211,0,0,0,1,1,1,2);
    a.Lineacirculo(379+4*i,18,210.9,0,0,0,1,1,1,2);
    
      }
      for(var i=0; i<63; i++){
        a.Lineacirculo(379+4*i,17,362,0,0,0,1,5,1,2);
        a.Lineacirculo(379+4*i,17,361.9,0,0,0,1,5,1,2);
        //central
        a.Lineacirculo(379+4*i,18,362,0,0,0,1,1,1,2);
        a.Lineacirculo(379+4*i,18,361.9,0,0,0,1,1,1,2);
      }
    
    
      for(var i=0; i<38; i++){
        a.Lineacirculo(377,17,212+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(377,17,211.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
        a.Lineacirculo(377,18,212+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(377,18,211.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
      for(var i=0; i<38; i++){
        a.Lineacirculo(628,17,212+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(628,17,211.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
        a.Lineacirculo(628,18,212+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(628,18,211.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
    
    
    
      /*2derecha*/
    
      for(var i=0; i<63; i++){
        a.Lineacirculo(377+4*i,17,440,0,0,0,1,5,1,2);
        a.Lineacirculo(377+4*i,17,439.9,0,0,0,1,5,1,2);
        //central
        a.Lineacirculo(377+4*i,18,440,0,0,0,1,1,1,2);
        a.Lineacirculo(377+4*i,18,439.9,0,0,0,1,1,1,2);
      }
    
      for(var i=0; i<30; i++){
        a.Lineacirculo(375,17,441+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(375,17,440.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
    
        a.Lineacirculo(375,18,441+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(375,18,440.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
      for(var i=0; i<83; i++){
        a.Lineacirculo(626,17,441+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(626,17,440.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
    
        a.Lineacirculo(626,18,441+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(626,18,440.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
      for(var i=0; i<53; i++){
        a.Lineacirculo(374+4.8*i,17,561+4*i,0,0,0,1,5,1,2);
        a.Lineacirculo(373.9+4.8*i,17,560.9+4*i,0,0,0,1,5,1,2);
        //central
    
        a.Lineacirculo(374+4.8*i,18,561+4*i,0,0,0,1,1,1,2);
        a.Lineacirculo(373.9+4.8*i,18,560.9+4*i,0,0,0,1,1,1,2);
       
      }
      
    
    
      
    
      /* 3 derecha*/
    
     
    
      for(var i=0; i<26; i++){
        a.Lineacirculo(206+4*i,17,610,0,0,0,1,5,1,2);
        a.Lineacirculo(206+4*i,17,609.9,0,0,0,1,5,1,2);
    
        //central
        a.Lineacirculo(206+4*i,18,610,0,0,0,1,1,1,2);
        a.Lineacirculo(206+4*i,18,609.9,0,0,0,1,1,1,2);
      }
    
      for(var i=0; i<94; i++){
        a.Lineacirculo(206+4*i,17,840,0,0,0,1,5,1,2);
        a.Lineacirculo(206+4*i,17,839.9,0,0,0,1,5,1,2);
        //central
    
        a.Lineacirculo(206+4*i,18,840,0,0,0,1,1,1,2);
        a.Lineacirculo(206+4*i,18,839.9,0,0,0,1,1,1,2);
      }
    
      for(var i=0; i<58; i++){
        a.Lineacirculo(204,17,610+4*i,0,Math.PI/2,0,1,5,1,2);
        a.Lineacirculo(204,17,609.9+4*i,0,Math.PI/2,0,1,5,1,2);
        //central
    
        a.Lineacirculo(204,18,610+4*i,0,Math.PI/2,0,1,1,1,2);
        a.Lineacirculo(204,18,609.9+4*i,0,Math.PI/2,0,1,1,1,2);
      }
    
     

      for(var i=0; i<53; i++){
        a.Lineacirculo(340+4.6*i,17,630+4*i,0,0,0,1,5,1,2);
        a.Lineacirculo(339.9+4.6*i,17,629.9+4*i,0,0,0,1,5,1,2);
        //central
    
        
       
      }
      
    
    
    
    
    }
    
    figura_jardin(
      pos_x,
      pos_y,
      pos_z,
      rot_x,
      rot_y,
      rot_z,
      esc_x,
      esc_y,
      esc_z,
      textura,
      sqr
    ) {
      var geometry = new THREE.Geometry();
    
      var array_extrude = [];
      var vertices = [
        [0, 0, 0],
        [100, 0, 0],
        [100, -330, 0],
        [0, -120, 0],
        [0, 0, 0]
      ];
      var vector;
      var long_vertices = vertices.length;
      for (var i = 0; i < long_vertices; i++) {
        var x = vertices[i][0];
       var y = vertices[i][1];
       var z = vertices[i][2];
        vector = new THREE.Vector3(x, y, z);
        geometry.vertices.push(vector);
    
        array_extrude.push(vector);
      }
      //para dar profundidad
      var nueva_figura = new THREE.Shape(array_extrude);
      //excrusion
      var datos_extrusion = {
        amount: 5, //cantidad de profundidad
        bevelEnabled: false, // activando bisel
        bevelSegments: 1, // segmentos del bisel
        steps: 10, // "profundidad y N�m. de segmentos que marcan la profundidad�
        bevelThickness: 100 // grosor del bisel
      };
    
      var extrude_geometria = new THREE.ExtrudeGeometry(
        nueva_figura,
        datos_extrusion
      );
    
      //Material de la figura
    
      var material = new THREE.MeshBasicMaterial({
        map: textura,
        side: THREE.DoubleSide,
        wireframe: sqr
      });
    
      //agregar a malla
      figura_j = new THREE.Mesh(extrude_geometria, material);
    
      figura_j.position.x = pos_x;
      figura_j.position.y = pos_y;
      figura_j.position.z = pos_z;
    
      figura_j.rotation.x = rot_x;
      figura_j.rotation.y = rot_y;
      figura_j.rotation.z = rot_z;
    
      figura_j.scale.x = esc_x;
      figura_j.scale.y = esc_y;
      figura_j.scale.z = esc_z;
    
      scene.add(figura_j);
    }
    
     figura_jardin2(
      pos_x,
      pos_y,
      pos_z,
      rot_x,
      rot_y,
      rot_z,
      esc_x,
      esc_y,
      esc_z,
      textura,
      sqr
    ) {
      var geometry = new THREE.Geometry();
    
      var array_extrude = [];
      var vertices = [
        [-10, -40, 0],
        [100,-40, 0],
        [100, -270, 0],
        [-275, -270, 0],
        [-10, -40, 0]
      ];
      var vector;
      var long_vertices = vertices.length;
      for (var i = 0; i < long_vertices; i++) {
       var x = vertices[i][0];
       var y = vertices[i][1];
       var z = vertices[i][2];
        vector = new THREE.Vector3(x, y, z);
        geometry.vertices.push(vector);
    
        array_extrude.push(vector);
      }
      //para dar profundidad
      var nueva_figura = new THREE.Shape(array_extrude);
      //excrusion
      var datos_extrusion = {
        amount: 5, //cantidad de profundidad
        bevelEnabled: false, // activando bisel
        bevelSegments: 1, // segmentos del bisel
        steps: 10, // "profundidad y N�m. de segmentos que marcan la profundidad�
        bevelThickness: 100 // grosor del bisel
      };
    
      var extrude_geometria = new THREE.ExtrudeGeometry(
        nueva_figura,
        datos_extrusion
      );
    
      //Material de la figura
    
      var material = new THREE.MeshBasicMaterial({
        map: textura,
        side: THREE.DoubleSide,
        wireframe: sqr
      });
    
      //agregar a malla
      figura_j = new THREE.Mesh(extrude_geometria, material);
    
      figura_j.position.x = pos_x;
      figura_j.position.y = pos_y;
      figura_j.position.z = pos_z;
    
      figura_j.rotation.x = rot_x;
      figura_j.rotation.y = rot_y;
      figura_j.rotation.z = rot_z;
    
      figura_j.scale.x = esc_x;
      figura_j.scale.y = esc_y;
      figura_j.scale.z = esc_z;
    
      scene.add(figura_j);
    }
    
     lado(pos_x, pos_y, pos_z, rot_x, rot_y, rot_z, esc_x, esc_y, esc_z) {
  
      
      
      t.crear_texturas("texturas/muro.jpg", 5, 1);
      cu.crear_cubo(-235, 20, 114, 10, 40, 35, textura, false, 0, 0, 0, 1, 1, 1);
      lado1.add(cubo);
      cu.crear_cubo(-45, 20, 114, 10, 40, 35, textura, false, 0, 0, 0, 1, 1, 1);
      lado1.add(cubo);
      cu.crear_cubo(-140, 10, 125, 200, 20, 15, textura, false, 0, 0, 0, 1, 1, 1);
      lado1.add(cubo);
      //cesped
      t.crear_texturas("texturas/cesped.jpg", 5, 1);
      cu.crear_cubo(
        -141,
        20,
        110,
        178,
        20,
        30,
        textura,
        false,
        Math.PI / 4,
        0,
        0,
        1,
        1,
        1
      );
      lado1.add(cubo);
      t.crear_texturas("texturas/muro.jpg", 5, 1);
      cu.crear_cubo(-140, 30, 95, 200, 20, 15, textura, false, 0, 0, 0, 1, 1, 1);
      lado1.add(cubo);
    
      lado1.position.x = pos_x;
      lado1.position.y = pos_y;
      lado1.position.z = pos_z;
    
      lado1.rotation.x = rot_x;
      lado1.rotation.y = rot_y;
      lado1.rotation.z = rot_z;
    
      lado1.scale.x = esc_x;
      lado1.scale.y = esc_y;
      lado1.scale.z = esc_z;
    }
    
     parte_parque1(
      pos_x,
      pos_y,
      pos_z,
      rot_x,
      rot_y,
      rot_z,
      esc_x,
      esc_y,
      esc_z
    ) {
  
  
      t.crear_texturas("texturas/piedra.webp", 3, 3);
      cu.crear_cubo(220, 10, -300, 1000, 25, 800, textura, false, 0, 0, 0, 1, 1, 1);
      baseiglesia.add(cubo);
      //gradas frente
      cu.crear_cubo(220, 3, -278, 1000, 5, 800, textura, false, 0, 0, 0, 1, 1, 1);
      baseiglesia.add(cubo);
      cu.crear_cubo(220, 6, -286, 1000, 9, 800, textura, false, 0, 0, 0, 1, 1, 1);
      baseiglesia.add(cubo);
      cu.crear_cubo(220, 10, -292, 1000, 13, 800, textura, false, 0, 0, 0, 1, 1, 1);
      baseiglesia.add(cubo);
    
      baseiglesia.position.x = pos_x;
      baseiglesia.position.y = pos_y;
      baseiglesia.position.z = pos_z;
    
      baseiglesia.rotation.x = rot_x;
      baseiglesia.rotation.y = rot_y;
      baseiglesia.rotation.z = rot_z;
    
      baseiglesia.scale.x = esc_x;
      baseiglesia.scale.y = esc_y;
      baseiglesia.scale.z = esc_z;
    }
  }


  //objetos 
var ci=new Cilindro();
var cu=new Cubo();
var t=new Textura();
var e=new Esfera();
var a=new Parque();
var i=new Iglesia();

/****************************llamado de funciones************************/
inicio();
animacion();

//********************INICIO**********************
function inicio() {
  renderer.setSize(ancho, largo);
  document.body.appendChild(renderer.domElement);
  material = new THREE.MeshBasicMaterial({ color: 0x00ff0000 });
  camera.position.z = 1000;
  camera.position.y = 100;
  camera.rotation.y = Math.PI;

  //PlanoPrincipal();
  //Parque();
  //Iglesia(40, 30, 0, 0, 0, 0, 0.7, 1, 1);

  //creamos los objetos
  var p=new PlanoBase();
  p.PlanoPrincipal();

  var par=new Parque();
  par.crearParque();

  var i=new Iglesia(40, 30, 0, 0, 0, 0, 0.7, 1, 1);
  i.crearIglesia();


  


  controls = new THREE.OrbitControls(camera, renderer.domElement);
}


function animacion() {
  requestAnimationFrame(animacion);

  /* obj_mov=cubo;

   if(teclado.pressed("up")){
    obj_mov.position.z-=1; 
   }

   if(teclado.pressed("down")){
    obj_mov.position.z+=1; 
   }

   if(teclado.pressed("right")){
    obj_mov.position.x+=1; 
   }

   if(teclado.pressed("left")){
    obj_mov.position.x-=1; 
   }*/

  //  controls.target.set(obj_mov.position.x,obj_mov.position.y,obj_mov.position.z );

  //mover iglesia
  //pivotPoint.rotation.y+=0.01;
  //pivotPoint.scale.y+=0.01

  render_modelo();
}

function render_modelo() {
  controls.update();
  renderer.render(scene, camera);
}