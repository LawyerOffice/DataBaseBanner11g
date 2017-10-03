/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner.crud;

import banner.map.Campus;
import banner.map.Carrera;
import banner.map.PersonaBanner;
import java.util.ArrayList;

/**
 *
 * @author IVAN
 */
public class BannerMethos {

    public static PersonaBanner FindPersonBannerByIdBanner(String IdBanner) {
        PersonaBanner person = null;
        if (IdBanner != null && !IdBanner.equals("")) {
            person = BannerCrud.findPersonBannerByIdBanner(IdBanner);
        }
        return person;
    }

    public static PersonaBanner FindPersonBannerByCedula(String Cedula) {
        PersonaBanner person = null;
        if (Cedula != null) {
            person = BannerCrud.findPersonBannerByCedula(Cedula);
        }
        return person;
    }

    public static ArrayList<Campus> GetListCampus() {
        ArrayList<Campus> list = null;
        list = BannerCrud.getListCampus();
        return list;
    }
    
    public static ArrayList<Carrera> GetListCarrera() {
        ArrayList<Carrera> list = null;
        list = BannerCrud.getListCarrera();
        return list;
    }

}
