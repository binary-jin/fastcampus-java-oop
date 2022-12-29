package com.fastcampus.fastcampusjavaoop;

import com.fastcampus.fastcampusjavaoop.logic.BubbleSort;
import com.fastcampus.fastcampusjavaoop.logic.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));

    }
}
