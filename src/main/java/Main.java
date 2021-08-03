import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John",25);
        Gson g = new Gson();
        String json = g.toJson(e);

        System.out.println("");
        System.out.println(json);
    }

    public static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
