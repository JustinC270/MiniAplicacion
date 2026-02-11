package es.fplumara.dam1.textapp.files;

public interface TextStore {
    void save(String mensaje);

    String readAll();

    String readLast(int n);

}
