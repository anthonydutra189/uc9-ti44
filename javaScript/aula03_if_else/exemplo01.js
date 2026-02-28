const input = require("../input");

var idade 

( async () => {
        console.log("Quantos anos você tem? ")
        let idade = await input();
    if(18 > idade){  
    console.log("Bloquado");
    }else{
        console.log("Bem-vindo!");
    }
})();


