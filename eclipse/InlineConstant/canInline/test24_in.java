test;
[q] {
[Consts]
    package q;
  
  import p.A;
  import static p.A.getCount2;
  
  public interface Consts {
  	int I= 1;
  	int III= I + Consts.I + q.Consts.I
  			+ p.A.getCount() + A.getCount() + getCount2();
  }
}
[p] {
[A]
    //14, 17, 14, 17  replaceAll == true, removeDeclaration == true
  package p;
  
  import static q.Consts.III;
  import q.Consts;
  
  public class A {
  	public static final int getCount() { return 42; }
  	public static final int getCount2() { return 42; }
  
  	int getIII() {
  		int i= q.Consts.III;
  		int ii= Consts.III;
  		return III + i + ii;
  	}
  }
  
}
