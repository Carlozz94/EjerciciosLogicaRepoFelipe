function myFunction(){
    let dato1 = prompt("Ingresa el 1er dato");
    let dato2 = prompt("Ingresa el 2do dato");
    let dato3 = prompt("Ingresa el 3er dato");
    
    let resultado = 0;

    if(dato1 === dato2 && dato1 === dato3){
        document.getElementById("resultado").innerHTML = "Son iguales todos los numeros";
    }
    else if(dato1 > dato2 && dato1 > dato3){
        resultado = dato1;
        document.getElementById("resultado").innerHTML = "El numero mayor es " + resultado;
    }else if(dato2 > dato1 && dato2 > dato3 ){
        resultado = dato2;
        document.getElementById("resultado").innerHTML = "El numero mayor es " + resultado;
    }else{
        resultado = dato3;
        document.getElementById("resultado").innerHTML = "El numero mayor es " + resultado;
    }

}

