package ru.java3.lesson1.task3;

public class Apple  extends Fruit{
    public Apple() {
        super.weight = 1.0f;
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }
}
