package basic

import java.math.BigInteger
import javax.swing.JOptionPane

class Person

class pet

val name: String = "Higor"
fun test() {

}

fun main(args: Array<String>) {
    var escolha: Int
    do {
        println("Escolha A Funcao que deseja efetuar")
        println("[1] CadastrarPessoa")
        println("[2] Calculadora SOMAR")
        println("[3] Calculadora SUBUTRAIR")
        println("[4] Calculadora Fatorial")
        println("[5] Calculadora Dividir")
        println("[6] Calculadora Multiplicar")

        escolha = readLine()?.toInt() as Int
        if (escolha == 1) {
            cadastroPessoa()
        } else if (escolha == 2) {
            chamadaCalculdaraSomar()
        } else if (escolha == 3) {
            chamadoCalculadorasubtrair()
        } else if (escolha == 4) {
            chamadaCalculadoraFatorial()
        } else if (escolha == 5) {
            chamadaCalculadoraDividir()
        } else if (escolha == 6) {
            chamadaCalculadoraMultiplicar()
        }

    } while (escolha == 0)
        
}


fun cadastroPessoa() {
    val nome: String
    val sobreNome: String
    val idade: Int
    val endereco: String
    val sexo: Boolean

    println("Digite o seu nome")
    nome = readLine()?.toString() as String
    println("Digite o seu SobreNome")
    sobreNome = readLine()?.toString() as String
    println("Digite a sua idade")
    idade = readLine()?.toInt() as Int

    if (idade < 18) {
        JOptionPane.showMessageDialog(null, "Voce e de menor nao pode ser cadastrado!!!!")
    } else {
        JOptionPane.showMessageDialog(null, "$nome $sobreNome " + " Seja Bem-Vindo !")
    }
}

fun decimalDigitalvalue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Fora de Alcance")
    return c.toInt() - '2'.toInt()

}

fun chamadaCalculdaraSomar() {
    val a: Int
    val b: Int
    val resposta: Int
    println("Digite um numero")
    a = readLine()?.toInt() as Int
    println("Digite um segundo numero")
    b = readLine()?.toInt() as Int

    resposta = a + b

    JOptionPane.showMessageDialog(null, "A sua soma e $resposta")
}

fun chamadoCalculadorasubtrair() {
    val a: Int
    val b: Int

    println("Digite um numero")
    a = readLine()?.toInt() as Int
    println("Digite um segundo numero")
    b = readLine()?.toInt() as Int
    val resposta: Int = a - b

    JOptionPane.showMessageDialog(null, "Sua subtracao e $resposta")
}

fun chamadaCalculadoraFatorial() {
    val num = 5
    var factorial = BigInteger.ONE
    for (i in 1..num) {
        factorial = factorial.multiply(BigInteger.valueOf(num.toLong()))
    }
    JOptionPane.showMessageDialog(null, "Fatorial of $num = $factorial")

}

fun chamadaCalculadoraDividir() {
    val a: Int
    val b: Int
    val resposta: Int

    println("Digite o primeiro numero")
    a = readLine()?.toInt() as Int
    println("Digite o segundo Numero")
    b = readLine()?.toInt() as Int

    resposta = a / b

    JOptionPane.showMessageDialog(null, "Sua Divicao e $resposta")

}

fun chamadaCalculadoraMultiplicar() {
    val a: Int
    val b: Int
    val resposta: Int

    println("Digite o primeiro numero")
    a = readLine()?.toInt() as Int
    println("Digite o segundo Numero")
    b = readLine()?.toInt() as Int

    resposta = a * b

    JOptionPane.showMessageDialog(null, "Sua Multiplicacao e $resposta")
}

