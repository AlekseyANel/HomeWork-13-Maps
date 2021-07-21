package com.blevel.linckedlist;

public class Clocks implements Comparable<Clocks> {
    private String brand;

    public Clocks(String brand) {
         this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public int compareTo(Clocks other) {
        return (this.brand.compareTo(other.brand));
    }

 /*   @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

/*@Override
    public int compareTo(Object obj){
    Clocks entry = (Clocks) obj;
    int result = brand.compareTo(entry.brand);
    if(result != 0)
        return result;
    return 0;*/
}

