package GuiTests.array_implementation;

import java.util.Arrays;

public class Array {
    public int size;
    public int[] data;

    public Array() {
        this.size = 0;
        this.data = new int[0];
    }

    public void add(int element) {
        // if (size >= data.length) {
        //     int[] temp = new int[size + 1];
        //     System.arraycopy(data, 0, temp, 0, size);
        //     data = temp;
        // }

        // a better way
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = element;
        size = data.length;
    }

    public int getSize() {
        return size;
    }

    public int[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Array [size=" + size + ", data=" + Arrays.toString(data) + "]";
    }

}
