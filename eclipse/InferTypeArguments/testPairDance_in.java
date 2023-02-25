test;
[p] {
[Pair]
    package p;
  
  public class Pair<A, B> {
      private A a;
      private B b;
    
      public A getA() {
          return a;
      }
      public void setA(A a) {
          this.a= a;
      }
      public B getB() {
          return b;
      }
      public void setB(B bee) {
          b= bee;
      }
      public String toString() {
          return super.toString() + ", a=" + a + ", b=" + b;
      }
  }
  
[InvertedPair]
    package p;
  
  class InvertedPair<A, B> extends Pair<B, A> {
      public B getA() {
          return super.getA();
      }
      public void setB(A bee) {
          super.setB(bee);
      }
  }
  
[A]
    package p;
  
  class PairDance {
      public static void main(String[] args) {
          InvertedPair/*<Integer, Double>*/ ip= new InvertedPair/*<Integer, Double>*/();
          Pair/*<Double, Integer>*/ p= ip;
          p.setA(Double.valueOf(1.1));
          Double a= (Double) ip.getA();
          ip.setB(Integer.valueOf(2));
          System.out.println(ip);
      }
  }
  
}
