console.log("Hello world, no arquivo js!")
console.log(1 + "1")
console.log(1 - "1")

var x = 10
let y = 11

var x = 10
//let y = 11

console.log(typeof(x))

console.log("aula" * 2)

let numero = Number("50")

let numeroString = String(50)
let casasDecimais = 10.9988

console.log(typeof(numero))
console.log(typeof(numeroString))

//typeof retorna tipo NUMBER para um numero com casas decimais
console.log(typeof(casasDecimais))

//biblioteca MATH para fazer a potencia do numero
console.log(Math.pow(2, 2))

//random para entregar numero aleatório
//a multiplicação serve para o numero máximo que 
//se deseja mostrar o numero aleatóio,
//o parseInt converte o numero random para inteiro
console.log(parseInt(Math.random()*20))

//document.querySelector('h1').innerHTML = "Meu título no JS"


//document.querySelector('p').innerHTML = "Meu parágrafo no JS"
//document.querySelector('a').innerHTML = "Link Youtube no JS"

//document.getElementById('tituloID').innerHTML = "Meu titulo no JS por Id"
//document.getElementsByClassName('tituloClass').innerHTML = "Meu título no JS por Classe"
//document.querySelector('.tituloClass').innerHTML = "Meu título no JS pela classe"

//vetor em javascript, segue o mesmo padrão do Java
//os dados tem que ser do mesmo tipo
var vetorNumerico = [1, 2, 3, 4, 5]

//recupera o índice e retorna o valor
console.log(vetorNumerico[0])

function multiplicar(a, b){
    console.log(a * b)
}
//chamar a função para ser executada
multiplicar(10, 10)

function funcaoComRetorno(x, y){
    return x * y
}
console.log(funcaoComRetorno(10, 5))

//Arrowfunction
var mensagemOla = () => {
    return "Olá novamente"
}
console.log(mensagemOla())

document.getElementById('recebeuFoco').onfocus = function(){
    focado()
}

function focado(){
    document.getElementById('recebeuFoco').style.background = 'green'
}

function valorDigitado(){
    let recebido = document.getElementById('recebeuFoco').value
    alert("Valor recebido via input: " + recebido)
}