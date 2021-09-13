const net = require('net');

const readline = require('readline-sync');

// const {Buffer} = require('buffer');

// console.log(Buffer.from('Olá node', 'utf8'));


// Prints: <Buffer 66 68 71 77 68 67 61 64 73>

const HOST = '127.0.0.1'; // parametrizar o IP do Listen
const PORT = 6969; // porta TCP LISTEN

// Cria a instância do Server e aguarda uma conexão
net.createServer(function(sock) {

    // Opa, recebemos uma conexão - um objeto socket é associado à conexão automaticamente
    console.log('CONNECTED: ' + sock.remoteAddress +':'+ sock.remotePort);

    // Adiciona um 'data' - "event handler" nesta instância do socket
    sock.on('data', function(data) {
        console.log(data, 'como a informação chega')
        // dados foram recebidos no socket
        // Escreve a mensagem recebida de volta para o socket (echo)
       console.log(`Java : ${data.toString()}`)
       let resposta = readline.question('Resposta:')
        sock.write(`${resposta}#${data}`);
        // sock.write(`${resposta}`);
    });

    // Adiciona um 'close' - "event handler" nesta instância do socket
    sock.on('close', function(data) {
        // conexão fechada
        console.log('CLOSED: ' + sock.remoteAddress +' '+ sock.remotePort);
    });

}).listen(PORT, HOST);

console.log('Server listening on ' + HOST +':'+ PORT);