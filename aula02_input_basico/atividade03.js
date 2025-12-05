const input = require ("../input");


(async () => {
    console.log("Escreva uma frase que contenha a palavra startup");
    let startup = await input();

    console.log(startup.replace("startup","empresa"));
})();