class Point2D {
	private int x;
	private int y;
	
	//기본 생성자 생략
	
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
}
class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
public class ExtendTest02 {

	public static void main(String[] args) {

		Point3D pt = new Point3D();
		pt.setX(10);
		pt.setY(20);
		pt.setZ(10);
		System.out.println("x좌표: "+pt.getX());
		System.out.println("y좌표: "+pt.getY());
		System.out.println("z좌표: "+pt.getZ());
	}

}
