test;
[A]
    package p; //6, 44, 6, 44
  
  import java.util.function.Consumer;
  
  public class A {
  	Consumer<Integer> a1= x -> {
  		String string= x.toString();
  	};	
  }
