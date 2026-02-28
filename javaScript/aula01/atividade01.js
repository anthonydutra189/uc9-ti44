const input = require("../../input");

(async ()=>{
    console.log("Digite um valor");
    let saldo = Number( await input());

    console.log("Digite um número");
    let produto = Number( await input());

    if(isNaN(saldo)){
        console.log("Saldo deve ser um número para o produto");
    }else if(saldo > 5 && produto == 42){
        console.log("Pegue sua coca-cola!");
    }else{
        console.log(`Vá embora e pegue seu slado ${saldo}!`);
    }
})();