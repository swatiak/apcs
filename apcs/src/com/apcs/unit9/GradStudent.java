package com.apcs.unit9;

    public class GradStudent extends Student {
        public String getFood() {
        return "Taco";
        }
       public String getInfo() {
        super.getInfo();
        return "Eating";
        } 
}
