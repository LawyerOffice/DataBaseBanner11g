/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner.crud;

import banner.map.Campus;
import banner.map.Carrera;
import banner.map.PersonaBanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author IVAN
 */
public class BannerCrud {

    //private static Log4JLogger log = new Log4JLogger();
    public static PersonaBanner findPersonBannerByIdBanner(String IdBanner) {
        PersonaBanner person = null;
        String SELECT = "select spriden.spriden_id, spriden.spriden_last_name, spriden.spriden_first_name, spbpers.spbpers_ssn, goremal.goremal_email_address,"
                + " SATURN.ZGETNOMBRECAMPUS(SATURN.ZGETCAMPUS_TERM(spriden.spriden_pidm, 1))"
                + " from spriden, spbpers, goremal, sprtele"
                + " where spriden.spriden_pidm = spbpers.spbpers_pidm"
                + " and spriden.spriden_change_ind is null"
                + " and goremal.goremal_pidm = spriden.spriden_pidm"
                + " and goremal.goremal_emal_code = 'STAN'"
                + " and spriden.spriden_pidm = sprtele.sprtele_pidm (+)"
                + " and spriden.spriden_id = '" + IdBanner + "'";
        Connection11g con = new Connection11g();
        ArrayList<PersonaBanner> Personas = new ArrayList<>();
        // log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Dato llegado findPersonBannerByIdBanner:"+IdBanner);
        try {

            ResultSet rt = con.consultar(SELECT);
            PersonaBanner prb = new PersonaBanner();
            if (rt != null) {
                while (rt.next()) {
                    prb.setIdBanner(rt.getString(1));
                    prb.setApellidos(rt.getString(2));
                    prb.setNombres(rt.getString(3));
                    prb.setCedula(rt.getString(4));
                    prb.setEmail(rt.getString(5));
                    prb.setCampus(rt.getString(6));
                    Personas.add(prb);
                }
            }
            if (!Personas.isEmpty()) {
                person = Personas.get(0);
                con.CloseConnection();
            }
        } catch (SQLException ex) {
        } catch (Exception ex) {
            throw ex;
        }
        return person;
    }

    public static ArrayList<Carrera> getListCarrera() {
        String SELECT = "SELECT DISTINCT SMRPRLE_PROGRAM,  SMRPRLE_PROGRAM_DESC "
                + "FROM SMRPRLE, SOBCURR WHERE SMRPRLE_PROGRAM = SOBCURR_PROGRAM "
                + "ORDER BY SMRPRLE_PROGRAM_DESC";
        Connection11g con = new Connection11g();
        ArrayList<Carrera> listCarrera = new ArrayList<>();
        try {

            ResultSet rt = con.consultar(SELECT);
            if (rt != null) {
                while (rt.next()) {
                    Carrera cmps = new Carrera();
                    cmps.setCodigo(rt.getString(1));
                    cmps.setCarrera(rt.getString(2));
                    listCarrera.add(cmps);
                }
            }
            if (!listCarrera.isEmpty()) {
                con.CloseConnection();
            } else {
                listCarrera = null;
            }
        } catch (SQLException ex) {
        } catch (Exception ex) {
            throw ex;
        }

        return listCarrera;
    }

    public static ArrayList<Campus> getListCampus() {
        String SELECT = "SELECT DISTINCT STVCAMP_CODE,  STVCAMP_DESC "
                + "FROM STVCAMP ORDER BY STVCAMP_CODE";
        Connection11g con = new Connection11g();
        ArrayList<Campus> listCampus = new ArrayList<>();
        try {

            ResultSet rt = con.consultar(SELECT);
            if (rt != null) {
                while (rt.next()) {
                    Campus cmps = new Campus();
                    cmps.setCodigo(rt.getString(1));
                    cmps.setCampus(rt.getString(2));
                    listCampus.add(cmps);
                }
            }
            if (!listCampus.isEmpty()) {
                con.CloseConnection();
            } else {
                listCampus = null;
            }
        } catch (SQLException ex) {
        } catch (Exception ex) {
            throw ex;
        }

        return listCampus;
    }

    public static PersonaBanner findPersonBannerByCedula(String Cedula) {
        PersonaBanner person = null;
        String SELECT = "select spriden.spriden_id, spriden.spriden_last_name, spriden.spriden_first_name, spbpers.spbpers_ssn, goremal.goremal_email_address,"
                + " SATURN.ZGETNOMBRECAMPUS(SATURN.ZGETCAMPUS_TERM(spriden.spriden_pidm, 1))"
                + " from spriden, spbpers, goremal, sprtele"
                + " where spriden.spriden_pidm = spbpers.spbpers_pidm"
                + " and spriden.spriden_change_ind is null"
                + " and goremal.goremal_pidm = spriden.spriden_pidm"
                + " and goremal.goremal_emal_code = 'STAN'"
                + " and spriden.spriden_pidm = sprtele.sprtele_pidm (+)"
                + " and spbpers.spbpers_ssn = '" + Cedula + "'";
        Connection11g con = new Connection11g();
        ArrayList<PersonaBanner> Personas = new ArrayList<>();
        //log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Dato llegado findPersonBannerByIdBanner:"+Cedula);
        try {

            ResultSet rt = con.consultar(SELECT);
            PersonaBanner prb = new PersonaBanner();
            if (rt != null) {
                while (rt.next()) {
                    prb.setIdBanner(rt.getString(1));
                    prb.setApellidos(rt.getString(2));
                    prb.setNombres(rt.getString(3));
                    prb.setCedula(rt.getString(4));
                    prb.setEmail(rt.getString(5));
                    prb.setCampus(rt.getString(6));
                    Personas.add(prb);
                }
            }
            if (!Personas.isEmpty()) {
                person = Personas.get(0);
                con.CloseConnection();
            }
        } catch (SQLException ex) {
        } catch (Exception ex) {
            throw ex;
        }
        return person;
    }

}
