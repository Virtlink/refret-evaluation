test;
[q] {
[Consts]
    package q;
  
  import p.A;
  import r.Third;
  import static p.A.getCount2;
  import static r.Third.B;
  
  public interface Consts {
  	int I= 1;
  	int III= I + A.getCount() + getCount2() + Third.A + B;
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
  
  import static q.Consts.III;
  
  public class A {
  	public static final int getCount() { return 42; }
  	public static final int getCount2() { return 42; }
  
  	int getIII() {
  		return III;
  	}
  }
  
}
