package lab_03;

public class Link {
	public String name;
	public double average;
	public Link next;

	
	public Link(String name, double average) {
		this.name = name;
		this.average = average;
		next = null;
	}
	
	public void displayDetails() {
		System.out.println(name + " " + average );
		
	}
	
	

}
