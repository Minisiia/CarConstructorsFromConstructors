package car;

public class Main {
    public static void main(String[] args) {
        Car carConDefault = new Car();
        Car carConWith1Param = new Car(1999);
        Car carConWith2Param = new Car(1999,250);
        Car carConWith3Param = new Car(1999,250,1000);
        Car carConWithAllParam = new Car(1999,250,1000, "red");

        System.out.println("Машина без параметрів: рік - " + carConDefault.getYear() +
                ", швидкість - "+ carConDefault.getSpeed() +
                ", вага - " + carConDefault.getWeight()+
                ", колір - " + carConDefault.getColor());
        System.out.println("Машина з одним параметром: рік - " + carConWith1Param.getYear() +
                ", швидкість - "+ carConWith1Param.getSpeed() +
                ", вага - " + carConWith1Param.getWeight()+
                ", колір - " + carConWith1Param.getColor());
        System.out.println("Машина з двома параметрами: рік - " + carConWith2Param.getYear() +
                ", швидкість - "+ carConWith2Param.getSpeed() +
                ", вага - " + carConWith2Param.getWeight()+
                ", колір - " + carConWith2Param.getColor());
        System.out.println("Машина з трьома параметрами: рік - " + carConWith3Param.getYear() +
                ", швидкість - "+ carConWith3Param.getSpeed() +
                ", вага - " + carConWith3Param.getWeight()+
                ", колір - " + carConWith3Param.getColor());
        System.out.println("Машина з усіма параметрами: рік - " + carConWithAllParam.getYear() +
                ", швидкість - "+ carConWithAllParam.getSpeed() +
                ", вага - " + carConWithAllParam.getWeight()+
                ", колір - " + carConWithAllParam.getColor());

    }
}
