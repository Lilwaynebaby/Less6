package Clinic;


/**
 * Created by Владимир on 26.11.2015.
 * Класс реализирует клинику
 */
public class Clinic {
    public Client[] clients;
    /**
     * @param numClients отвечает за количиство пациентов в клинике
     */
    public int numClients = 0;

    /**
     * @param inList проверка есть ли пациент в клинике
     */
    boolean inList = false;

    /**
     * Конструктор слиники
     * @param size количиство клиентов в клинике
     */
    public Clinic(int size){
        this.clients = new Client[size];
    }

    /**
     * Метод добавления клиента в клинику
     * @params  clientName - Имя клиента petName - имя питомца petKind - вид животного
     */
    public void addClient(String clientName ,String petName, String petKind) {
        switch (petKind) {
            case "dog":
                this.clients[numClients] = new Client(clientName, new Dog(new Animal(petName)));
                break;
            case "cat":
                this.clients[numClients] = new Client(clientName, new Cat(new Animal(petName)));
                break;
            default:
                System.out.println("Sorry we do not accept such animals");

        }
        numClients++;
    }

    /**
     * Метод удаления клиента из клиники
     * @param listPosition -  позиция за которой нужно удалять клиента
     */
    public void deletePatient(int listPosition){
        this.clients[listPosition] = null;
        for(int i=listPosition; i<numClients;i++){
            if(i==numClients-1)
                clients[i] = null;
            else
                clients[i] = clients[i+1];
        }
        numClients--;

    }

    /**
     * Метод для изминения имени животного или владельца в клинике
     * @param kindRename - вид изминения - животного или клиента
     * @param name - ввод нового имени
     * @param listPosition - поциия за которой нужно изменить им'я
     */
    public void rename(String kindRename ,String name, int listPosition){
        switch (kindRename){
            case "1":
                if(name.equals(this.clients[listPosition].getName()))
                    System.out.println("This name used");
                else {
                    this.clients[listPosition].setName(name);
                    System.out.println("done!");
                }
                break;
            case "2":
                if(name.equals(this.clients[listPosition].getNamePet()))
                    System.out.println("This name used");
                else{
                    this.clients[listPosition].setNamePet(name);
                    System.out.println("done");
                }
                break;
            case "3":
                System.out.println("back to menu");
                break;

        }
    }

    /**
     * Метод для поиска в списке клиники
     * @param name - имя для поиска
     * @param kindSearch - вид поиска - по имени животного или владельца
     */
    public void search(String name , String kindSearch){
        switch(kindSearch){
            case "1":
                for(int i=0;i<numClients;i++){
                    if(name.equals(this.clients[i].id)){
                        inList = true;
                        break;
                    }
                }
                if(inList)
                    System.out.println("owner in the List");
                else
                    System.out.println("the owner is not listed");
                break;
            case "2":
                for(int i=0;i<numClients;i++){
                    if(name.equals(this.clients[i].getNamePet())){
                        inList = true;
                        break;
                    }
                }
                if(inList)
                    System.out.println("animal in the List");
                else
                    System.out.println("the animal is not listed");
                break;
            case "3":
                inList =false;
                break;
        }
    }

    /**
     * Метод для отображения списка пациентов клиники
     */
    public void Show(){
            for (int i = 0; i < numClients; i++) {
                System.out.print(i);
                System.out.print("  " + clients[i].getName());
                System.out.println("  " + clients[i].getNamePet());
            }
    }

    /**
     * Отображение головного меню
     */
    public void forInput(){
        System.out.println("you want to do?");
        System.out.println("1 - input new patient");
        System.out.println("2 - rename patient name or name Pet");
        System.out.println("3 - search for patients name or name Pet");
        System.out.println("4 - delete patient from clinic");
        System.out.println("5 - show clinic List");
        System.out.println("6 - exit");
}

    /**
     *  Отображение подменю Изменения имени владельца или его животного
     */
    public void forRename(){
        System.out.println("1 - rename name owner");
        System.out.println("2 - rename name Pet");
        System.out.println("3 - back to menu");
    }

    /**
     * Отображение подменю Поиск по имени питомца или же владельца
     */
    public void forSearch(){
        System.out.println("1 - search for name owner");
        System.out.println("2 - search for name Pet");
        System.out.println("3 - back to menu");
    }

}
