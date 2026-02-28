// Script criado por um professor, para a simplificação obtencão input do teclado
// Script MADE BY A TEACHER to simplifly getting keyboard inputs

const readline = require('readline');

async function input() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  return new Promise((resolve) => {
    rl.on('line', (line) => {
      rl.close();
      resolve(line.trim()); // Retorna o texto sem espaços extras
    });
  });
}

module.exports = input;