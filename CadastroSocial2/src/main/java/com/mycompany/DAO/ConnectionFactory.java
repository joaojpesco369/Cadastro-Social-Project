package com.mycompany.DAO;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    //Objetos
    private static EntityManagerFactory factory = null;
    
    static {
        try {

            init();
        } catch (IOException ex) {

        }
    }
    
    private static void init() throws IOException {

        try {

            factory = Persistence.createEntityManagerFactory("com.mycompany_CadastroSocial2_jar_1.0-SNAPSHOTPU");

        } catch (Exception e) {

        }
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
