package com.blevel.linckedlist;

import java.util.*;

public class Mains {

    public static void main(String[] args) {

        LinkedList<Clocks> clocks = new LinkedList();//Инициализировали пустой LinkedList

        Clocks clock1 = new Clocks( "Hermle");
        Clocks clock2 = new Clocks( "Sars");
        Clocks clock3 = new Clocks("HowardMiller");
        Clocks clock4 = new Clocks("Mado");
        //Добавляем в LinkedList новый объекты

        clocks.add(clock2);
        clocks.add(clock3);

        clocks.addLast(clock4);
        clocks.addFirst(clock1);

        System.out.println("Печать до сортировки:");
        Iterator<Clocks> iterator = clocks.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().getBrand()+" | ");
        }

        Collections.sort(clocks);
        System.out.println("\nПечать после стандартной сортировки:");
        Iterator<Clocks> iterator2 = clocks.iterator();
        while (iterator2.hasNext()){
            System.out.print(iterator2.next().getBrand()+" | ");
        }

        Collections.sort(clocks, new Comparator<Clocks>() {
            @Override
            public int compare(Clocks o1, Clocks o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        System.out.println("\nПечать после нестандартной сортировки:");
        Iterator<Clocks> iterator3 = clocks.iterator();
        while (iterator3.hasNext()){
            System.out.print(iterator3.next().getBrand()+" | ");
        }


    }
}

