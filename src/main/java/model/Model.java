package model;

import java.util.LinkedList;
import java.util.List;

public class Model{

    public List<Formula> formulas = new LinkedList<Formula>();
    
    public void addFormula(Formula formula){
        System.out.println(formula);
        formulas.add(formula);
    }

    public Formula srcFormula(Integer id){
        System.out.println(formulas);
        for(Formula formula:formulas){
            System.out.println("for model");
            if(formula.getId().equals(id)){
                System.out.println("if model");
                return formula;
            } 
        }
        return null;
    }
}