package week6;

public class Box {
	int width;
	int height;
	int depth;
	float volume;
	public Box(int width,int height,int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	float calculateVolume()
	{
		return width*height*depth;
	}
}
