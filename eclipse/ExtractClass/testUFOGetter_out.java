test;
[p] {
[UFOGetter]
    package p;
  public class UFOGetter {
          private Position position = new Position();
  		private String homePlanet;
  
          public UFOGetter(int x, int y, int z, 
                          String homePlanet) {
                  this.position.setX(x);
                  this.position.setY(y);
                  this.position.setZ(z);
                  this.homePlanet= homePlanet;
          }
  
          public String toString() {
                  return "An UFO from " + homePlanet +
                          "is at position " +
                          "[" + position.getX() + ", " + position.getY() + ", " + position.getZ() + "]";
          }
  }
[Position]
    package p;
  
  public class Position {
  	private int x;
  	private int y;
  	private int z;
  	public Position() {
  	}
  	public int getX() {
  		return x;
  	}
  	public void setX(int x) {
  		this.x = x;
  	}
  	public int getY() {
  		return y;
  	}
  	public void setY(int y) {
  		this.y = y;
  	}
  	public int getZ() {
  		return z;
  	}
  	public void setZ(int z) {
  		this.z = z;
  	}
  }
}
