package Pedidos;

public class Complementos {


    private String verdura;
    private String molho;
    private String queijo;

    public Complementos() {
    }

    public Complementos(String verdura, String molho, String queijo) {
        this.verdura = verdura;
        this.molho = molho;
        this.queijo = queijo;
    }

    public String getVerdura() {
        return verdura;
    }

    public void setVerdura(String verdura) {
        this.verdura = verdura;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void verdura (String verdura){

    }

    public void comVerdura(){
        verdura = "Com Verdura";
        this.getVerdura();
    }



    public void comMolho() {
        molho = "Com Molho";
        this.getMolho();
    }
    public void comQueijo() {
        queijo = "Com Queijo";
        this.getQueijo();
    }




}




