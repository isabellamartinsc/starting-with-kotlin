import java.sql.DriverManager

fun calculaSaldo(saldo: Double) {
    //Saldo positivo
    when {
        saldo > 0.0 -> {
            DriverManager.println("Sua contá está com saldo positivo! :)")
        }
        //Saldo neutro ou sem saldo
        saldo == 0.0 -> {
            DriverManager.println("Você está sem saldo. :|")
        }
        else -> {
            DriverManager.println("Sua conta está com saldo negativo! :(")
        }
    }
}