import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк первой матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        int columns = scanner.nextInt();
        Matrix firstMatrix = new Matrix(rows, columns);
        System.out.println("Заполните первую матрицу");
        firstMatrix.fillNumbers();
        System.out.println("Вы ввели матрицу");
        firstMatrix.display();

        System.out.print("Введите количество строк второй матрицы: ");
        rows = scanner.nextInt();
        System.out.print("Введите количество столбцов второй матрицы: ");
        columns = scanner.nextInt();
        Matrix secondMatrix = new Matrix(rows, columns);
        System.out.println("Заполните вторую матрицу");
        secondMatrix.fillNumbers();
        System.out.println("Вы ввели матрицу");
        secondMatrix.display();

        Matrix.add(firstMatrix,secondMatrix);

        Matrix.multiply(firstMatrix,secondMatrix);

        System.out.println("Введите число, на которое умножить первую матрицу");
        float multiplyNumber = scanner.nextFloat();
        System.out.println("Результат умножения первой матрицы на число " + multiplyNumber + " :");
        Matrix thirdMatrix = firstMatrix.multiplyByNumber(multiplyNumber);
        thirdMatrix.display();

    }
}