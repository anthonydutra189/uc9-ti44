const input = require("../input");

(async () => {
    console.log("Escolha uma opção\n 1 - X-Salada \n 2 - X-Burger \n 3 - Misto Quente \n 4 - Suco Natural \n 5 - Refrigerante");
   
    let menu = Number(await input());
   
    switch(menu){
        case 1:
            console.log("Você escolheu X-Salada");
        break
        case 2:
            console.log("Você escolheu X-Burger");
        break    
        case 3:
            console.log("Você ecolheu Misto Quente");
        break    
        case 4:
            console.log("Você escolheu Suco Natural");
        break    
        case 5: 
            console.log("Você escolheu Refrigerante");
        break
        default:
            console.log("Opção inválida, tente novamnete.");
  
}


    
})();
