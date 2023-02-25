test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	/**
  	 * comment f
  	 */
  	void f();
  
  	/** comment fz*/
  	void fz();
  
  	/**
  	 * comment f1
  	 */
  	void f1();
  
  	/** comment f1z*/
  	void f1z();
  
  	//comment f11
  	void f11();
  
  	void f2();
  
  	/** 
  	 * jdoc I1
  	 */
  	int I1= 0;
  	/** jdoc I1z*/
  	int I1z= 0;
  	/** 
  	 * comI2
  	 */
  	int I2= 0;
  	/** com I2z*/
  	int I2z= 0;
  	//comment I3
  	int I3= 0;
  	int I4= 0;
  
  }
[A]
    package p;
  
  public class A implements I {
  	/**
  	 * comment f
  	 */
  	public void f(){
  	} 
  
  	/** comment fz*/
  	public void fz(){
  	} 
  
  	/**
  	 * comment f1
  	 */
  	public void f1(){
  	} 
  
  	/** comment f1z*/
  	public void f1z(){
  	} 
  
  	//comment f11
  	public void f11(){
  	}
  
  	public void f2(){
  	}
  }
}
