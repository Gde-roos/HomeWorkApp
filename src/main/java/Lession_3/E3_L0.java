package Lession_3;

public class E3_L0 {
    public static void main(String[] args) {
        L3_E1.Employee[] empoyeeArr = new L3_E1.Employee[5];
        empoyeeArr[0]= new L3_E1.Employee("Vasya", "dvornik", "vasya@email.com", "+987654321", 50000, 36);
        empoyeeArr[1]= new L3_E1.Employee("Petr", "IT", "petr@email.com", "+9871232154321", 50000, 42);
        empoyeeArr[2]= new L3_E1.Employee("Masha", "Kola", "Masha@email.com", "+9871232154321", 50000, 15);
        empoyeeArr[3]= new L3_E1.Employee("Ola", "K:L", "Ola@email.com", "+9871232154321", 50000, 60);
        empoyeeArr[4]= new L3_E1.Employee("Lala", "OP", "Lala@email.com", "+9871232154321", 50000, 40);


        for (int i = 0; i < 4; i++) {
            if (empoyeeArr[i].getAge() > 40) {
                System.out.println(
                        empoyeeArr[i].getName() + empoyeeArr[i].getPosition() + empoyeeArr[i].getEmail() + empoyeeArr[i].getPhone() + empoyeeArr[i].getSalary() + empoyeeArr[i].getAge()

                );
            }
        }

    }
}
