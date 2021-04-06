package semana7;

import javax.swing.JOptionPane;

public class Carro1 extends Carro implements ILiquidacion{
    String marca;
    String linea;
    int modelo;  
    String publico;
    public void marca(String marca) {
        this.marca = marca;
        if(marca.equalsIgnoreCase("ford")){                
              setValorComercial((int) (Math.random()*450000000)  + getModelo());       
        }
        if(marca.equalsIgnoreCase("renault")){
            setValorComercial((int) (Math.random()*220000000) + getModelo());
        }
        if(marca.equalsIgnoreCase("kia")){
             setValorComercial((int) (Math.random()*260000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mazda")){
             setValorComercial((int) (Math.random()*125000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("chevrolet")){
             setValorComercial((int) (Math.random()*185000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("audi")){
             setValorComercial((int) (Math.random()*460000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("bmw")){
             setValorComercial((int) (Math.random()*500000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("dodge")){
             setValorComercial((int) (Math.random()*390000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("fiat")){
             setValorComercial((int) (Math.random()*57000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("honda")){
             setValorComercial((int) (Math.random()*23900000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("hiunday")){
             setValorComercial((int) (Math.random()*22000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz")){
             setValorComercial((int) (Math.random()*48600000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("toyota")){
             setValorComercial((int) (Math.random()*40000000) + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen")){
             setValorComercial((int) (Math.random()*12000000) + getModelo()); 
        }
    }
    public  void linea(String linea) {
        if( marca.equalsIgnoreCase("ford") && linea.equalsIgnoreCase("taurus")){                
              setValorComercial(10000000 + getModelo());       
        }
        if( marca.equalsIgnoreCase("ford") && linea.equalsIgnoreCase("f150")){                
              setValorComercial(350000000 + getModelo());       
        }
        if( marca.equalsIgnoreCase("ford") && linea.equalsIgnoreCase("expedicion")){                
              setValorComercial(280000000 + getModelo());       
        }
        if( marca.equalsIgnoreCase("ford") && linea.equalsIgnoreCase("fiesta")){                
              setValorComercial(23500000 + getModelo());       
        }
        if(marca.equalsIgnoreCase("renault")&& linea.equalsIgnoreCase("duster")){
            setValorComercial(54000000 + getModelo());
        }
        if(marca.equalsIgnoreCase("renault")&& linea.equalsIgnoreCase("koleos")){
            setValorComercial(130000000 + getModelo());
        }
        if(marca.equalsIgnoreCase("renault")&& linea.equalsIgnoreCase("clio")){
            setValorComercial(30000000 + getModelo());
        }
        if(marca.equalsIgnoreCase("kia") && linea.equalsIgnoreCase("sportage")){
             setValorComercial(130000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("kia") && linea.equalsIgnoreCase("cerato forte")){
             setValorComercial(33000000 + getModelo()); 
        }
         if(marca.equalsIgnoreCase("kia") && linea.equalsIgnoreCase("rio")){
             setValorComercial(17000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mazda") && linea.equalsIgnoreCase("grand touring")){
             setValorComercial(130000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mazda") && linea.equalsIgnoreCase("cx-9")){
             setValorComercial(180000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mazda") && linea.equalsIgnoreCase("3")){
             setValorComercial(68000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mazda") && linea.equalsIgnoreCase("2")){
             setValorComercial(50000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("chevrolet") && linea.equalsIgnoreCase("camaro")){
             setValorComercial(180000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("chevrolet") && linea.equalsIgnoreCase("beat")){
             setValorComercial(40000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("chevrolet") && linea.equalsIgnoreCase("onix")){
             setValorComercial(50000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("chevrolet") && linea.equalsIgnoreCase("tracker")){
             setValorComercial(68000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("audi") && linea.equalsIgnoreCase("a3")){
             setValorComercial(90000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("audi") && linea.equalsIgnoreCase("q2")){
             setValorComercial(98000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("audi") && linea.equalsIgnoreCase("q3")){
             setValorComercial(140000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("audi") && linea.equalsIgnoreCase("q8")){
             setValorComercial(300000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("bmw") && linea.equalsIgnoreCase("i3")){
             setValorComercial(160000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("bmw") && linea.equalsIgnoreCase("serie 3")){
             setValorComercial(140000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("bmw") && linea.equalsIgnoreCase("135i")){
             setValorComercial(70000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("bmw") && linea.equalsIgnoreCase("x3")){
             setValorComercial(400000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("dodge") && linea.equalsIgnoreCase("ram 1500")){
             setValorComercial(130000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("dodge") && linea.equalsIgnoreCase("journey")){
             setValorComercial(70000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("dodge") && linea.equalsIgnoreCase("durango")){
             setValorComercial(82000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("fiat") && linea.equalsIgnoreCase("strada")){
             setValorComercial(36000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("fiat") && linea.equalsIgnoreCase("palio")){
             setValorComercial(11000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("fiat") && linea.equalsIgnoreCase("bravo")){
             setValorComercial(27000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("honda") && linea.equalsIgnoreCase("accord")){
             setValorComercial(19400000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("honda") && linea.equalsIgnoreCase("cr-v")){
             setValorComercial(54000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("honda") && linea.equalsIgnoreCase("fit")){
             setValorComercial(32000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("hiunday") && linea.equalsIgnoreCase("grand i10")){
             setValorComercial(62000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("hiunday") && linea.equalsIgnoreCase("tucson")){
             setValorComercial(108000000  + getModelo()); 
        }
        if(marca.equalsIgnoreCase("hiunday") && linea.equalsIgnoreCase("vera cruz")){
             setValorComercial(41000000 + getModelo());
        }
        if(marca.equalsIgnoreCase("hiunday") && linea.equalsIgnoreCase("santa fe")){
             setValorComercial(54000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("hiunday") && linea.equalsIgnoreCase("accent")){
             setValorComercial(30000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz") && linea.equalsIgnoreCase("gle 450")){
             setValorComercial(278000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz") && linea.equalsIgnoreCase("gla 200")){
             setValorComercial(72490000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz") && linea.equalsIgnoreCase("c 1.8")){
             setValorComercial(38500000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz") && linea.equalsIgnoreCase("c 250")){
             setValorComercial(65900000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("mercedes-benz") && linea.equalsIgnoreCase("e 2.0")){
             setValorComercial(85000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("toyota") && linea.equalsIgnoreCase("sahara")){
             setValorComercial(430000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("toyota") && linea.equalsIgnoreCase("prado")){
             setValorComercial(240000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("toyota") && linea.equalsIgnoreCase("corolla")){
             setValorComercial(96800000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("toyota") && linea.equalsIgnoreCase("hilux")){
             setValorComercial(50000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen") && linea.equalsIgnoreCase("gol")){
             setValorComercial(13800000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen") && linea.equalsIgnoreCase("voyage")){
             setValorComercial(40000000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen") && linea.equalsIgnoreCase("jetta")){
             setValorComercial(21800000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen") && linea.equalsIgnoreCase("amarok")){
             setValorComercial(112900000 + getModelo()); 
        }
        if(marca.equalsIgnoreCase("volkswagen") && linea.equalsIgnoreCase("bora")){
             setValorComercial(43000000 + getModelo()); 
        }
        this.linea = linea;
    }
    public void modelo(int modelo) {
        if(modelo < 2008){
            setModelo(1500000);
        }else{
            setModelo(200000);
        }
        this.modelo = modelo;
    }
    public void publico(String publico) {
        this.publico = publico;
    }  
    
    @Override
    public void setValorComercial(int valorComercial) {
        super.setValorComercial(valorComercial);
    }
    
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
        super.setMarca(marca);
    }    
    @Override
    public void Imprimir() {
        JOptionPane.showMessageDialog(null, "Lo sentimos, seguimos trabajando en ofrecerte los mejores servicios."
                +'\n' +"Todos nuestros datos son random y son unicamente utiles para esta aplicacion.");
    }
}
