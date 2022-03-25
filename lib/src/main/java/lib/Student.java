package lib;

//import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	private float engMarks;
	private float mathMarks;
	private float sciMarks;
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(engMarks, mathMarks, name, roll, sciMarks);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Float.floatToIntBits(engMarks) == Float.floatToIntBits(other.engMarks)
//				&& Float.floatToIntBits(mathMarks) == Float.floatToIntBits(other.mathMarks)
//				&& Objects.equals(name, other.name) && roll == other.roll
//				&& Float.floatToIntBits(sciMarks) == Float.floatToIntBits(other.sciMarks);
//	}
	
	public float TotalMarks() {
		return engMarks+mathMarks+sciMarks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", engMarks=" + engMarks + ", mathMarks=" + mathMarks
				+ ", sciMarks=" + sciMarks + ", TotalMarks=" + TotalMarks() + ", AvgMarks=" + AvgMarks() + "]";
	}

	
	public float AvgMarks() {
		return engMarks+mathMarks+sciMarks;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(float engMarks) {
		this.engMarks = engMarks;
	}
	public float getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(float mathMarks) {
		this.mathMarks = mathMarks;
	}
	public float getSciMarks() {
		return sciMarks;
	}
	public void setSciMarks(float sciMarks) {
		this.sciMarks = sciMarks;
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.setEngMarks(60);
		s.setMathMarks(60);
		s.setSciMarks(60);
		s.setRoll(1001);
		s.setName("Khabib");
		System.out.println(s.toString());
		
	}
	
}
