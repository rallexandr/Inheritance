public class Employee extends Person {
        public double salary;
        public String jobTitle;

    public Employee(String firstName, String lastName, int age, double salary, String jobTitle) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getAsString() {
        return super.getAsString() +
                "\nsalary: " + salary +
                "\njob title: " + jobTitle;
    }
}

