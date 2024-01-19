package week6;

public class BoxDemo {

	public static void main(String[] args) {
		Box bx=new Box(6,4,2);
		bx.volume=bx.calculateVolume();
		System.out.println("Width= "+bx.width+"\n"+"Height= "+bx.height+"\n"+"Depth= "+bx.depth+"\n"+"Volume of box = "+bx.volume);

	}

}
