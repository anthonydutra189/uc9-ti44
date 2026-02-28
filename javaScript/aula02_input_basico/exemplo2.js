const input = require ("../../input");


(async () => {
   console.log("Bem vindo, por favor escreva seu nome e sua idade");
   console.log("Qual o seu nome ?")
   let nome = await input();
   let idade = await input();
   console.log(`Ola ${nome}, sua é ${idade}`); 
})();