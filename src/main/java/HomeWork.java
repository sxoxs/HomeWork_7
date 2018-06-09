public class HomeWork {


    public void showWork(){
       logikWork();
    }

    private void logikWork() {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat("Кот " + i, 7 + i);
        }
        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
            while(!cat.isSatiete()) {
                plate.addFood(2);
                plate.info();
                cat.eat(plate);
            }
            plate.info();
        }
    }


}
