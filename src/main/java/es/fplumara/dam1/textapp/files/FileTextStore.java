package es.fplumara.dam1.textapp.files;

import es.fplumara.dam1.textapp.config.AppConfig;
import es.fplumara.dam1.textapp.exceptions.StoreException;
import es.fplumara.dam1.textapp.model.Message;

public class FileTextStore implements TextStore {

    //ATRIBUTOS

    private AppConfig appConfig;

    String rutaFichero = appConfig.get

    //CONSTRUCTOR

    public FileTextStore(AppConfig appConfig) {
        this.appConfig = appConfig;
    }




    @Override
    public void save(String mensaje) {

    }

    @Override
    public String readAll() {
        return "";
    }

    @Override
    public String readLast(int n) {
        return "";
    }
}
