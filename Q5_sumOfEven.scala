object Q5_sumOfEven extends App{
 
    def sum(startno:Int,endno:Int):Int={
        if(startno > endno) 0
        else startno + sum(startno+2, endno)
    }

    var startno=4
    var endno=6
    
    println("Sum of even numbers from "+startno+" to "+endno+" = "+ sum(startno,endno))
   
}
