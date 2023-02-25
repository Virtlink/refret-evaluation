test;
[p] {
[ArrayList]
    package p;
  
  public class ArrayList {
  	public int x;
  	public int y;
  	public ArrayList(int x, int y) {
  		this.x = x;
  		this.y = y;
  	}
  }
[TestImportNameSimple]
    package p;
  
  public class TestImportNameSimple {
  	public static void main(String[] args) {
  		foo(new ArrayList(5, 6));
  	}
  
  	public static void foo(ArrayList p) {
  		System.out.println(p.x + ", " + p.y);
  	}
  }
  
}
