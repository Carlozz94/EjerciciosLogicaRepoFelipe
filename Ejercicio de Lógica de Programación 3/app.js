function myFunction(){

    const numero = prompt("Ingresa el numero");
    let factorial = 1;

    if(isNaN(numero)){
        alert("Error: debes ingresar un número");
      } else {  
    
        for(var i = 1; i <= numero; i ++){
            factorial *= i;
            document.getElementById("resultado").innerHTML = "El factorial de " + numero + " es " + factorial;
        }
      }
}

