object Q2_primeSequence extends App{
 
    def primeSeq(p:Int,n:Int=2):Boolean=n match{
        case x if(p==x) => true
        case x if(p%x==0) => false
        case x => primeSeq(p,x+1)
    }

    // val a=scala.io.StdIn.readInt()
    val num=15
    println("Prime numbers between 1 to "+num)
   
    for(i<-1 to num){
        if(primeSeq(i)==true)
            println(i)
    }
}
