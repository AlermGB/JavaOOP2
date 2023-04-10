public class Whild extends Animal{
    public Whild(int age, LifeStatus lifeStatus, int hungerLevel, int emotionLevel) {
        super(age, lifeStatus, hungerLevel, emotionLevel);
    }

    public Whild(int age) {
        this(age, LifeStatus.ALIVE, 5, 2);
    }
}
