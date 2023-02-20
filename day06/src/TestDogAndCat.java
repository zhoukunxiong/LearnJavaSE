public class TestDogAndCat {
    public static void main(String[] args) {
        Cat cat = new Cat("花色", "波斯猫");
        Dog dog = new Dog("黑色", "藏獒");

        System.out.print(cat.getColor() + "的" + cat.getBreed() + "正在");
        cat.eat();
        System.out.print(cat.getColor() + "的" + cat.getBreed() + "正在");
        cat.catchMouse();
        System.out.print(dog.getColor() + "的" + dog.getBreed() + "正在");
        dog.eat();
        System.out.print(dog.getColor() + "的" + dog.getBreed() + "正在");
        dog.lookHome();
    }
}
