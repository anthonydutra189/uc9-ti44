const input = require("../input");

(async () => {
    console.log("Bem-vindo a lachonete net! escolha sua opção\n100 - X-Salada (R$ 12.00)\n101 X-Burgers(R$ 10.00)\n102 Cachorro-Quente (R$ 8.50)\n103 - Suco (R$ 6.00)\n104 - Refrigerante (R$ 5.00)")
    
    let codigo = Number(await input());
    console.log("Escolha a quantidade");
    let quantidade = Number(await input());

    switch(codigo){        
        case 100 :
            valor = 12.00
                console.log(`Você pediu ${quantidade} unidades, Preço total R$${12.00*quantidade}`);
        break
        
        case 101:
                console.log(`Você pediu ${quantidade} unidades, Preço total R$${10.00*quantidade}`);
        break
        
        case 102:
            console.log(`Você pediu ${quantidade} unidades, Preço total R$${8.50*quantidade}`);
        break    
       
        case 103:
            console.log(`Você pediu ${quantidade} unidades, Preço total R$${6.00*quantidade}`);
        break
        case 104:
            console.log(`Você pediu ${quantidade} unidades, Preço total R$${5.00*quantidade}`);
        break
        default:
            console.log("Código inválido");
    }
})();