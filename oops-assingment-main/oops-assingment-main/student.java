package oops;

class studentdetails{
	private String name;
	private int rollNo;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks < 0) {
			System.out.println("Marks cannot be less than 0");
			this.marks = 0;
		}
		else if(marks > 100) {
			System.out.println("Marks cannot be greater than 100");
			this.marks = 100;
		}
		else {
			this.marks = marks;
		}
	}
	
}
public class student {

	public static void main(String[] args) {
		studentdetails s1 = new studentdetails();
		s1.setName("Vignesh");
		s1.setRollNo(172);
		s1.setMarks(98);
		System.out.println("Name : " +s1.getName());
		System.out.println("RollNo : " +s1.getRollNo());
		System.out.println("Marks : " +s1.getMarks());	
	}
}