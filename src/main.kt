//1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
//2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
//3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
//4) Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares.
//5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
//6) Escrever um programa que exiba os primeiros 100 números positivos.

fun main(){
    println("Resultado Exercicio 1: " + exercicioUm(17,22,22))
    println("Resultado Exercicio 2: " + exercicioDois("Teste","Teste"))
}

fun exercicioUm(numeroUm: Int, numeroDois: Int, numeroTres: Int):Int{
    var retorno:Int = 0
    when{
        numeroUm >= numeroDois && numeroUm >= numeroTres -> retorno = numeroUm
        numeroDois >= numeroUm && numeroDois >= numeroTres -> retorno = numeroDois
        numeroTres >= numeroUm && numeroTres >= numeroUm -> retorno = numeroTres
    }
    return retorno
}

fun exercicioDois(textoUm:String, textoDois:String):Boolean{
    return textoUm == textoDois
}


