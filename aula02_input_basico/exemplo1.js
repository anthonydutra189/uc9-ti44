//estou f
const input = require("../input");
/* função arrow function


/* função aninonima

()() => {

})();

*/

(async () => {
    console.log("Qual a sua idade: ");
    let idade = await input();
    console.log(idade);
})();
