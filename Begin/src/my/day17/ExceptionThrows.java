package my.day17;

public class ExceptionThrows {

	private String name;
	private String point;
	private String hakjum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoint() {
		return point;
	}
	                               /*NumberFormatException가 일어날 수 있따.*/
	public void setPoint(String point) throws NumberFormatException{
		this.point = point;
		
		int jumsu = Integer.parseInt(point);
		
		switch (jumsu/10) {
		case 10:
		case 9:
			hakjum = "A";
			break;
		case 8:
			hakjum = "B";
			break;
		case 7:
			hakjum = "C";
			break;
		case 6:
			hakjum = "D";
			break;

		default:
			hakjum = "F";
			break;
		}
	}
	public String getHakjum() {
		return hakjum;
	}
	
	

}
