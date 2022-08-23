import java.util.Scanner;

class Matrix {
    float[][] array;
    int rows;
    int columns;

    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        array = new float[rows][columns];
    }

    void fillNumbers(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.printf("Введите число в %s строке %s столбца",i+1,j+1);
                array[i][j] = scanner.nextFloat();
            }
        }
    }

    void display(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.printf("%10s ", this.array[i][j]);
            }
            System.out.print("\n");
        }
    }

    static void add(Matrix firstMatrix, Matrix secondMatrix){
        if(firstMatrix.rows != secondMatrix.rows || firstMatrix.columns != secondMatrix.columns){
            System.out.println("Матрицы разной размерности сложить нельзя!");
        }
        else {
            Matrix resultMatrix = new Matrix(firstMatrix.rows, firstMatrix.columns);
            for(int i = 0; i < firstMatrix.rows; i++){
                for (int j = 0; j < firstMatrix.columns; j++){
                    resultMatrix.array[i][j] = firstMatrix.array[i][j] + secondMatrix.array[i][j];
                }
            }
            System.out.println("Результат сложения первой и второй матрицы: ");
            resultMatrix.display();
        }
    }

    static void multiply(Matrix firstMatrix, Matrix secondMatrix){
        if(firstMatrix.columns != secondMatrix.rows){
            System.out.println("Умножение данных матриц невозможно! Необходимо, чтобы число столбцов первой матрицы было равно числу строк второй матрицы.");
        }
        else {
            Matrix resultMatrix = new Matrix(firstMatrix.rows, secondMatrix.columns);
            for (int i = 0; i < firstMatrix.rows; i++){
                for(int j = 0; j < secondMatrix.columns; j++){
                    float element = 0;
                    for (int k = 0; k < firstMatrix.columns; k++){
                        element += firstMatrix.array[i][k] * secondMatrix.array[k][j];
                    }
                    resultMatrix.array[i][j] = element;
                }
            }
            System.out.println("Результат умножения первой и второй матрицы: ");
            resultMatrix.display();
        }
    }

    Matrix multiplyByNumber(float number){
        Matrix resultMatrix = new Matrix(rows,columns);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                resultMatrix.array[i][j] = array[i][j] * number;
            }
        }
        return resultMatrix;
    }






}
