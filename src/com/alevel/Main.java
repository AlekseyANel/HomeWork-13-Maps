package com.alevel;

import com.blevel.linckedlist.Clocks;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Clock clock = new Clock ();

        HashMap<Integer, Clock> clock = new HashMap<>();

        clock.put(3, new Clock(10023, "Hermle"));
        clock.put(2, new Clock(30045, "Sars"));
        clock.put(1, new Clock(6078, "HowardMiller"));
        clock.put(4, new Clock(6078, "Mado"));
        //Печать хэшмапы до сортировки
        for (Map.Entry<Integer, Clock> entry : clock.entrySet()) {
            System.out.println("KEY =  " + entry.getKey() +
                    "; Value.MODEL = " + entry.getValue().getModel()+ "; Value.BRAND = " + entry.getValue().getBrand());}


            System.out.println("Сортировка с TreeMaps");
            //Перегоняем HashMap объект clock в тримапу и она сама (спомощью compareTo()
            // сортирует элементы
            TreeMap<Integer, Clock> sorted = new TreeMap<>();
            sorted.putAll(clock);

            for (Map.Entry<Integer, Clock> entr : sorted.entrySet()) {
                System.out.println(entr.getKey() + "=" + entr.getValue().getBrand());
            }


            System.out.println("Сортировка с ArrayList по ключам");
            //Сначала извлечем ключи в список mapKeys, отсортируем и выведем
            List<Integer> mapKeys = new ArrayList<>(clock.keySet());
            Collections.sort(mapKeys);
            for (int j = 0; j < mapKeys.size(); j++) {
                System.out.println("Element " + j + ": "
                        + mapKeys.get(j) + "="
                        + clock.get(mapKeys.get(j)).getModel() + "-"
                        + clock.get(mapKeys.get(j)).getBrand());
            }

            System.out.println("Сортировка с ArrayList по значениям");
            //Сначала извлечем ключи в список mapKeys, отсортируем и выведем
            List<Clock> mapValues = new ArrayList<>(clock.values());
            Collections.sort(mapValues);
            for (int j = 0; j < mapValues.size(); j++) {
                System.out.println("Element " + j + ": " + mapValues.get(j).getModel() + "-" + mapValues.get(j).getBrand());
            }
        }
    }


