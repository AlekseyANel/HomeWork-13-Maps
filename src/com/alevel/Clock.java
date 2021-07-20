package com.alevel;

public class Clock implements Comparable {
    private Integer model;
    private String brand;

    public Clock(Integer model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    public Integer getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }

    /*@Override
    public int compareTo(Clock other) {
        return (this.model.compareTo(other.model));
    }*/

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int compareTo(Object obj){
    Clock entry = (Clock) obj;
    int result = brand.compareTo(entry.brand);
    if(result != 0)
        return result;

    result = model - entry.model;
    if(result != 0)
        return (int) result / Math.abs( result );

    return 0;
}
}