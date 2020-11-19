fun main() {

    val contaIsabella = Conta()
    contaIsabella.titular = "Isabella Cruz"
    contaIsabella.numeroConta = 12345
    contaIsabella.saldo = 0.00

    println("Depositando na conta da Isabella, valor de: ")
    deposita(contaIsabella, valor = 300.0)
    println(contaIsabella.saldo)
}



fun deposita(conta: Conta, valor: Double){
    //Modifica o saldo da conta, somando com o valor recebido
    conta.saldo += valor

}
fun testingClasses(){
    //Instanciando a classe de Conta
    Conta()

    //Instanciando a classe de conta, atribuindo a uma variavel

    val contaIsabella = Conta()
    contaIsabella.titular = "Isabella Cruz"
    contaIsabella.numeroConta = 12345
    contaIsabella.saldo = 0.00

    val contaEmerson = Conta()
    contaEmerson.titular = "Emerson Lima"
    contaEmerson.numeroConta = 54321
    contaIsabella.saldo = 100.0

    println(contaIsabella.titular)
    println(contaEmerson.titular)


}
//Criada classe de Conta
class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
}


fun lacosRepeticao() {
    //Loop infinito. Para se incrementarmos a variavel com ++
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }

    fun testFor() {
        //Cria 5 contas
        for (i in 1..5) {

            var titular = "Isabella$i"
            val numeroConta: Int = 1006 + i
            var saldo: Double = 0.0 + i

            println("Bem vindo ao ByteBank")
            println("Titular da conta: $titular, Número da conta: $numeroConta, Saldo da conta: $saldo")

            //Saldo positivo
            if (saldo > 0.0) {
                println("Sua contá está com saldo positivo! :)")
            }
            //Saldo neutro ou sem saldo
            else if (saldo == 0.0) {
                println("Você está sem saldo. :|")
            } else {
                println("Sua conta está com saldo negativo! :(")
            }
        }
    }

    fun testDownTo() {
        //Cria 5 contas em ordem decrescente
        for (i in 5 downTo 2) {

            var titular = "Isabella$i"
            val numeroConta: Int = 1006 + i
            var saldo: Double = 0.0 + i

            println("Bem vindo ao ByteBank")
            println("Titular da conta: $titular, Número da conta: $numeroConta, Saldo da conta: $saldo")

            //Saldo positivo
            if (saldo > 0.0) {
                println("Sua contá está com saldo positivo! :)")
            }
            //Saldo neutro ou sem saldo
            else if (saldo == 0.0) {
                println("Você está sem saldo. :|")
            } else {
                println("Sua conta está com saldo negativo! :(")
            }
        }

    }
}

fun calculaSaldo(saldo: Double) {
    //Saldo positivo
    when {
        saldo > 0.0 -> {
            println("Sua contá está com saldo positivo! :)")
        }
        //Saldo neutro ou sem saldo
        saldo == 0.0 -> {
            println("Você está sem saldo. :|")
        }
        else -> {
            println("Sua conta está com saldo negativo! :(")
        }
    }
}


