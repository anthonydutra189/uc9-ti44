const input = require("../input");
const {validaNumero} = require("../anthony");
const {validaEmail} = require("../anthony");

( async () => {
let agenda = [];
for(let i = 0;i<1;i++){

    console.log("digite seu nome")
    let nome = await input();
    console.log("digite seu número de telefone")
    let telefone = await input();
    console.log("digite seu email")
    let email = await input();


    if(validaEmail(email) && validaNumero(telefone)){
        console.log("seus dados são validos")
        
        agenda.push ({
            Nome : nome ,
            Telefone: telefone,
            Email : email 
        });
    }
    else{
        console.log("seu dados estão errados");
        }
}
    console.log(agenda)

})();
