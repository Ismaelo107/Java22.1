package Tema3.Class.POO.Act01;

public class Persona {
    int id;
    String dni;
    String nombre;
    String dir;
    int tel;

    public Persona() {
        this.id = 0;
        this.dni = "";
        this.nombre = "";
        this.dir = "";
        this.tel = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
