test;
[simple.out] {
[StaticGetter1]
    //selection: 9, 32, 9, 37
  //name: foo -> foo
  package simple.out;
  
  public class StaticGetter1 {
  	public static int foo() { return 17; }
  	void bar(int foo) {
  		int i= 3;
  		System.out.println(i + foo);
  	}
  	void use() {
  		bar(foo());
  	}
  }
  
[Expression3]
    //selection: 7, 22, 7, 27
  //name: i -> first
  package simple.out;
  
  public class Expression3 {
  	public void m(int first) {
  		int a= 1 - (first);
  	}
  	public void use() {
  		m(2 + 3);
  	}
  }
  
[NewInstance1]
    //selection: 7, 19, 7, 36
  //name: string -> abc
  package simple.out;
  
  public class NewInstance1 {
  	public void m(int a, String abc) {
  		String s= abc;
  	}
  }
  
  class User {
  	public void use() {
  		new NewInstance1().m(17, new String("abc"));
  	}
  }
  
[ConstantExpression2]
    //selection: 12, 16, 12, 52
  //name: i -> length
  package simple.out;
  
  import java.util.Vector;
  
  public class ConstantExpression2 {
  	private Vector fBeginners;
  	private Vector fAdvanced;
  
  	private int count(int length) {
  		return length;
  	}
  	public void use() {
  		count(fBeginners.size() + fAdvanced.size());
  	}
  }
  
[Expression2]
    //selection: 7, 20, 7, 27
  //name: i -> first
  package simple.out;
  
  public class Expression2 {
  	public void m(int first) {
  		int a= 1 - first;
  	}
  	public void use() {
  		m(2 + 3);
  	}
  }
  
[Expression5]
    //selection: 7, 20, 7, 29
  //name: i -> first
  package simple.out;
  
  public class Expression5 {
  	public void m(int first) {
  		int a= 1 - first;
  	}
  	public void use() {
  		m(2 + 3);
  	}
  }
  
[Expression4]
    //selection: 7, 21, 7, 28
  //name: i -> first
  package simple.out;
  
  public class Expression4 {
  	public void m(int first) {
  		int a= 1 - first;
  	}
  	public void use() {
  		m(2 + 3);
  	}
  }
  
[ConstantString]
    //selection: 7, 28, 7, 45
  //name: string -> name
  package simple.out;
  
  public class ConstantString {
  	void bar(String name) {
  		System.out.println(name);
  	}
  	void use() {
  		bar("Charlie Chaplin");
  	}
  }
  
[NewInstanceImport]
    //selection: 8, 20, 8, 46
  package simple.out;
  
  import java.util.ArrayList;
  import java.util.Iterator;
  
  public class NewInstanceImport {
  	public void m(int a, Iterator iter) {
  		boolean b= iter.hasNext();
  	}
  	public void use() {
  		m(17, new ArrayList().iterator());
  	}
  }
  
[Expression1]
    //selection: 7, 21, 7, 26
  //name: i -> first
  package simple.out;
  
  public class Expression1 {
  	public void m(int first) {
  		int a= 1 - first;
  	}
  	public void use() {
  		m(2 + 3);
  	}
  }
  
[ConstantExpression1]
    //selection: 8, 16, 8, 24
  //name: i -> second
  package simple.out;
  
  public class ConstantExpression1 {
  	public static final int ZERO= -1;
  	public int m(int a, int second) {
  		int b= second;
  		return m(3 * a, second);
  	}
  	public void use() {
  		m(17, ZERO - 2);
  		m(17 * m(18, ZERO - 2), ZERO - 2);
  	}
  }
  
}
[p] {
[Enum1]
    //selection: 7, 18, 7, 24
  //name: enum1 -> a
  package p;
  
  public class C1 {
  	public static void test(Enum a) {
  		new Test(a);
  	}
  }
  enum Enum {
  	A
  }
  class Test {
  	public Test(Enum e) {
  	}
  }
}
[simple] {
[Vararg1]
    //selection: 7, 16, 7, 18
  //name: j -> answer
  package simple;
  
  public class Vararg1 {
      int foo(int i, int answer, int... array) {
          return answer;
      }
  }
  
[Formatting1]
    //selection: 10, 21, 11, 40
  //name: is -> ints
  package simple;
  
  public class Formatting1 {
  	public void method1() {
  		method2(new int[]{1, 2, //newline
  						3/*important comment*/});
  	}
  	public void method2(int[] ints) {
  		doSomething(ints);
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
  	 * @param ship TODO
  	 */
  	public void go(float ship) {
  		System.out.println(ship);
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
  		foo(field.get(0));
  	}
  	private void foo(Number number) {
  		Number n= number;
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
  		foo(field.get(0));
  	}
  	private void foo(Object arg) {
  		Object n= arg;
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
   * @see Javadoc1#go(float, int[])
   * @see #go(float ship, int[] ints)
   */
  public class Javadoc1 {
  	public void run() {
  		go(3.0f, new int[] {1, 2, 3});
  	}
  	public void go(float ship, int[] ints) {
  		doSomething(ints);
  	}
  	static void doSomething(int[] is) {
  	}
  }
[Constructor1]
    //selection: 25, 33, 25, 41
  //name: string -> name
  package simple;
  
  /**
   * @see Constructor1#create(int num, String name)
   * @see #create(int, String)
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
  	 * @param name TODO
  	 * @return a Constructor1
  	 */
  	public Constructor1 create(int num, String name) {
  		return new Constructor1(name + " #" + num);
  	}
  }
}
[capture] {
[Capture]
    //selection: 10, 12, 10, 13
  //name: list -> arg2
  package capture;
  
  import java.util.List;
  
  public class Capture {
      List<?> b= null;
      void take(List<?> a, List<?> arg2) {
          a= arg2;
      }
  }
  
}
