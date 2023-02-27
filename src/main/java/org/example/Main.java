package org.example;
import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Logger ou = Logger.getLogger("com.api.jar");
        Dbp clv=Dbp.getInstance();
        clv.getConnection();
        ou.info("Do you want to close the Connection ??\nIf you want to close the connection press 1 or To continue press 0");
        int a=in.nextInt();
        if(a==1)  clv.closeAllConnections();
        else {
            clv.getConnection();
            ou.info("Returing the Database :");
            clv.ret();
        }


    }

}