public class Cat {
    private String name;
    private int appitite;
    private boolean satiety = false;

    public Cat(String name, int appitite) {
        this.name = name;
        this.appitite = appitite;

    }

    public void eat (Plate plate){
        this.satiety = plate.decreaseFood(this.appitite);
    }

    public void info() {
        if (satiety) {
            System.out.println("Кот по имени " + name + " сыт");
        }
        else {
            System.out.println("Кот по имени " + name + " голоден");
        }
    }

    public boolean isSatiete() {
        return this.satiety;
    }
}
