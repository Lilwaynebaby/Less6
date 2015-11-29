package Clinic;

/**
 * Created by Владимир on 26.11.2015.
 * Класс Клиент реализирует клиента клиники
 */
public class Client{
    /**
     *@param id - имя клиента
     */
    public String id;

    /**
     *@param pet  - обьект животного
     */
    public Pet pet;

    /**
     * Конструктор Клиента
     * @param id - принимает имя клиента
     * @param pet - принимает обьект животного
     */
    public Client(String id ,Pet pet){
        this.pet = pet;
        this.id = id;
    }

    /**
     * Метод set  устанавливает имя клиента
     * @param name - принимает имя клиента
     */
    public void setName(String name){

        this.id = name;
    }

    /**
     * Метод get возвращает имя клиента
     * @return id  - возвращает имя клиента
     */
    public String getName(){
        return id;
    }

    /**
     * Метод Реализирует голос животного
     */
    public void makeSound(){
        this.pet.makeSound();
    }

    /**
     *  Метод set устанавливает имя питомца
     * @param name - имя питомца
     */
    public void setNamePet(String name){

        this.pet.setName(name);
    }

    /**
     * Метод get возвращает имя животного
     * @return возвращает имя питомца
     */
    public String getNamePet(){

        return this.pet.getName();
    }

}
