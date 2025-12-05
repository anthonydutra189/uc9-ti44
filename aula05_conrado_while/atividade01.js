let prompt = require("prompt-sync")()

let resposta = 7
let numero = 9
let shot = 0
let faltam = 3

function tigrinho(){
    return Math.floor(Math.random()*10);
}

while(numero != resposta){
    
    numero = Number( prompt("Digite um número: ") )
    if(shot == 3){
        console.log("foi mal acabou")
        break
    }
    if(numero == resposta){
        console.log("parabéns, você acertou!");
        break
    }else{
        console.log(`Você errou...tente novemente. Numero de tentativas ${shot += 1} faltam ${faltam -= 1} tentativas`);
    }if(shot == 3){
        console.log("foi mal acabou")
        break
    }
}

