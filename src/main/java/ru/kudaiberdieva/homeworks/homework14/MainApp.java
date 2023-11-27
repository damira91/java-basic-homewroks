package ru.kudaiberdieva.homeworks.homework14;


public class MainApp {
    public static void sumArrayElements(String[][] matrix) throws AppArraySizeException, AppArrayDataException {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != 4 || matrix[i].length != 4) {
                throw new AppArraySizeException("Wrong array size");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Wrong data in cell: " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        System.out.println("Sum of array elements is: " + sum);

    }

    public static void main(String[] args) {
        String[][] myMatrix = {
                {"4", "2", "8", "9"},
                {"5", "7", "3", "1"},
                {"12", "10", "6", "4"},
                {"7", "23", "13", "17"}
        };
        try {
            sumArrayElements(myMatrix);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

}


