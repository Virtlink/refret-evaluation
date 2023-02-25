test;
[p] {
[B]
    package p;
  
  public class B implements OldInterface{
  	private void s(){
  		OldInterface i;
  		i= find();
  	}
  	private A find(){
  		return new A();
  	}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	int amount();
  
  }
[OldInterface]
    package p;
  public interface OldInterface {
  }
  
[A]
    package p;
  
  public class A implements OldInterface, I{
  	public int amount(){ return 1;}
  }
  
}
