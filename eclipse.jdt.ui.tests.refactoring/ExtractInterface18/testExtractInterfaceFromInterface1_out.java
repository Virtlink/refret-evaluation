test;
[p] {
[B]
    package p;
  
  /** typecomment template*/
  interface B {
  
  	void abstractM1();
  
  	void abstractM2();
  
  	void abstractM3();
  
  	void abstractM4();
  
  	void defaultM1(String s);
  
  }
[A]
    package p;
  
  interface A extends B {
  	public default void defaultM1(String s) {
  		System.out.println(s);
  	}
  
  	public static void statictM1(String s) {
  		System.out.println(s);
  	}
  }
}
