package about;

public class About {
	public static void main(String[] args) {
		Student dinar = new Student("Dinar", "Shagaliev", 18, "11-904", 1);
		dinar.setMoreInfo("I like to write beautiful code. I study Java and love it)\n" +
				"Привет меня зовут Динар Шагалиев! Я из Татарстана и я очень люблю программирование)");
		dinar.printAllInfo();
	}
}

class Student {
	private String name;
	private String lastName;
	private int age;
	private String group;
	private int course;
	private String moreInfo;

	public Student(String name, String lastName, int age, String group, int course) {
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.group = group;
		this.course = course;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return String.format("Hello! My name is %s, last name - %s and I'm %d. I study in group number %s on %d.",
				this.name, this.lastName, this.age, this.group, this.course);
	}

	public void printAllInfo() {
		System.out.println(toString() + " " + this.moreInfo);
	}
}