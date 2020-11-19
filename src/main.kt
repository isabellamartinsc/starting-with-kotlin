fun main () {

    var titular = "Isabella"
    val numeroConta: Int = 1006
    var saldo: Double = 0.0
    saldo += 200.0
    saldo -= 200.0

    println("Bem vindo ao ByteBank")
    println("Titular da conta: $titular, Número da conta: $numeroConta, Saldo da conta: $saldo")

    //Saldo positivo
    if (saldo > 0.0){
        println("Sua contá está com saldo positivo! :)")
    }
    //Saldo neutro ou sem saldo
    else if (saldo == 0.0){
        println("Você está sem saldo. :|")
    } else {
        println("Sua conta está com saldo negativo! :(")
    }

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

