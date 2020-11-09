package nov03;

public class Room {
	private int width;
	private int lenght;
	private int height;
	public Room(int width, int lenght, int height) {
		this.width=width;
		this.lenght=lenght;
		this.height=height;
		
	}
    public int getWidth() {
    	return width;
    }
    public void setWidth(int width) {
    	this.width=width;
    }
    public int getLenght() {
    	return lenght;
    }
    public void setLenght(int lenght) {
    	this.lenght=lenght;
    }
    public int getHeight() {
    	return height;
    }
    public void setHeight(int height) {
    	this.height=height;
    }
    public int calculateArea() {
    	return 2*lenght*height+2*width*height+lenght*width;
    	
    }
}