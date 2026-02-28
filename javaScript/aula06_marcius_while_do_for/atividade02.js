const input = require("../input");


( async () => {
 let sim = "y";
while(sim  == "y"){
console.log("digite y para contiuar ")
sim = await input();  
}   
 

})(); 