package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Dbp {
    static Dbp po;
    String nm;
    Scanner in = new Scanner(System.in);
    Logger ou = Logger.getLogger("com.api.jar");

    private Dbp() {
    }

    public static Dbp getInstance() {
        if (po == null) {
            po = new Dbp();
        }
        return po;
    }

    public String getConnection() {
        ou.info("Enter the database connection :");
        nm = in.next();
        ou.info(nm);


        return null;
    }

    public void closeAllConnections() {
        String num = "closed";
        ou.info(num);
    }

    void ret() {
        ou.info(nm);
    }

}
