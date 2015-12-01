package Lesson5;
class Computer
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed=10;
	
	
	public Computer(String manufacturer, String processor, int ramSize,
			int diskSize) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
	}
	public double getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public double getDiskSize() {
		return diskSize;
	}


	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}


	public double getProcessorSpeed() {
		return processorSpeed;
	}


	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	double computePower()
	{
		return ramSize*processorSpeed;
		// return ramSize multiplied by processorSpeed
	}
}
class NoteBook extends Computer
{
	public NoteBook(String manufacturer, String processor, int ramSize,
			int diskSize,double height,double width,double weight) {
		super(manufacturer, processor, ramSize, diskSize);
		this.height=height;
		this.width=width;
		this.weight=weight;
	}
	double height;
	double width;
	double weight;
	double screensize()
	{
		return height*width;
		// return height multiplied by width
	}
}
public class Q2 {

	public static void main(String[] args) {
		Computer a = new Computer("Sony", "Sony", 5, 500);
		NoteBook b = new NoteBook("Sony", "Sony", 6, 1000,16,9,1);
		System.out.println("computePower : "+a.computePower());
		System.out.println("screensize : "+b.screensize());
	}

}
