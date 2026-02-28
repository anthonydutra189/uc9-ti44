const input = require ("../input");

(async () => {
    
    console.log("Digite o primeiro número:");
    let PriNum = Number (await input());

    console.log("Digite o segundo número:");
    let SegNum = Number (await input());
    
    console.log("A soma é "+(PriNum+SegNum));
})();