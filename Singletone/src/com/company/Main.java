package com.company;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Database db1 = Database.getInstance();
        db1.update();

        Database db2 = Database.getInstance();
        db2.update();

    }
}
