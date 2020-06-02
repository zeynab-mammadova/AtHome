package youtube;

public class ArrayExample {

    int arraysize = 10;
    int[] array = new int[arraysize];

    public void generateArray() {
        for (int i = 0; i < arraysize; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
        }
    }

    public void printArray() {
        for (int i = 0; i < arraysize; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void linearSearch(int value) {
        boolean inArray = false;
        for (int i = 0; i < arraysize; i++) {
            if (array[i] == value) {
                inArray = true;
                System.out.println("Value is in array in the " + i + "th index");
            }
        }
        if (!inArray) {
            System.out.println("Value isn't at array");
        }
    }

    public void deleteIndex(int index){
        if(index<arraysize){
            for (int i = 0; i <arraysize-1 ; i++) {
                array[i]=array[i+1];
            }
            arraysize--;
        }
    }

    public void addValue(int value) {
        if (arraysize < 50) {
            array[arraysize]=value;
            arraysize++;
        }
    }

    public void searchByIndex(int index){
        if (index<arraysize){
            System.out.println(array[index]);
            }
        }


    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.generateArray();
        arrayExample.printArray();
        arrayExample.linearSearch(-4);
        arrayExample.deleteIndex(3);
        arrayExample.printArray();
        System.out.println();
        arrayExample.addValue(12);
        arrayExample.printArray();
        System.out.println();
        arrayExample.searchByIndex(3);

    }
}
