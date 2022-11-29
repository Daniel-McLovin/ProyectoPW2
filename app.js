const carrito = [];
compra = prompt("¿Que vas a comprar?");
    carrito.push(compra);

while(confirm("¿Deseas agregar algo mas?")){
    compra = prompt("¿Que vas a comprar?");
    carrito.push(compra);
}

console.log("Estos son tus productos: ");
for(let productos of carrito){
    console.log(productos);
}