public class Main {

    public static void main(String[] args) {
        doWork();
    }
        private static void doWork() {
        Employee john = new Employee("John", "Doe", 33, 20000, "Automation QA");
        Employee jane = new Employee("Jane", "Doe", 33, 15000, "Manual QA");

            System.out.println("Employee: \n" + john.getAsString().toUpperCase());
            System.out.println("\n");
            jane.printMe();
        }
    }

