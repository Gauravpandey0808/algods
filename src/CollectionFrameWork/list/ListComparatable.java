package CollectionFrameWork.list;

import java.util.Comparator;

public class ListComparatable implements Comparator<Integer> {

    @Override
    public int compare(Integer e1, Integer e2) {
        return e2 - e1;
    }
}
