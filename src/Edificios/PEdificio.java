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
public class PEdificio extends ConstructoraEd implements CalcularArea, CalAltEd {
private double area;
private double alturaed;
private double pisos;

    public PEdificio(double area, double alturaed,double pisos, String tipoEd, String departament, String municipio, String arqui) {
        super(tipoEd, departament, municipio, arqui);
        this.area = area;
        this.alturaed = alturaed;
        this.pisos = pisos;
    }
@Override
    public double calcArea(double base, double altura){
        return Math.round(base*altura);
        
    }
@Override
    public double calcAlturaEd(double altp, double Cpiso){
        return Math.round(altp*Cpiso);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAlturaed() {
        return alturaed;
    }

    public void setAlturaed(double alturaed) {
        this.alturaed = alturaed;
    }

    public double getPisos() {
        return pisos;
    }

    public void setPisos(double pisos) {
        this.pisos = pisos;
    }
    

}
