package lessonoop;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		System.out.println(this.length);

	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width; 
		System.out.println(this.length);
	}

}
