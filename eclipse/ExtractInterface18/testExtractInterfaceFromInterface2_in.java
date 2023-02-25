test;
[p2] {
[I2]
    package p2;
  
  public interface I2{
  	public static final int total= 100;
  
  }
}
[p] {
[A]
    package p;
  
  import p2.I2;
  
  public interface A extends I1{
  	public static final int count= 10;
  	public abstract void abstractM1();
  
  	public void abstractM2();
  
  	abstract void abstractM3();
  
  	void abstractM4();
  
  	public default void defaultM1() {
  		System.out.println(count);
  		System.out.println(message);
  		System.out.println(I2.total);
  	}
  
  	public static void statictM1(String s) {
  		System.out.println(s);
  	}
  }
[I1]
    package p;
  
  public interface I1{
  	public static final String message= "Reporting from super interface.";
  
  }
}
