test;
[q] {
[Consts]
    package q;
  
  public interface Consts {
  	int I= 1;
  }
}
[r] {
[Third]
    package r;
  
  public class Third {
  	public static final int A= -23;
  	public static final int B= 23;
  }
}
[p] {
[A]
    //11, 16 -> 11, 19  replaceAll == true, removeDeclaration == true
  package p;
  
  import static p.A.getCount2;
  import static q.Consts.I;
  import static r.Third.B;
  
  import r.Third;
  
  public class A {
  	public static final int getCount() { return 42; }
  	public static final int getCount2() { return 42; }
  
  	int getIII() {
  		return I + A.getCount() + getCount2() + Third.A + B;
  	}
  }
  
}
