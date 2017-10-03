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
public class Campus {
    
    private String Codigo;
    private String Campus;

    public Campus() {
    }

    public Campus(String Codigo, String Campus) {
        this.Codigo = Codigo;
        this.Campus = Campus;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }
    
}
