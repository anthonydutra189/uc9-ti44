/*
faça um programa que sorteia até 10 números
ou até o usuario acertar
*/
const input = require("../input");

(async () => {
    let ale
    let sorteado
    let i=0
   
do{// the imposible see the invisible row row 

    ale =Math.floor(Math.random()*10)
    console.log("acerte o numero")
    let sorteado = Number(await input())
    i++
}while(ale != sorteado && i<10 ){
   
}
})()


    
 
