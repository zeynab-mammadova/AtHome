package algorithms.sorting;

public class BubleSorting {

    int[] array = new int[50];
    int arraySize = 10;

    public void createArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (array[j + 1] < array[j]) {    //it is for ascending order
                                                  // if we want to make sorting in descending orden
                    swap(j, j + 1);     // we should just change  "<" to the ">"
                }
            }

        }
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;

    }

    public void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " |");
        }
    }

    public static void main(String[] args) {
        BubleSorting newSort = new BubleSorting();
        newSort.createArray();
        newSort.printArray();
        System.out.println();
        newSort.bubbleSort();
        newSort.printArray();
    }
}
