const input = require("../../input");

(async () =>{

    console.log("Digite um número")    
    let inf = Number(await input())
    console.log("Digite outro número")
    let infi = Number(await input())
    console.log(infi/+inf)
})();
