package model;

public class Formula{
    private String formula;
    private Integer id;

    public Formula( Integer id, String formula){
        this.id = id;
        this.formula = formula;
        
    }

    public String getFormula(){
        return formula; 
    }
    public Integer getId(){
        return this.id;
    }
}
