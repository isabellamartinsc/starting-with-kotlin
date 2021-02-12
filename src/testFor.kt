import java.sql.DriverManager

fun testFor() {
    //Cria 5 contas
    for (i in 1..5) {

        var titular = "Isabella$i"
        val numeroConta: Int = 1006 + i
        var saldo: Double = 0.0 + i

        DriverManager.println("Bem vindo ao ByteBank")
        DriverManager.println("Titular da conta: $titular, Número da conta: $numeroConta, Saldo da conta: $saldo")

        //Saldo positivo
        if (saldo > 0.0) {
            DriverManager.println("Sua contá está com saldo positivo! :)")
        }
        //Saldo neutro ou sem saldo
        else if (saldo == 0.0) {
            DriverManager.println("Você está sem saldo. :|")
        } else {
            DriverManager.println("Sua conta está com saldo negativo! :(")
        }
    }
}