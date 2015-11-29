package Clinic;

/**
 * Created by �������� on 26.11.2015.
 * ����� Dog ����������� ������� ������
 */
public class Dog implements Pet {

    /**
     * ������ animal
     */
    public Animal animal;

    /**
     * ����������� Dog
     * @param animal - ������ animal
     */
    public Dog( Animal animal){
        this.animal = animal;
    }

    /**
     * ������ ������ ������ �����
     */
    public void makeSound(){
        System.out.println("Gav-Gav");
    }

    /**
     *
     * @return name - ��� ���������
     */
    public String getName(){
        return this.animal.getName();
    }

    /**
     *
     * @param name - ������������� ��� ���������
     */
    public void setName(String name){
        this.animal.setName(name);
    }

}
