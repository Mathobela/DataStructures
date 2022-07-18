import java.util.Arrays;

public class ArrayList {
    private Object[] normalArray = new Object[10];
    private int numOfObjects;

    //add a new object to the array, increases the size of the array if it is full
    public void add(Object obj) {
        if(numOfObjects == normalArray.length) {
            //If initial array is full, make a new array which consists of initial array contents and increase its size by 3
            //Increased array size by three (1)for adding obj, and (2) for creating an extra spaces which will be used each time we want to add new objects
            normalArray = Arrays.copyOf(normalArray, normalArray.length + 3);
        }
        //add new obj to end of array
        normalArray[numOfObjects] = obj;
        //point to the next "empty space" in the array, this is where the next obj will be added if needed
        numOfObjects++;
    }

    //returns the number of elements in the array
    public int size() {
        return numOfObjects;
    }

    //returns the element of the normalArray at index 'index', if the index is not within the array, throws arrayIndexOutOfBounds
    public Object get(int index) {
        //check if index is within the array
        if(index >= numOfObjects || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return normalArray[index];
    }
}
