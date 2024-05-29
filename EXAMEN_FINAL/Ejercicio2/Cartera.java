package Ejercicio2;

import java.util.List;

public class Cartera {
    private List<Dinero> money;
    public void addMoney(int option,double value){
        switch(option){
            case 1:
                addCoins(money,value);
            case 2:
                addBill(money,value);
        }
    }
    private void addCoins(List<Dinero> money, double value){
        if(value == 0.50 || value == 1 || value == 2){
            money.add(new Moneda(value));
        } else {
            System.out.println("Este valor no existe");
        }
    }
    private void addBill(List<Dinero> money, double value){
        if (value == 5 || value == 10 || value == 20){
            money.add(new Billete(value));
        }else{
            System.out.println("Este valor no existe");
        }
    }
    public void showTotalMoney (List<Dinero> money){
        double totalValue = 0;
        for (Dinero dinero : money){
            totalValue += dinero.getValue();
        }
    }
    public void showTotalCoins (List<Dinero> money){
        double totalCoins = 0;
        for (Dinero dinero : money){
            if (dinero instanceof Moneda){
                totalCoins += dinero.getValue();
            }
        }
    }
    public void showTotalBills (List<Dinero> money){
        double totalBills = 0;
        for (Dinero dinero : money){
            if (dinero instanceof Billete){
                totalBills += dinero.getValue();
            }
        }
    }
    
}
