const input = require("../input");

(async () => {

console.log("bem-vindo a Lachonete dogearia!\n aqui esta nosso cardapio\n1 - Hotdog simples, Salsicha e purê\n2 - Dog Salada Salsicha e salada\n3 - dog Duplo Espacial Duas salsichas, purê e bacon\n4 - Dog-Tudo Duas salsichas, purê em dobro, bacon e salada")



let valorgasto
let descosto  
let percentual
let valorfinal

console.log("escolha seu pedido (selecione número de 1 a 4)");
let pedido = Number(await input());
console.log("digite o número de seu desconto (de 1 a 90");
let desconto = await input();
if(pedido = 1){
console.log("digite o valor do pão\n digite o valor")
let pao = Number(await input());
let batatapalha = Number(await input());
let salsicha = Number(await input());
let pure = Number(await input());

 console.log(pao + batatapalha + salsicha + pure );
}if(pedido = 2){
console.log((pao + batatapalha + alada))
}if(pedido = 3){
console.log()
}

})();