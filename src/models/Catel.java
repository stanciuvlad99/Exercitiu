package models;

public class Catel extends Animal{

    private String nume;
    private String culoare;
    private double greutate;

    public Catel(String tipAnimal, String rasa, int varsta, String nume, String culoare, double greutate){
        super(tipAnimal,rasa,varsta);
        this.nume = nume;
        this.culoare = culoare;
        this.greutate = greutate;
    }

    public Catel(String text){
        super(text);
        String []split=text.split(",");
        this.nume=split[3];
        this.culoare=split[4];
        this.greutate=Double.parseDouble(split[5]);
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume=nume;
    }

    public String getCuloare(){
        return culoare;
    }

    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    public double getGreutate(){
        return greutate;
    }

    public void setGreutate(int greutate){
        this.greutate=greutate;
    }

    public String descriere(){
        String text="";
        text+="tip animal "+super.getTipAnimal()+"\n";
        text+="rasa "+super.getRasa()+"\n";
        text+="varsta "+super.getVarsta()+" ani \n";
        text+="nume "+nume+"\n";
        text+="culoare "+culoare+"\n";
        text+="greutate "+greutate+" kilograme"+"\n";
        return text;
    }

    public String toSave(){
        return getTipAnimal()+","+getRasa()+","+getVarsta()+","+nume+","+culoare+","+greutate;
    }
}
