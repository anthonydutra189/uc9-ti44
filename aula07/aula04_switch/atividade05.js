const input = require("../input");


(async() => {
    console.log("digite um valor");
    let ponto = Number(await input());

    switch(true){
        case ponto < 100:
            console.log("Cliente iniciante, não ha beneficios");
        break
        
        case ponto >= 100 && ponto < 300:
            console.log("Cliente Bronze,descontos (menos de 50%)");
        break
        
        case ponto >= 300 && ponto < 700:
            console.log("Cliente Prata, mesmo que o anterior mais cartão da loja");
        break
  
        case ponto >= 700:
            console.log("Cliente ouro, mesmo que os anteriores mais atendimento prioritario");
        break

    }
})();