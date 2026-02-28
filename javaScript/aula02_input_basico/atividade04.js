const input = require ("../input");

(async () => {
    console.log("Digite um número:");
    let Num = Number (await input());

    console.log("o dobro dele é "+ Num*2);
})();