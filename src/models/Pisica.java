package models;

public class Pisica extends Animal{
    private String nume;
    private String culoare;
    private double greutate;

    public Pisica(String tipAnimal, String rasa, int varsta, String nume, String culoare, double greutate){
        super(tipAnimal,rasa,varsta);
        this.nume=nume;
        this.culoare=culoare;
        this.greutate=greutate;
    }

    public Pisica(String text){
        super(text);
        String []split=text.split(",");
        this.nume=split[3];
        this.culoare=split[4];
        this.greutate=Double.parseDouble(split[5]);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String descriere(){
        String text="";
        text+="tip animal " + getTipAnimal()+"\n";
        text+="rasa " + getRasa()+ "\n";
        text+="varsta " + getVarsta() + " ani \n";
        text+="nume " + nume + "\n";
        text+="culoare "+ culoare + "\n";
        text+="greutate " + greutate + " kilograme"+"\n";
        return text;
    }

    public String toSave(){
        return getTipAnimal()+","+getRasa()+","+getVarsta()+","+nume+","+culoare+","+greutate;
    }
}
