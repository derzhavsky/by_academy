package by.academy;

import java.util.Arrays;

public class DataContainer<E> {
    private E[] data;

    public DataContainer(E[] data) {
        this.data = data;
    }

    public void add(E item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return;
            }
        }
        ///
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
    }


    public E[] getData() {
        return data;
    }

    public void delete(int index) {
//        System.arraycopy(this.data, index + 1, this.data, index, this.data.length - 1 - index);
   }

    public void delete(E item) {

    }

}
