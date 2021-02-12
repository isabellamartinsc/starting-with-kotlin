import java.sql.DriverManager

fun lacosRepeticao() {
    //Loop infinito. Para se incrementarmos a variavel com ++
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        DriverManager.println("titular $titular");
        DriverManager.println("número da conta $numeroConta");
        DriverManager.println("saldo da conta $saldo");
        println();
        i++;
    }




}