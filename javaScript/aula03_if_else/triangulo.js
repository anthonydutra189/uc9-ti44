const input = require("../../input");


(async() => {
    console.log("digite um de número(1/3)");
    let num1 = Number (await input());

    console.log("digite um de número(2/3)");
    let num2 = Number (await input());

    console.log("digite um de número(3/3)");
    let num3 = Number (await input());

    if(isNaN (num1)|| isNaN (num2) || isNaN(num3)){
        console.log("Digite apenas números");

    }else if(num1+num2 < num3 || num1+num3 < num2 || num2+num3 < num1) {   
        console.log("isso não é um tringulo");

    }else if((num1 <=0) || (num2 <=0) || (num3 <=0)){
        console.log("Digite um numero em todas as opções");

    }else if(num1 == num2 && num2 == num3){   
        console.log("Seu triângulo é equilátero")

    }else if((num1 != num2) && (num2 != num3) && (num1 != num3)){
        console.log("Seu triângulo escaleno")
    }else {
        console.log("Seu triângulo é um isósceles");
    }
})();