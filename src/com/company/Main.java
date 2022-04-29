package com.company;

public class Main {

    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        int seria = samochod.getSeriaSilnika();
        System.out.println("Nazwa silnika to: " + " " + seria);
    }
}

class Silnik{
    private int seria;

    public void setSeria(int seria){
        this.seria = seria;
    }
    public int getSeria(){
        return seria;
    }
}

class Samochod {
    private Silnik silnik;

    public Samochod(){
        this.silnik = new Silnik();
        silnik.setSeria(1234);
    }

    public int getSeriaSilnika(){
        return silnik.getSeria();
    }
}