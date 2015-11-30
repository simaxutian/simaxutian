package Lesson3;

import java.util.Scanner;

public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private Boolean powerOn=true;
	private int channel=12;
	private int volume=24;
	
	Television(String MANUFACTURER,int SCREEN_SIZE,Boolean powerOn,int channel,int volume)
	{
		this.MANUFACTURER=MANUFACTURER;
		this.SCREEN_SIZE=SCREEN_SIZE;
		this.powerOn=powerOn;
		this.channel=channel;
		this.volume=volume;
	}
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}
	
	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}
	
	public Boolean getPowerOn() {
		return powerOn;
	}
	public void setPowerOn(Boolean powerOn) {
		this.powerOn = powerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	 Television(String brand,int size)
	{
		 MANUFACTURER=brand;
		 SCREEN_SIZE=size;
	}
	
	public void power()
	{
		 powerOn=!powerOn;
	}
	public void increaseVolume()
	{
		this.volume++;
	}
	public void decreaseVolume()
	{
		this.volume--;
	}
	
	public static void main(String[] args) {
		Television TV = new Television("APPLE",24);
		System.out.println("TV brand is "+TV.getMANUFACTURER()+" size is "+TV.getSCREEN_SIZE()+" power is "+(TV.powerOn?"On":"Off"));
		System.out.println("turn to channel 13 ");
		TV.setChannel(13);
		System.out.println("channel is :"+TV.getChannel());
		System.out.println("now the volume is : "+TV.getVolume()+" increasevolume please ");
		TV.increaseVolume();
		System.out.println("now the volume is :"+TV.getVolume());
	}

}
