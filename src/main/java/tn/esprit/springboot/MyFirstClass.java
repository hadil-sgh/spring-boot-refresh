package tn.esprit.springboot;

public class MyFirstClass {
    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }


    public String sayHello(){
              return "Hello this is me remembering Spring ==> My Var ="+myVar;
    }
}
