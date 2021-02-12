import java.sql.DriverManager

//Criada classe de Conta
class Conta(var titular: String, val numeroConta: Int) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        //Modifica o saldo da conta, somando com o valor recebido
        if (valor > 0){
            this.saldo += valor
        }
        this.saldo += valor
    }

    fun saque(valor: Double) {
        if (saldo > valor) {
            this.saldo -= valor
        } else DriverManager.println("Você está sem saldo na conta")
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false

    }


}