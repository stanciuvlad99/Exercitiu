package models;

public class Animal {
    private String tipAnimal;
    private String rasa;
    private int varsta;

    public Animal(String tipAnimal, String rasa, int varsta){
        this.tipAnimal=tipAnimal;
        this.rasa=rasa;
        this.varsta=varsta;
    }

    public Animal(String text){
        String []split=text.split(",");
        this.tipAnimal=split[0];
        this.rasa=split[1];
        this.varsta=Integer.parseInt(split[2]);

    }

    public String getRasa(){
        return rasa;
    }

    public void setRasa(String rasa){
        this.rasa=rasa;
    }

    public String getTipAnimal(){
        return tipAnimal;
    }

    public void setTipAnimal(String tipAnimal){
        this.tipAnimal=tipAnimal;
    }

    public int getVarsta(){
        return varsta;
    }

    public void setVarsta(int varsta){
        this.varsta=varsta;
    }


    public String descreire(){
        String text="";
        text+="tip animal " + tipAnimal+"\n";
        text+="rasa " + rasa + "\n";
        text+="varsta " + varsta + "\n";
        return text;
    }

    public String toSave(){
        return tipAnimal+","+rasa+","+varsta;
    }

}
