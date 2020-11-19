fun main() {
//    calculaSaldo(saldo = 300.0)
//    testDownTo()
    testFor()
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
