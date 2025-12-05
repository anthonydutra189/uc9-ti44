function random(inferior=0, superior=1,tipo='Float'){
if(superior<inferior)
{
    console
        .error("Número maximo dever ser maior que o número minimo");
    return;
}

switch(tipo){
    case 'float':
        return Math.random()
        *(superior+1-inferior)+(inferior);
    case 'int':
        return Math.floor(Math.random()
        *(superior+1-inferior))+(inferior);
}

}
   
function validateCPF(cpf) {{
        // Remove non-numeric characters
        cpf = cpf.replace(/[^\d]/g, '');
        
        // Check length
        if (cpf.length !== 11) {
            return false;
        }
        
        // Check for known invalid patterns (all same digits)
        if (/^(\d)\1{10}$/.test(cpf)) {
            return false;
        }
        
        // Calculate first check digit
        let sum = 0;
        for (let i = 0; i < 9; i++) {
            sum += parseInt(cpf.charAt(i)) * (10 - i);
        }
        let remainder = (sum * 10) % 11;
        if (remainder === 10 || remainder === 11) remainder = 0;
        if (remainder !== parseInt(cpf.charAt(9))) {
            return false;
        }
        
        // Calculate second check digit
        sum = 0;
        for (let i = 0; i < 10; i++) {
            sum += parseInt(cpf.charAt(i)) * (11 - i);
        }
        remainder = (sum * 10) % 11;
        if (remainder === 10 || remainder === 11) remainder = 0;
        if (remainder !== parseInt(cpf.charAt(10))) {
            return false;
        }
        
        return true;}
    
    // Example usage and test cases
    const testCPFs = [
        '123.456.789-09',  // Valid (example CPF)
        '111.444.777-35',  // Valid
        '123.456.789-10',  // Invalid
        '000.000.000-00',  // Invalid (pattern)
        '111.111.111-11',  // Invalid (pattern)
        '123',             // Invalid (too short)
        '123.456.789-09abc' // Will be cleaned and validated
    ];
    
    testCPFs.forEach(cpf => {
        console.log(`${cpf} -> ${validateCPF(cpf) ? 'Valid' : 'Invalid'}`);
    });
    
    // Usage in form validation:
    function validateCPFField(cpfInput) {
        const isValid = validateCPF(cpfInput.value);
        if (isValid) {
            cpfInput.classList.remove('error');
            cpfInput.classList.add('success');
        } else {
            cpfInput.classList.remove('success');
            cpfInput.classList.add('error');
        }
        return isValid;
    }
}
    

// Retorna um objeto com os resultados da validação

// Regex básico para email (formato geral: algo@dominio.com)
function validaEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const isEmailValid = emailRegex.test(email);
}

// Regex para telefone (formato simples: aceita dígitos, espaços, hífens, parênteses, opcional + no início)
// Ajuste conforme o país/região necessário; este é genérico
function validaNumero(numero) {
    const neumroRegex = /^\+?[\d\s\-\(\)]+$/;
    const isnumeroValid = numeroRegex.test(numero) && numero.replace(/[^\d]/g, '').length >= 10; // Pelo menos 10 dígitos
}


// Saída: { emailValid: false, phoneValid: false, bothValid: false }



module.exports = {
    validaEmail,validaNumero,validateCPF,random
}
