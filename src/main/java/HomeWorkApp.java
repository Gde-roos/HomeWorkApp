public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        compareNumbers();
        printColor();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = -10;
        int b = 2;
        int c = a + b;
        if (c>=0){
            System.out.println("Сумма положительная");
        }
        else if (c<0){
            System.out.println("Сумма отрицательная");
        }
        else {
            System.out.println("шо за такое?!");
        }
    }
    public static void printColor(){
        int value = 0;
        if (value <=0){
            System.out.println("Красный");
        }
        else if (value>0 && value<=100){
            System.out.println("Желтый");
        }
        else if (value>100){
            System.out.println("Зеленый");
        }
        else {
            System.out.println("шо за такое?!");
        }

    }
    public static void compareNumbers(){
        int a = 10;
        int b = 1;
        if (a>=b){
            System.out.println("a>=b");
        } else if (b>a) {
            System.out.println("b>a");

        }
    }
}
