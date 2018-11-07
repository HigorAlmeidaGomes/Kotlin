import javax.swing.JOptionPane

class Teste(){

    var text: String = ""
        get() { return "chamou o get" }

    fun mostrarSemVirgula(): String{
        return text.replace("mutchu", "higor")
    }

}


fun main(args: Array<String>) {

    val minhaclasse = Teste()
    minhaclasse.text = "mutchu mutchu"
    print(minhaclasse.text)
    print(minhaclasse.mostrarSemVirgula())

    multiplicaoCalcudaloraa()
    adicaoCalculadora()
    subtracaoCalculadora()

}

fun adicaoCalculadora(){
    var a: Int
    var b: Int
    var resultado: Int
    JOptionPane.showInputDialog("Digite um numero")
    a = readLine()?.toInt() as Int
    print("Digite segundo Numero")
    b = readLine()?.toInt() as Int

    resultado = a+b
    println(resultado)
}

fun  multiplicaoCalcudaloraa(){
    var a: Int
    var b: Int
    var resultado: Int
    print("Digite um numero para multiplicao ")
    a = readLine()?.toInt() as Int
    print("Digite um segundo numero para multipilicao ")
    b = readLine()?.toInt() as Int
    resultado = a*b
    println(resultado)
}

fun subtracaoCalculadora(){
    var a: Int
    var b: Int
    var resultado: Int
    println("Digite o primeiro numero")
    a = readLine()?.toInt() as Int
    println("Digite o segundo numero")
    b = readLine()?.toInt() as Int

    resultado = a-b

    JOptionPane.showMessageDialog(
            null,
            "O Resultado e $resultado"
    )



}