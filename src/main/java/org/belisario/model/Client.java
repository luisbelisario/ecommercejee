package org.belisario.model;

import java.util.List;

public class Client {

    private Long id;

    private String email;

    private String password;

    private String name;

    private String cpf;

    private List<Order> orders;

    public Client() {

    }

    public Client(Long id, String email, String password, String name, String cpf) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                "\n email: '" + email +'\'' +
                "\n name: '" + name +'\'' +
                "\n cpf: '" + cpf +'\'' +
                '}';
    }
}
