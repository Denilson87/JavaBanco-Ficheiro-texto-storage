/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Denilson
 */
public class va implements Serializable {
   String co,nome,senha;
   //-----------------Cliente-----------------
    String NuitC, NomeC, SexoC, DataNC;
    int ContactoC;
    ImageIcon foto;
   //-----------------Conta-------------------
    String cnumero;
    String ctipo, cmoeda, cDataAB,cnomeC, cNUITC;
    double csaldo;
    
   
    //--------Movimentos----------------------
    private int MnumeroS;
    private double Mvalor;
    private String MOperacao,Mnome, Mnuit;
    private String MData, MHora;



    public int getMnumeroS() {
        return MnumeroS;
    }

    public void setMnumeroS(int MnumeroS) {
        this.MnumeroS = MnumeroS;
    }

    public double getMvalor() {
        return Mvalor;
    }

    public void setMvalor(double Mvalor) {
        this.Mvalor = Mvalor;
    }

    public String getMOperacao() {
        return MOperacao;
    }

    public void setMOperacao(String MOperacao) {
        this.MOperacao = MOperacao;
    }

    public String getMnome() {
        return Mnome;
    }

    public void setMnome(String Mnome) {
        this.Mnome = Mnome;
    }

    public String getMnuit() {
        return Mnuit;
    }

    public void setMnuit(String Mnuit) {
        this.Mnuit = Mnuit;
    }

    public String getMHora() {
        return MHora;
    }

    public void setMHora(String MHora) {
        this.MHora = MHora;
    }

    public String getMData() {
        return MData;
    }

    public void setMData(String MData) {
        this.MData = MData;
    }
    
}
