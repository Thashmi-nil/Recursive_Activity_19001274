object Q1_findPrime extends App{
 
  def prime(p:Int,n:Int=2):Boolean=n match{
     case x if(p==x) => true
     case x if(p%x==0) => false
     case x => prime(p,x+1)
  }
  println("Find prime numbers")
  println("5  => "+prime(5))
  println("8  => "+prime(8))
  println("18 => "+prime(18))
  println("823=> "+prime(823))

}
