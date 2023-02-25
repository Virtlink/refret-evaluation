test;
[simple] {
[StaticGetter1]
    //selection: 9, 32, 9, 37
  //name: foo -> foo
  package simple;
  
  public class StaticGetter1 {
  	public static int foo() { return 17; }
  	void bar() {
  		int i= 3;
  		System.out.println(i + foo());
  	}
  	void use() {
  		bar();
  	}
  }
  
[Expression3]
    //selection: 7, 22, 7, 27
  //name: i -> first
  package simple;
  
  public class Expression3 {
  	public void m() {
  		int a= 1 - ((2 + 3));
  	}
  	public void use() {
  		m();
  	}
  }
  
[Enum1]
    //selection: 7, 18, 7, 24
  //name: enum1 -> a
  package simple;
  
  public class C1 {
  	public static void test() {
  		new Test(Enum.A);
  	}
  }
  enum Enum {
  	A
  }
  class Test {
  	public Test(Enum e) {
  	}
  }
[NewInstance1]
    //selection: 7, 19, 7, 36
  //name: string -> abc
  package simple;
  
  public class NewInstance1 {
  	public void m(int a) {
  		String s= new String("abc");
  	}
  }
  
  class User {
  	public void use() {
  		new NewInstance1().m(17);
  	}
  }
  
[ConstantExpression2]
    //selection: 12, 16, 12, 52
  //name: i -> length
  package simple;
  
  import java.util.Vector;
  
  public class ConstantExpression2 {
  	private Vector fBeginners;
  	private Vector fAdvanced;
  
  	private int count() {
  		return fBeginners.size() + fAdvanced.size();
  	}
  	public void use() {
  		count();
  	}
  }
  
[Vararg1]
    //selection: 7, 16, 7, 18
  //name: j -> answer
  package simple;
  
  public class Vararg1 {
      int foo(int i, int... array) {
          return 42;
      }
  }
  
[Expression2]
    //selection: 7, 20, 7, 27
  //name: i -> first
  package simple;
  
  public class Expression2 {
  	public void m() {
  		int a= 1 - (2 + 3);
  	}
  	public void use() {
  		m();
  	}
  }
  
[Formatting1]
    //selection: 10, 21, 11, 40
  //name: is -> ints
  package simple;
  
  public class Formatting1 {
  	public void method1() {
  		method2();
  	}
  	public void method2() {
  		doSomething(new int[]{1, 2, //newline
  				3/*important comment*/});
  	}
  	private void doSomething(int[] is) {
  	}
  }
[Javadoc2]
    //selection: 10, 28, 10, 37
  //name: ship -> ship
  package simple;
  
  public class Javadoc2 {
  	/**
  	 * Run it.
  	 */
  	public void go() {
  		System.out.println(getShip());
  	}
  	private float getShip() {
  		return 3.0f;
  	}
  }
[Wildcard1]
    //selection: 13, 19, 13, 31
  //name: number -> number
  package simple;
  
  import java.util.List;
  
  public class Wildcard1 {
  	private List<? extends Number> field= null;
  	private void use() {
  		foo();
  	}
  	private void foo() {
  		Number n= field.get(0);
  	}
  }
  
[Expression5]
    //selection: 7, 20, 7, 29
  //name: i -> first
  package simple;
  
  public class Expression5 {
  	public void m() {
  		int a= 1 - ((2 + 3));
  	}
  	public void use() {
  		m();
  	}
  }
  
[Expression4]
    //selection: 7, 21, 7, 28
  //name: i -> first
  package simple;
  
  public class Expression4 {
  	public void m() {
  		int a= 1 - ((2 + 3));
  	}
  	public void use() {
  		m();
  	}
  }
  
[ConstantString]
    //selection: 7, 28, 7, 45
  //name: string -> name
  package simple;
  
  public class ConstantString {
  	void bar() {
  		System.out.println("Charlie Chaplin");
  	}
  	void use() {
  		bar();
  	}
  }
  
[NewInstanceImport]
    //selection: 9, 20, 9, 46
  //name: iterator -> iter
  package simple;
  
  import java.util.ArrayList;
  
  public class NewInstanceImport {
  	public void m(int a) {
  		boolean b= new ArrayList().iterator().hasNext();
  	}
  	public void use() {
  		m(17);
  	}
  }
  
[Capture]
    //selection: 10, 12, 10, 13
  //name: list -> arg2
  package simple;
  
  import java.util.List;
  
  public class Capture {
      List<?> b= null;
      void take(List<?> a) {
          a= b;
      }
  }
  
[Wildcard2]
    //selection: 13, 19, 13, 31
  //name: object -> arg
  package simple;
  
  import java.util.List;
  
  public class Wildcard2 {
  	private List<? super Integer> field= null;
  	private void use() {
  		foo();
  	}
  	private void foo() {
  		Object n= field.get(0);
  	}
  }
  
[Expression1]
    //selection: 7, 21, 7, 26
  //name: i -> first
  package simple;
  
  public class Expression1 {
  	public void m() {
  		int a= 1 - (2 + 3);
  	}
  	public void use() {
  		m();
  	}
  }
  
[Javadoc1]
    //selection: 17, 21, 17, 40
  //name: is -> ints
  package simple;
  
  /**
   * @see Javadoc1#doSomething(int[])
   * @see #doSomething(int[] is)
   * 
   * @see Javadoc1#go(float)
   * @see #go(float ship)
   */
  public class Javadoc1 {
  	public void run() {
  		go(3.0f);
  	}
  	public void go(float ship) {
  		doSomething(new int[] {1, 2, 3});
  	}
  	static void doSomething(int[] is) {
  	}
  }
[ConstantExpression1]
    //selection: 8, 16, 8, 24
  //name: i -> second
  package simple;
  
  public class ConstantExpression1 {
  	public static final int ZERO= -1;
  	public int m(int a) {
  		int b= ZERO - 2;
  		return m(3 * a);
  	}
  	public void use() {
  		m(17);
  		m(17 * m(18));
  	}
  }
  
[Constructor1]
    //selection: 25, 33, 25, 41
  //name: string -> name
  package simple;
  
  /**
   * @see Constructor1#create(int num)
   * @see #create(int)
   * 
   * @see Constructor1#Constructor1(String)
   * @see #Constructor1(String name)
   */
  public class Constructor1 {
  	/**
  	 * @param name the name
  	 */
  	private Constructor1(String name) {
  		System.out.println(name);
  	}
  	/**
  	 * Creator.
  	 * @param num the count
  	 * @return a Constructor1
  	 */
  	public Constructor1 create(int num) {
  		return new Constructor1("secret" + " #" + num);
  	}
  }
}
