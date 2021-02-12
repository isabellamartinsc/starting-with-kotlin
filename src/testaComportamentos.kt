import java.sql.DriverManager

fun testaComportamentos() {
    val contaIsabella = Conta(titular = "Isabella Cruz", numeroConta = 12345)
    contaIsabella.deposita(100.0)
    println(contaIsabella.saldo)


    val contaEmerson = Conta("Emerson Lima", 54321)
    contaEmerson.deposita(100.0)


    DriverManager.println("Depositando na conta da Isabella, valor de: ")
    contaIsabella.deposita(00.0)
    println(contaIsabella.saldo)

    DriverManager.println("Sacando na conta da Isabella")
    contaIsabella.saque(400.0)
    DriverManager.println("Saldo restante na conta: R$")
    println(contaIsabella.saldo)

    DriverManager.println("Transferindo da conta da Isabella para Emerson")
    if (contaIsabella.transfere(200.0, contaEmerson)) {
        DriverManager.println("Valor transferido com sucesso!")
    } else DriverManager.println("Falha na transferencia.")
}


//fun testingClasses() {
//    //Instanciando a classe de Conta
//    Conta()
//
//    //Instanciando a classe de conta, atribuindo a uma variavel
//
//    val contaIsabella = Conta()
//    contaIsabella.titular = "Isabella Cruz"
//    contaIsabella.numeroConta = 12345
//    contaIsabella.deposita(100.0)
//
//    val contaEmerson = Conta()
//    contaEmerson.titular = "Emerson Lima"
//    contaEmerson.numeroConta = 54321
//    contaEmerson.deposita(100.0)
//
//    println(contaIsabella.titular)
//    println(contaEmerson.titular)
//
//
//}