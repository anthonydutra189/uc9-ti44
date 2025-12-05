const input = require("../input");

(async () => {
    console.log("deposite um valor.");
    let saldo = Number ( await input());
    
    console.log("digite um numero(produto).");
    let produto = Number ( await input());
    
    if(saldo >= 5 && produto == 42){
        console.log("você recebeu uma coca-cola");
    }else(console.log("saldo ineficiente"));
    
})();

