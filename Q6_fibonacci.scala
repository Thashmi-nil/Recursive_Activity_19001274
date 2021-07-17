object Q6_fibonacci extends App{
 
    def fib(n:Int):Int=n match{
        case n if n==0 =>0
        case n if n==1 =>1
        case n => fib(n-1)+fib(n-2)
    
    }

    var fibCount=8
    println("FIbonacci Seris")

    for(i<-0 to fibCount){
        println(fib(i))
    }
}