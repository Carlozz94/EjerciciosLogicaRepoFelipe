function myFunction(){
let numSecreto = Math.floor(Math.random() * 10) + 1; 
let intentos = []; 

while (true) {
    let numero = prompt("Ingresa un número del 1 al 100");
 
    if(isNaN(numero)){
        alert("Error: debes ingresar un número");
      } else {  

  if (numero < 1 || numero > 100) {
    console.log("Debes ingresar un número del 1 al 100, intenta de nuevo");
    continue; 
  }

  intentos.push(numero);

  if (numero == numSecreto) {
    document.getElementById("resultado").innerHTML = "!!Adivinaste!! el numero era " + numSecreto + " tus numeros que elegiste fueron: " + intentos.join(", ");
    break;
  }
}
}
}