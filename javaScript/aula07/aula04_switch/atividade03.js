const input = require("../input");

(async () => {
    console.log("Bem-vindo a lachonete net! escolha o tamanho\nP: Combo Pequeno (R$ 15.00).\nM: Combo Médio (R$ 20.00).\nG: Combo Grande (R$ 25.00).")
    
    let tamanho = String (await input());
    switch(tamanho.toUpperCase()){        
        case "P": 
                console.log("Combo Pequeno escolhido (R$ 15.00)");
        break
        
        case "M":
                console.log("Combo Médio escolhido (R$ 20.00).");
        break

        case "G":
                console.log("Combo Grande escolhido (R$ 25.00).");
        break

        default:
                console.log("tamanho inválido");
    }
})();