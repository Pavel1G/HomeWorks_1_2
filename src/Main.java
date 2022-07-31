public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /* Первое задание */
    public static void task1(){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;

        float f = 5.67f;
        double d = 8.9;

        char c = 'o';

        boolean bool = true;
    }

    /* Второе задание */
    public static void task2(){
        double weightFirstBoxer = 78.2;
        double weightSecondBoxer = 82.7;
        System.out.println("Общий вес двух бойцов - " + (weightFirstBoxer + weightSecondBoxer) + " кг.");
        System.out.println("Разница в весе - " + (weightSecondBoxer - weightFirstBoxer) + " кг.");
        System.out.println();
    }

    /* Третье задание */
    public static void task3(){
        int weightOneBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;

        double breakfast = (weightOneBanana * 5 + weightMilk * 2 + weightIceCream * 2 + weightEgg * 4) / 1000;
        System.out.println("Вес завтрака - " + breakfast + " кг.");
        System.out.println();
    }

    /* Четвертое задание */
    public static void task4(){
        int weightLoss = 7;
        double everyDayLoss250 = 0.25;
        double everyDayLoss500 = 0.5;

        double resultLoss250 = weightLoss / everyDayLoss250;
        double resultLoss500 = weightLoss / everyDayLoss500;

        double midResultLoss = (resultLoss500 + resultLoss250) / 2;

        System.out.println("Если худеть на 250 гр каждый день, то уйдет " + resultLoss250 + " дней до похудения.");
        System.out.println("Если худеть на 500 гр каждый день, то уйдет " + resultLoss500 + " дней до похудения.");
        System.out.println("В среднем уходит " + midResultLoss + " день на похудение.");
        System.out.println();
    }


        /* Пятое задание */
    public static void task5(){
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        double salaryMariaIndex = salaryMaria * 1.1;
        double salaryDenisIndex = salaryDenis * 1.1;
        double salaryKristinaIndex = salaryKristina * 1.1;

        System.out.println("Маша теперь получает " + (int) salaryMariaIndex + " рублей. Годовой доход вырос на " +
                (int) (salaryMariaIndex - salaryMaria) * 12 + " рублей.");

        System.out.println("Денис теперь получает " + (int) salaryDenisIndex + " рублей. Годовой доход вырос на " +
                (int) (salaryDenisIndex - salaryDenis) * 12 + " рублей.");

        System.out.println("Кристина теперь получает " + (int) salaryKristinaIndex + " рублей. Годовой доход вырос на " +
                (int) (salaryKristinaIndex - salaryKristina) * 12 + " рублей.");
    }
}