package Clinic;

/**
 * Created by Владимир on 26.11.2015.
 * Клас Animal реазилирует животного за интерфейсом Pet
 */
public class Animal implements Pet {

    /**
     *
     */
    public String name;

    /**
     *
     * @param name
     */
    public Animal(String name){
        this.name = name;
    }

    /**
     *
     */
    public void makeSound(){}

    /**
     *
     * @return
     */
    public String  getName(){
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

}

/**
 * Интерфейс Pet указывает необходимые методы для Animal
 */
interface Pet{
    void makeSound();
    String getName();
    void setName(String name);
}
