test;
[p] {
[B]
    package p;
  
  public class B implements OldInterface{
  	private void s(){
  		OldInterface i= find();
  	}
  	private A find(){
  		return new A();
  	}
  }
  
[OldInterface]
    package p;
  public interface OldInterface {
  }
  
[A]
    package p;
  
  public class A implements OldInterface{
  	public int amount(){ return 1;}
  }
  
}
