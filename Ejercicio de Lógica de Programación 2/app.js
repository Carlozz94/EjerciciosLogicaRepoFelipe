function myFunction(){

    const numero = prompt("Ingresa la temperatura");

    if(isNaN(numero)){
        alert("Error: debes ingresar un número");
      } else {  
    
        const fa = (numero * 1.8) + 32;

        document.getElementById("resultado1").innerHTML = "Grados Farenheit son " + fa + "°F";


        const ke = numero + 273.15;

        document.getElementById("resultado2").innerHTML = "Grados Kelvin son " + ke + "K";
      



      }
}

