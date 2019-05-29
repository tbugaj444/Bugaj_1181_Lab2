package com.company;

import java.util.ArrayList;

class CS1181SetLab02 extends CS1181Set{

    public CS1181SetLab02(int... x){
        super(x);
        if(duplicateCheck(this)){
            this.clear();
            //throw exception
        }


    }
    public void saveToFile(String fn){

    }
    public void loadFromFile(String fn){

    }
    private boolean duplicateCheck(CS1181Set temp) {
        CS1181Set temp2 = new CS1181Set(temp);
        int t;
        for (int i : temp2) {
            t =i;
            temp2.remove(temp2.indexOf(i));
            if(temp2.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
