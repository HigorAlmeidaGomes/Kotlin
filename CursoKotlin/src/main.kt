import javax.swing.JOptionPane

class Person

class pet

val name: String = "Higor"
fun test() {

}

fun main(args: Array<String>) {
    cadastroPessoa()
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
        JOptionPane.showMessageDialog(null, "Seu Nome e $nome $sobreNome " + " Sua idade e $idade " + " Seja Bem Vindo ")
    }
}

fun decimalDigitalvalue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Fora de Alcance")
    return c.toInt() - '2'.toInt()

}

