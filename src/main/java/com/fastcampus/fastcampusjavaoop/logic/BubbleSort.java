package com.fastcampus.fastcampusjavaoop.logic;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort (List<T> list){ //입력 리스트를 받아서 출력으로 정렬된 리스트를 보내줌
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
                if(output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}
