package com.sda.recapVehicle;

import java.util.ArrayList;
import java.util.List;

public class ClientManager {

    private List<Person> clients = new ArrayList<>();

    public ClientManager() {
        addKnownClients();
    }

    private void addKnownClients() {
        clients.add(new Person("Daniel xxx", "Stoica", "09.02.1977"));
        clients.add(new Person("Daniel", "Stoica", "09.02.1977"));
        clients.add(new Person("Razvan xxx", "Balkan", "12.05.1983"));
        clients.add(new Person("Razvan", "Balkan", "12.05.1983"));
        clients.add(new Person("Adrian xxx", "Avian", "22.07.1999"));
        clients.add(new Person("Adrian", "Avian", "22.07.1999"));

    }

    public void addClient() {
        clients.add(new Person());
        printClients();
    }

    public Person getClient(int index) {
        return clients.get(index);
    }

    public void printClients() {
        int index = 1;
        for (Person person : clients) {
            System.out.println(index + ". " + person.getFirstName() + " - " + person.getLastName() + " - "
                    + person.getDateOfBirth());
            index++;
        }

    }


}
