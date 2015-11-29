package Clinic;

/**
 * Created by Владимир on 26.11.2015.
 * Класс Dog реализирует питомца Собаку
 */
public class Dog implements Pet {

    /**
     * Обьект animal
     */
    public Animal animal;

    /**
     * Конструктор Dog
     * @param animal - обьект animal
     */
    public Dog( Animal animal){
        this.animal = animal;
    }

    /**
     * Обьект собака издает звуки
     */
    public void makeSound(){
        System.out.println("Gav-Gav");
    }

    /**
     *
     * @return name - имя животного
     */
    public String getName(){
        return this.animal.getName();
    }

    /**
     *
     * @param name - устанавливает имя животного
     */
    public void setName(String name){
        this.animal.setName(name);
    }

}
