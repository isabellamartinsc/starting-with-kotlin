fun fizzBuzz() {
    for (f in 1..20) {

        var response = ""
        //Múltiplo de 3\
        if (f % 3 == 0) {
            response += "Fizz"
        }

        if (f % 5 == 0) {
            response += "Buzz"
        }

        if(response == "FizzBuzz"){
            response = "Lucky"
        } else {
            if (f.toString().contains("3")) {
                response += "Fizz"
            }

            if (f.toString().contains("5")) {
                response += "Buzz"
            }
        }
        print("$f = $response\n")
    }
}