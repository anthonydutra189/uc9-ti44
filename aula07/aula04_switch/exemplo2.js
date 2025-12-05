
function tigrinho(){
    return Math.floor(Math.random()*10);
}
let sorteado = tigrinho()

    switch(true){
        case tigrinho() > 3:
            console.log("Parabens você ganhou o prêmio maximo");
        
        case tigrinho() == 2:
            console.log("ganhou um refri");
        
        default:
            console.log("ganhou nada");
} 

