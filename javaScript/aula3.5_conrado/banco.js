const input = require("../input");


//Ativadade bancária 



(async ()=>{
let saldo = 300
    console.log("Bem-vindo ao sistema do banco ######🏦");
    console.log("Digite 1 para depositar ou o numero 2 para sacar:");
let Option = await input(); 
    console.log("Digite o valor: ")
let valor = Number(await input());

if(Option == "1"){
            saldo += valor
                if(valor <= 0){}console.log("é necessario o valor mínimo de R$1.00")             
}else if(Option == 2){
            saldo -= valor
                if(valor > saldo){console.log ("é impossivel realizar esta operação")}
}       
    //console.log("Operação bem executada");  
    //console.log(`Valor atual na conta: R$ ${saldo}`);
})();