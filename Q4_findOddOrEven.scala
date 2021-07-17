object Q4_findOddOrEven extends App{
 
    def check(n:Int):Boolean={
        if (n < 2) return (n % 2 == 0)
        return (check(n - 2))
    }

    var numS=2
    var numE=8

    println("Even and odd numbers from "+numS+" to "+numE)

    for(i<-numS to numE){
        if(check(i)==true)
            println("Number "+i+" is even!")
        else
            println("Number "+i+" is odd!")
    }
}