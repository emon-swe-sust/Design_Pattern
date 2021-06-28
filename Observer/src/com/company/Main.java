package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NotificationSystem system = new NotificationSystem();

        Client c1 = new Client();
        Admin a1 = new Admin();

        system.register(c1);
        system.register(a1);

        system.sendNotification();
    }
}
