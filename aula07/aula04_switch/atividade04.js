const input = require("../input");

(async() =>{
    console.log("digite um valor");
    let Vtotal = Number(await input());

 

    switch(true){
        case Vtotal >= 100:
            console.log("Desconto de 20% aplicado. O valor Final é "+(Vtotal-Vtotal*20/100));
        break
        
        case Vtotal >= 50 && Vtotal < 100:
            console.log("Desconto de 10% aplicado. O valor final é "+(Vtotal-Vtotal*10/100));
        break
        
        case Vtotal >= 20 && Vtotal < 50:
            console.log("Desconto de 5% aplicado. O valor final é "+(Vtotal-Vtotal*5/100));
        break
        default:
            console.log("Valor sem desconto, varlo baixo")
    }
})();