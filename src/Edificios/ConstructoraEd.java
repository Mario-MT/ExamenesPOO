/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 *
 * @author Mario Mendoza
 */
public abstract class ConstructoraEd {
    private String tipoEd;
    private String departament;
    private String municipio;
    private String arqui;

    public ConstructoraEd(String tipoEd, String departament, String municipio, String arqui) {
        this.tipoEd = tipoEd;
        this.departament = departament;
        this.municipio = municipio;
        this.arqui = arqui;   
    }

    public String getTipoEd() {
        return tipoEd;
    }

    public void setTipoEd(String tipoEd) {
        this.tipoEd = tipoEd;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getArqui() {
        return arqui;
    }

    public void setArqui(String arqui) {
        this.arqui = arqui;
    }
    
    
    
}
