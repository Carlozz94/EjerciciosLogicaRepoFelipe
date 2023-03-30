function fibonacci(numero) {
  if (numero <= 1) {
    return 1;
  }

  return fibonacci(numero - 1) + fibonacci(numero - 2);
}

let limite;

do {
  limite = parseInt(prompt("Ingrese el número de elementos que desea calcular en la serie de Fibonacci:"));

  if (isNaN(limite) || limite < 1) {
    alert("Error: debe ingresar un número entero mayor o igual a 1");
  }
} while (isNaN(limite) || limite < 1);

const serieFibonacci = [];

for (let i = 0; i < limite; i++) {
  serieFibonacci.push(fibonacci(i));
}

document.getElementById("resultado").innerHTML = "El factorial de " + limite + " es " + serieFibonacci.join(", ");

