
public class BuilderPattern {
	int id;
	String name;
	String designation;
	double salary;

	static class Builder {
		int id;
		String name;
		String designation;
		double salary;

		public int getId() {
			return id;
		}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public String getDesignation() {
			return designation;
		}

		public Builder setDesignation(String designation) {
			this.designation = designation;
			return this;
		}

		public double getSalary() {
			return salary;
		}

		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public BuilderPattern build() {
			BuilderPattern bp = new BuilderPattern(this);
			return bp;
		}

	}

	public BuilderPattern(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.designation = builder.designation;
		this.salary = builder.salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		BuilderPattern b = new BuilderPattern.Builder().setId(1).setDesignation("SSE").setName("shanky").setSalary(2500000).build();
		System.out.print(b.getName());
	}

}
