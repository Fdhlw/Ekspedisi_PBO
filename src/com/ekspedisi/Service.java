package com.ekspedisi;

abstract class Service implements Delivery {
    protected String serviceName;
    protected String tagline;
    protected String address;
    protected double distance;
    protected double weight;
    protected double size;
    protected double price;
    protected int day;
    protected String estiminate;

    public Service(String serviceName, String tagline, String address, double distance, double weight, double size) {
        this.serviceName = serviceName;
        this.tagline = tagline;
        this.address = address;
        this.distance = distance;
        this.weight = weight;
        this.size = size;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    protected abstract String Estiminate();

    protected abstract double CalculatePrice();

    protected abstract String SendDate();

}
