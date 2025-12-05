const input = require("../input");
const {validateCPF} = require("../anthony");


( async () => {
console.log("Digite seu CPF");
let cpf = await input();

    if(validateCPF(cpf)){
        console.log("CPF valido ");
    }else{
        console.log("CPF invlaido");
    }
})();