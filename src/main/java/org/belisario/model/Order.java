package org.belisario.model;

import java.util.List;

public class Order {

    private Long id;

    private Client client;

    private List<Item> items;

    public Order() {
    }

    public Order(Long id, Client client, List<Item> items) {
        this.id = id;
        this.client = client;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
