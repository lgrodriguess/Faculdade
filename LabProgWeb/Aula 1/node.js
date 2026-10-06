const http = require('http');
const server = http.createServer((req, res) => {
    res.setHead('Content-Type': 'text/html' );
    const dataHora = new Date().toLocaleString();  
    res.end('<h1>Olá, mundo!</h1>');
}