/* Función para mostra/ocultar el menú */

var lista = document.querySelectorAll('.nav li');
function activarLink() {
    lista.forEach((item) =>
        item.classList.remove('active'));
    this.classList.add('active');
}

lista.forEach((item) =>
    item.addEventListener('mouseover', activarLink));

/* Función para mostra/ocultar el menú */

var toogle = document.querySelector('.toggle');
var nav = document.querySelector('.nav');
var container = document.querySelector('.container');

toogle.oneclick = function() {
    nav.classList.toogle('active');
    container.classList.toogle('active');
}