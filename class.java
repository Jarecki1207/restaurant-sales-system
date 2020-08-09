/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauracja;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jaros
 */
public class SuperClass_Parent {
    
    public double TatarWolowy;
    public double PierogiRuskie;
    public double Zurek;
    public double Schabowy;
    public double Zeberka;
    public double Szarlotka;
    
    public double Lemoniada;
    public double Woda;
    public double Cola;
    public double Sok;
    public double Kawa;
    public double Herbata;
    
    public double Jedzenie;
    public double Napoje;
    public double SumaRazem;
    
   /* public double GetAmount()
    {
        Jedzenie = TatarWolowy + PierogiRuskie + Zurek + Schabowy + Zeberka + Szarlotka;

        Napoje = Lemoniada + Woda + Cola + Sok + Kawa + Herbata;
    
        SumaJiN = Jedzenie + Napoje;
        return SumaJiN;
        
    }        */
    
      public double GetAmountJ()
    {
        Jedzenie = TatarWolowy + PierogiRuskie + Zurek + Schabowy + Zeberka + Szarlotka;
        return Jedzenie;
    } 
      
       public double GetAmountN()
    {
        Napoje = Lemoniada + Woda + Cola + Sok + Kawa + Herbata;
        return Napoje;
    } 
       
          public double GetAmountSuma()
    {
        SumaRazem = Jedzenie + Napoje;
        return SumaRazem;
    } 
       
    private JFrame frame;
    
    public void iExitSystem(){
    frame = new JFrame("Exit");
    
    if (JOptionPane.showConfirmDialog(frame, "Potwierdź jeśli chcesz wyjść","Restauracyjny system sprzedażowy",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
    
    }
    
    public double pTatarWolowy = 36.11;
    public double pPierogiRuskie = 24.07;
    public double pZurek = 17.59;
    public double pSchabowy = 36.11;
    public double pZeberka = 51.85;
    public double pSzarlotka = 20.37;
    
    public double pLemoniada = 9.76;
    public double pWoda = 7.32;
    public double pCola = 6.50;
    public double pSok = 10.57;
    public double pKawa = 9.76;
    public double pHerbata = 11.38;
    

    public double mcPodatek8 = 0.92;
    public double mcPodatek23 = 0.77;
    
    public Double cFindTax8(double cGetAmountJ)
    {
        double FindTax8 = cGetAmountJ - (cGetAmountJ * mcPodatek8);
        return FindTax8;
    }
        public Double cFindTax23(double cGetAmountN)
    {
        double FindTax23 = cGetAmountN - (cGetAmountN * mcPodatek23);
        return FindTax23;
    }    
    
}
