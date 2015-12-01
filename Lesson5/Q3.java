package Lesson5;

abstract class Computer2
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed=10;
	double price;
	double height;
	double width;
	double weight;
	
	abstract double costProduct();
	
	
	public Computer2(String manufacturer, String processor, int ramSize,
			int diskSize, double price, double height,
			double width, double weight) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
		this.price = price;
		this.height = height;
		this.width = width;
		this.weight = weight;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public int getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public int getDiskSize() {
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


	public double getPrice() {
		return price;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	double computePower()
	{
		return ramSize*processorSpeed;
		// return ramSize multiplied by processorSpeed
	}
	
}
class NoteBook2 extends Computer2
{
	
	
	public NoteBook2(String manufacturer, String processor, int ramSize,
			int diskSize, double price, double height,
			double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize, price,
				height, width, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	double costProduct() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}


}
public class Q3 {

	public static void main(String[] args) {
		Computer2 b = new NoteBook2("Sony","sony", 5, 500, 3800, 16, 9, 2);
	    System.out.println("price is : "+b.costProduct());
	}

}
