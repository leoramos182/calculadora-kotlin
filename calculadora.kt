import java.util.*
import kotlin.math.sqrt

fun main(args : Array<String>){
    var teclado : Scanner = Scanner(System.`in`)
    val n1 : Float
    val n2 : Float
    val aux : Int
    println("Digite seu primeiro número")
    n1 = teclado.nextFloat()

    println("Digite a operação desejada:")
    println("0 - Somatório")
    println("1 - Subtração")
    println("2 - Divisão")
    println("3 - Multiplicação")
    println("4 - Raiz quadrada")
    aux = teclado.nextInt()
    if(aux > 3){
        operacaoEspecial(n1,aux)
    }
    else {
        println("Digite o segundo número")
        n2 = teclado.nextFloat()
        operacaoBasica(n1,n2,aux)

    }


}
fun operacaoBasica(n1 : Float,n2 : Float,aux : Int){
    when(aux){
        0 -> println("A soma é: ${n1.plus(n2)}")
        1 -> println("A subtração é: ${n1.minus(n2)}")
        2 -> println("A divisão é: ${n1/n2}")
        3 -> println("A multiplicação é: ${n1*n2}")
    }

}
fun operacaoEspecial(n1: Float,aux : Int){
    when(aux){
        4 -> println("A raiz quadrada é: ${sqrt(n1)}")

    }
}
