package Lession_3;

public class L3_E1 {
    public static class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name,String position,String email,String phone, int salary, int age ){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public  void employeeInfo(){
            System.out.println(name);
            System.out.println(position);
            System.out.println(email);
            System.out.println(phone);
            System.out.println(salary);
            System.out.println(age);

        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public int getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }
    }
}


