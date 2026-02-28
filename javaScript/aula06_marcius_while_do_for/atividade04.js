/*for(incialização; comparação; um passo){
    executa enquanto for verdade 
}*/

const input = require("../../input");
(async () => {
for(let i=0 , ale=-1 , sorteado;ale != sorteado && i<10; i ++){
    ale = Math.floor(Math.random()*10)
    console.log("acerte o numero: ");
    sorteado = Number(await input());
};
})();