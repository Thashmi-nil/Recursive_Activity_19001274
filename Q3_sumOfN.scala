object Q3_sumOfN extends App{
 
    def sum(s:Int):Int={
        if(s==1) 1
        else s+sum(s-1)
    }

    val num=7
    println("Sum of first "+num+" number = "+ sum(num))
   
}