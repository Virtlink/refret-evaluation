test;
[p] {
[A]
    package p;
  //initialize in method
  class A{
  	private static int i;
  
  	static void f(){
  		i= 0;
  		int j= i;
  	}
  }
}
