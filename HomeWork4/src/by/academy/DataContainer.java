package by.academy;

import java.util.Arrays;
import java.util.Comparator;

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


    public static <E> void sort(DataContainer<E> item, Comparator<E> comparator) {
        for (int i = item.data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(item.data[j], item.data[j + 1]) > 0) {
                    E temp = item.data[j];
                    item.data[j] = item.data[j + 1];
                    item.data[j + 1] = temp;
                }
            }
        }
    }

    public void delete(int index) {
        for (int i = 0; i < this.data.length; i++) {
            if (i == index) {
                for (int j = index; j < this.data.length - 1; j++) {
                    E temp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = temp;
                }
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
    }

    public void delete(E item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].hashCode() == item.hashCode()) {
                for (int j = i; j < this.data.length - 1; j++) {
                    E temp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = temp;
                }
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
    }



}
