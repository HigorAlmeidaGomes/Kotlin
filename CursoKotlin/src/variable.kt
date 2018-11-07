fun main(args: Array<String>) {
Pessoa()

}

fun Pessoa(){
    var nome: String
    var idade:Int
    println("Digite o seu Nome")
    nome = readLine()?.toString() as String
    println("Digite a sua idade")
    idade = readLine()?.toInt() as Int

    println("Seja Bem vindo " + nome + " sua idade e " + idade)
}