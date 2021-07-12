package com.company;

public class Car {
    String car_name="BCD";
// ******************************************************
//    Constructor Overloading -: Same constructor name, but parameter different
//    public Car(String car_name){
//        this.car_name = car_name;
//    }
//
//    public Car(String car_name, int model_no){
//        this.car_name = car_name;
//    }
//*******************************************************
    public void car_break(){
        System.out.println("Press car break for Car "+car_name);
    }

    public void car_stearing(){
        System.out.println("Stearing");
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.car_break();
        c1.car_stearing();


//        Car c = new Car("ABD", 1);
//        c.car_break();
//        c.car_stearing();
//
//        Car c1 = new Car("EFD");
//        c1.car_break();
//        c1.car_stearing();


    }
}


