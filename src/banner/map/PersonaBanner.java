/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banner.map;

/**
 *
 * @author IVAN
 */
public class PersonaBanner implements java.io.Serializable {
    
    private String IdBanner;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private String Campus;
    private String Carrera;
    
    public PersonaBanner() {
    }
    
    public PersonaBanner(String IdBanner){
        this.IdBanner =IdBanner;
    }
    
    public PersonaBanner(String IdBanner, String Cedula, String Nombres, String Apellidos, String Email, String Campus) {
        this.IdBanner = IdBanner;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Email = Email;
        this.Campus = Campus;
    }
       
    /**
     * @return the IdBanner
     */
    public String getIdBanner() {
        return IdBanner;
    }

    /**
     * @param IdBanner the IdBanner to set
     */
    public void setIdBanner(String IdBanner) {
        this.IdBanner = IdBanner;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Campus
     */
    public String getCampus() {
        return Campus;
    }

    /**
     * @param Campus the Campus to set
     */
    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
}
