public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (this.food >= n){
            this.food -= n;
            System.out.println("Из тарелки поели");
            return true;
        }
        else {
            System.out.println("Не хватает еды");
            return false;
        }
    }

    public void info(){

        if (this.food == 0) {
            System.out.println("Тарелка пуста");
        }
        else {
            System.out.println("Осталось " + this.food + " еды");
        }
    }

    public void addFood(int n){
        this.food += n;
        System.out.println("Добавили " + n + " еды");
    }
}
