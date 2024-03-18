package common;

import java.util.Comparator;

public class SortNum implements Comparable<SortNum> {

    public int index;
    private int value;

    public SortNum(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(SortNum o) {

        return this.value - o.value;
    }
}
