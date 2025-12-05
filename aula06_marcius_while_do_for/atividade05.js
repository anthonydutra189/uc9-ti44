const input = require("../input");


(async () => {

   
    let at = []
    let continuar
    do{//the imposible see the invisible row row fight the power / inicia o meu laço/loop
        console.log("digite seu nome ")
        let nome = await input();

        console.log("digite seu telefone ")
        let tele = await input();

        console.log("deseja Continuar (sim)")
        continuar = (await input()).toLowerCase();

        at.push({
            Nome:   nome,
            Numero : tele
        })

    }while(at.length <=5 && continuar == "sim")
        console.log(at)
})();
