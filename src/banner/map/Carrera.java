/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banner.map;

/**
 *
 * @author Ivan
 */
public class Carrera {
    
    private String Codigo;
    private String Carrera;

    public Carrera() {
    }

    public Carrera(String Codigo, String Carrera) {
        this.Codigo = Codigo;
        this.Carrera = Carrera;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
