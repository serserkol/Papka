public class CalculatorDemo {
    public static void main(String[] args) {
        // Создание экземпляров калькуляторов
        Calculator<Integer> intCalc = new IntegerCalculator();
        Calculator<Double> doubleCalc = new DoubleCalculator();

        // Примеры расчетов с целыми числами
        System.out.println("Integer Calculations:");
        System.out.println("5 + 3 = " + intCalc.add(5, 3));
        System.out.println("5 - 3 = " + intCalc.sub(5, 3));
        System.out.println("5 * 3 = " + intCalc.multi(5, 3));
        System.out.println("5 / 3 = " + intCalc.div(5, 3));

        // Примеры расчетов с числами с плавающей точкой
        System.out.println("\nDouble Calculations:");
        System.out.println("5.0 + 3.0 = " + doubleCalc.add(5.0, 3.0));
        System.out.println("5.0 - 3.0 = " + doubleCalc.sub(5.0, 3.0));
        System.out.println("5.0 * 3.0 = " + doubleCalc.multi(5.0, 3.0));
        System.out.println("5.0 / 3.0 = " + doubleCalc.div(5.0, 3.0));
    }
}
