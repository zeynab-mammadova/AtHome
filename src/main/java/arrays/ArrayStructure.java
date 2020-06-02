package arrays;

public class ArrayStructure {
    int[] array = new int[50];
    int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 21) - 10;

        }
    }

    public void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + " | ");
            System.out.println(array[i]);
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) return array[index];
        return 0;
    }

    public boolean containsValue(int searchValue) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = 0; i < (arraySize - 1); i++) {
                array[i] = array[i + 1];
            }
            arraySize--;
        }
    }

    public void addValue(int value) {
        if (arraySize < 50) {
            array[arraySize]=value;
            arraySize++;
        }
    }

    public void linearSearch(int value){
        boolean valueIn=false;
        String indexsWithValue=" ";
        System.out.println("Was found in indexs ");
        for (int i = 0; i < arraySize; i++) {
            if (array[i]==value){
                valueIn=true;
                System.out.print(i+" ");
            }
        }
        if (!valueIn){
            System.out.print("None");
        }
    }
    public static void main(String[] args) {
        ArrayStructure newArray = new ArrayStructure();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(4));
        System.out.println(newArray.containsValue(4));
        newArray.deleteIndex(4);
        System.out.println();
        newArray.printArray();
        newArray.addValue(3);
        System.out.println();
        newArray.printArray();
        newArray.linearSearch(4);
    }
}