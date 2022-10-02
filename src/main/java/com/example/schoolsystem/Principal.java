package com.example.schoolsystem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal extends Person{
    private static Principal principal;
    private String id;
    private String password;

    private Principal(String id,String Pass){
        this.id=id;
        this.password=Pass;
    }
    public synchronized static Principal getPrincipal(String id,String Pass)
    {
        if(principal==null)
        {
            principal=new Principal(id,Pass);
        }

        return principal;
    }



    @Override
    public boolean Login(String PrincipleName, String PrinciplePassword) throws FileNotFoundException {

        if(PrincipleName.equals(principal.getId()) && PrinciplePassword.equals(principal.getPassword()) )
        {
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public boolean logout() throws IOException {
        new Main().changeScene("Login.fxml");
        return true;
    }


    public String getId() {
        return principal.id;
    }



    public String getPassword() {
        return principal.password;
    }

    private double TotalRevenue=0;

    public double Revenue() {

        return 20000;
    }



    private double TotalCost;

    public double Cost() {
        return 10000;
    }
    public double getProfit(double x,double y){
        return x-y;
    }





}
