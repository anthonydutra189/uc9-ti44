const input = require("../input");


(async() =>{
    console.log("digite um valor");
    let Vtotal = Number(await input());
    console.log("Digite sua forma de pagamento")
    let pag = Number(await input());
    
    switch(pag){
        case 1:
            console.log("Forma de pagamento Dinheiro. aplicado. O valor Final é "+(Vtotal-Vtotal*10/100));
        break
        
        case 2: 
            console.log("Forma de pagamento Débito . O valor final é "+(Vtotal-Vtotal*5/100));
        break
        
        case 3:
            console.log("Forma de pagamento Crédito. O valor final é "+Vtotal);
        break
        
        case 4:
            console.log("Forma de pagamento PIX. O valor final é R$"+(Vtotal-Vtotal*8/100));
        break
        default:
            console.log("Forma de pagamneto invalida.")
    }
})();