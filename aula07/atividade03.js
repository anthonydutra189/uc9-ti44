const input = require("../input")


function soma(n1,n2=0){
    return n1 + n2
}
function sub(n1,n2=0){
    return n1 - n2
}

function div(n1,n2=1){
     return n1/n2     
}

function mult(n1,n2=1){
    return n1*n2     
}
function por(n1,n2=0){
    return n1/100 * n2     
}



(async () =>{

    console.log("Digite o número a operação que deseja realizar\n1 - soma \n2 - subtração\n3 - divisão\n4 - multiplicasão\n5 - porcetagem\n6 - fatoração")
    let digito = Number (await input())    
    let func 
        switch(digito){
        case 1: func=soma 
        break;
        
        case 2: func=sub; 
        break;

        case 3: func=div; 
        break;

        case 4: func=mult; 
        break;

        case 5: func=por; 
        break;
        
        default: console.log("Em desenvolvimento ") 
        return;
        
        }
    console.log("Digite o primeiro número");
    let num1 = Number(await input());
    console.log("Digite seu segudo número");
    let num2 = Number(await input());

    let conta = func(num1,num2); 
    console.log(conta) 
})();
