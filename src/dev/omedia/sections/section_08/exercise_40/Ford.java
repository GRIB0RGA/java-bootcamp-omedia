package dev.omedia.sections.section_08.exercise_40;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " ||| manufacturer = " + getClass().getSimpleName();
    }

    @Override
    public String accelerate() {
        return super.accelerate() + " ||| manufacturer = " + getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return super.brake() + " ||| manufacturer = " + getClass().getSimpleName();
    }
}