/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.lele.dukemarket.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

/**
 *
 * @author sesi2dib
 */
public class Produto {

    private Calendar dataCadastro;
    public void setDataCadsstro(String strDataCadastro){
    try {
        this.dataCadastro = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateDormat("yyyy-MM-dd HH:mm:ss");
        this.sataCadastro.setTime(sdf.parse(strDataCadastro));
    } catch (ParseExpetion ex) {
        Logger.getLogger(Produto.class.getName()).log(Levell.SEVERE, null, ex);
    
    }
}
public String getDataCAdastro() {
    if (this.dataCadastro != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(this.dataCadastro.getTime());
    } else {
        return "";
        
    }
}
public String toString() {
    return String.format("%3d | %15s | %-30s | %10.2f | %10.2f | %10s", this.id,
            this.codBarras, this.descricao, this.qtd, this.valorCompra,
            this.valorVenda, this.getDataCAdastro());
}
        }
    
}
