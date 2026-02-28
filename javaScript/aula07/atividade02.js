
const input = require("../input")


function div(num1, num2) {
    return num1 / num2
}

(async () => {

    let divisao = await input();

    console.log(divisao)

})();

