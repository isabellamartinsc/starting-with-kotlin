class Funcionario(val nome: String, val cpf: Long, val salario: Double, val tipo: Int){
   fun bonificacao(): Double {
       return salario * 0.1
       when (tipo) {
           0 -> {
               salario * 0.1
           }
           1 -> {
               salario * 0.2
           }
           else -> {
               salario * 0.3
           }
       }
   }
}