package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (int k : source) {
            if (k > treshold) {
                logger.log("Элемент " + k + " проходит");
                count++;
                result.add(k);
            } else {
                logger.log("Элемент " + k + " не проходит");
            }
        }

        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        return result;
    }
}
