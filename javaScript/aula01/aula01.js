console.log("Tchau mundo");

var telefone = 99 

var nome = "Anthony";
// estou fazendo uma concatenização 
console.log("Olá "+nome);

var idade = 17;
// estou fazendo uma interpolação 
/*
"" - aspas
'' - apostofre
`` - crase
*/
console.log(`Olá ${nome}, sua idade é ${idade}`);

//camalcase é colocar em maiusculo na primeira letra da proxima palavra
var cestaCafe = []; // estou declarando um vetor
cestaCafe[0] = "café"; // uma atribuição 
cestaCafe[1] = "ovo";
/* - 
() - para funções ou 
[] - colchetes para vetores
{} - chaves para estrutras ou contexto
*/

//undercase é colocar um underline para separar palavras
var cesta_cafe = ["café", "ovo"];

cestaCafe.push ("bacon");
cesta_cafe.push ("pão");

console.log(cestaCafe);
console.log(cesta_cafe);

var info  = [];

info[0] = ("seu nome é "+nome);
info[1] = ("seu idade é "+idade);
info[2] = ("seu numero é "+ telefone);

console.log(info);
// estrutura, dicionario , classe anonima (são todas as nomenclaturas disso aqui)
var usuario = {
    nome: "Anthony dutra",
    idade: 17,
    telefone: "99"
};

console.log(usuario.idade);
/*
var listatelefonica = [];

listatelefonica.push({
    nome: "Rebeca Mariah",
    telefone: "(51) 3838-0729",
    endereco: "Rua Alexandrino de Alencar 901 Jardim Krahe"
});

listatelefonica.push({
    nome: "Enrico Carlos",
    telefone: "(71) 3591-9542", 
    endereco: "2ª Travessa São Luís 342 Tancredo Neves "
});


console.log(listatelefonica);

var ListaDeProdutos = [];

ListaDeProdutos.push({
    Produto: "salgadinho",
    Valor: 10.00, 
    Codigo: 123

});

ListaDeProdutos.push({
    Produto: "suco de limão",
    Valor: 7.00, 
    Codigo: 456
});

console.log(ListaDeProdutos);
*/
var ListaDeAlunos = [];

ListaDeAlunos.push({
    Aluno: "Carlos",
    Nota: 2.0
});

ListaDeAlunos.push({
    Aluno: "Rodrigo",
    Nota: 7.00
});

ListaDeAlunos.push({
    Aluno: "Vitoria",
    Nota: 5.00
});

var media =(ListaDeAlunos[0].Nota + ListaDeAlunos[1].Nota + ListaDeAlunos[2].Nota) /3

console.log(media);
