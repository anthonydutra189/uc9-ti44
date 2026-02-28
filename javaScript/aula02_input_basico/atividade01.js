const input = require ("../input");


(async () => {
    console.log("Qual o seu primeiro nome?");
    let PriNome = await input();

    console.log("Qual os eu sobrenome?");
    let SobNome = await input();

    console.log(`Citação ${PriNome[0]}.${SobNome}`);
})();