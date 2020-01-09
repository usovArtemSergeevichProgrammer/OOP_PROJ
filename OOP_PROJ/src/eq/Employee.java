package eq;

public class Employee {

	private int age;
	private String name;
	private String lastName;
	private Company company;
	private String jobPosition;
	private double salary;
	private long UID;
	
	public Employee(int age, String name, String lastName, Company company, String jobPosition, double salary,
			long uID) {
		super();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.company = company;
		this.jobPosition = jobPosition;
		this.salary = salary;
		UID = uID;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getUID() {
		return UID;
	}
	public void setUID(long uID) {
		UID = uID;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", lastName=" + lastName + ", company=" + company
				+ ", jobPosition=" + jobPosition + ", salary=" + salary + ", UID=" + UID + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (UID ^ (UID >>> 32));
		result = prime * result + age;
		//result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((jobPosition == null) ? 0 : jobPosition.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (UID != other.UID)
			return false;
		if (age != other.age)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (jobPosition == null) {
			if (other.jobPosition != null)
				return false;
		} else if (!jobPosition.equals(other.jobPosition))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
}
