package sjcet.s3.demo;

abstract class Animals{
	protected int legs;
	protected Animals(int legs) {
		this.legs =legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");
	}
}
class Spider extends Animals{
	public Spider(){
		super(8);//All spiders have eight legs
	}
	@Override
	public void eat() {
		System.out.println("The Spider is eating");
	}
}
interface Pet{
	String getName();
	void setName(String name);
	void play();
}
class Cats extends Animals implements Pet{
	private String name;
	public Cats(String name) {
		super(4);// All cats have four legs
		this.name =name;
		
	}
	Cats(){
		this("");
	}
	@Override
	public void eat() {
		System.out.println("The cat is eating");
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
		
	}
	public void play() {
		System.out.println("The Cat is playing");
	}
}
class Fish extends Animals implements Pet{
	String name;
	public Fish() {
		super(0); //Fish don't have legs
		
	}
	
	public void eat() {
		System.out.println("The fish eat plants");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
		
	}
	public void play() {
		System.out.println("The fish is playing");
	}
	public void walk() {
		System.out.println("Fish has no legs");
	}
	
}
public class TestAnimals {
	public static void main(String [] args) {
		Fish fish = new Fish();
		System.out.println("FISH");
		fish.setName("Mimi");
		System.out.println("This fish's name is "+ fish.getName());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("This fish's name is "+ fish.getName());
		
	}	
	

}
