package fr.polytech.polydiploma.utils;

public class BankAPI {
    private String url;

    public BankAPI(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public BankAPI() {
        this("localhost", "9090");
    }

}
