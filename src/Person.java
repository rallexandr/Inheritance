public class Person {
        public String firstName;
        public String lastName;
        public int age;

        //создаем конструктор класса. Метод, который запускается только в момент создания экземпляра класса
        public Person(String firstName, String lastName, int age) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
        }

        public String getAsString(){
                return "first name: " +firstName +
                        "\nlast name: " + lastName +
                        "\nage " + age;
         }

         public void printMe(){
                System.out.println(getAsString());
         }
}

