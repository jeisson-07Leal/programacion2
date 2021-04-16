package Mvc;

import javax.swing.SwingConstants;

public class Modelo{
private Double total;
private Double valS;
private Double valTi;
private Double proLa;
private Double proDes;
private Double prodCom;
private Double prodRang;
private Double empl1,empl2,empl3,empl4,empl5,empl6,empl7;
private Double valT=0.0,em1=0.0,em2=0.0,em3=0.0,em4=0.0,em5=0.0,em6=0.0,em7=0.0;
private int dia, mes, año;
private Double valProLa=0.0, valProDes=0.0, valProCom = 0.0;
    
    public void report3() {
        System.out.println("Dia: "+dia+" Mes: "+mes+" Año: "+año+" Produccion total: "+valt());
    }
    public  double valt() {
        valT += this.valProCom + this.valProDes + this.valProLa;
        return valT;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Double getEmpl1() {
        return empl1;
    }

    public void setEmpl1(Double empl1) {
        this.empl1 = empl1;
    }

    public Double getEmpl2() {
        return empl2;
    }

    public void setEmpl2(Double empl2) {
        this.empl2 = empl2;
    }

    public Double getEmpl3() {
        return empl3;
    }

    public void setEmpl3(Double empl3) {
        this.empl3 = empl3;
    }

    public Double getEmpl4() {
        return empl4;
    }

    public void setEmpl4(Double empl4) {
        this.empl4 = empl4;
    }

    public Double getEmpl5() {
        return empl5;
    }

    public void setEmpl5(Double empl5) {
        this.empl5 = empl5;
    }

    public Double getEmpl6() {
        return empl6;
    }

    public void setEmpl6(Double empl6) {
        this.empl6 = empl6;
    }

    public Double getEmpl7() {
        return empl7;
    }

    public void setEmpl7(Double empl7) {
        this.empl7 = empl7;
    }
    public Double getValS() {
        return valS;
    }
    public void setValS(Double valS) {
        this.valS = valS;
    }
    public void total(){
        total = valS + valTi;
    }
    public void proCombos(){
        System.out.println("Produccion por combos: "+this.valProCom);
    }
    public void proLavad(){
        System.out.println("Produccion por lavados: "+this.valProLa);
    }
    public void proDesi(){
        System.out.println("Produccion por desinfecciones: "+this.valProDes);
    }
    public double pro(){
         valProCom += prodCom +valTi;
         return valProCom;
    }
    public double prodD() {
         valProDes += proDes +valTi;
         return valProDes;
    }
    public double proLA() {
         valProLa += proLa +valTi;
         return valProLa;
    }
    public void impEmpl1(){
        System.out.println("Produccion del empleado 1: "+this.em1);
    }
    public void impEmpl2(){
        System.out.println("Produccion del empleado 2: "+this.em2);
    }
    public void impEmpl3(){
        System.out.println("Produccion del empleado 3: "+this.em3);
    }
    public void impEmpl4(){
        System.out.println("Produccion del empleado 4: "+this.em4);
    }
    public void impEmpl5(){
        System.out.println("Produccion del empleado 5: "+this.em5);
    }
    public void impEmpl6(){
        System.out.println("Produccion del empleado 6: "+this.em6);
    }
    public void impEmpl7(){
        System.out.println("Produccion del empleado 7: "+this.em7);
    }
    public double pro1() {
        em1 += empl1 + valTi;
        return em1;
    }
    public double pro2(){
         em2 += empl2 + valTi;
       return em2;
    }
    public double pro3(){
          em3 += empl3 + valTi;
         return em3;
    }
    public double pro4(){
        em4 += empl4 + valTi;
        return em4;
    }
    public double pro5(){
         em5+= empl5 + valTi;
         return em5;
    }
    public double pro6(){
           em6 += empl6 + valTi;
         return em6;
    }
    public double pro7(){
        em7 += empl7 + valTi;
        return em7;
    }
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    public double getValTi() {
        return valTi;
    }

    public void setValTi(double valTi) {
        this.valTi = valTi;
    }

    public Double getProLa() { 
        return proLa;
    }

    public void setProLa(Double proLa) {
        this.proLa = proLa;
    }

    public Double getProDes() {
        return proDes;
    }

    public void setProDes(Double proDes) {
        this.proDes = proDes;
    }

    public Double getProdCom() {
        return prodCom;
    }

    public void setProdCom(Double prodCom) {
        this.prodCom = prodCom;
    }

    public Double getProdRang() {
        return prodRang;
    }

    public void setProdRang(Double prodRang) {
        this.prodRang = prodRang;
    }
}
