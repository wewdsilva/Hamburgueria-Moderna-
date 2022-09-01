package Pedidos;

public class Carne {

    private String carne;
    private String frango;

        public Carne() {
    }

    public Carne(String carne, String frango) {
        this.carne = carne;
        this.frango = frango;

    }

    public String getCarne() {
        return carne;
    }

    public void setCarne() {
        this.carne = this.carne;
    }

    public String getFrango() {
        return frango;
    }

    public void setFrango() {
        this.frango = frango;
    }



    public void opCarne(){
        carne = "Blend de Carne";
        this.getCarne();

    }

    public void opFrango () {
        frango = "Blend de Frango";
        this.getFrango();

    }

    }






