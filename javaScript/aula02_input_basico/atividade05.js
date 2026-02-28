const input = require ("../input");

(async () => {
    console.log("Escreva uma frase e veja quantas letras tem");
    let frase = await input();

    console.log(frase.length);
})();
