package model;

import java.io.Serializable;

public class ProdottoBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
        ATTRIBUTI
     */
    private String barcode;
    private String nome;
    private float prezzo;
    private int sconto;
    private String tipo;


    /*
        COSTRUTTORI
     */
    public ProdottoBean() {}

    public ProdottoBean(String barcode, String nome, float prezzo, int sconto, String tipo) {
        this.barcode = barcode;
        this.nome = nome;
        this.prezzo = prezzo;
        this.sconto = sconto;
        this.tipo = tipo;
    }

    /*
        GETTERS
     */
    public String getBarcode() {
        return barcode;
    }

    public String getNome() {
        return nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getSconto() {
        return sconto;
    }
    public String getTipo() {
        return tipo;
    }

    /*
            SETTERS
         */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    public void setSconto(int sconto) {
        this.sconto = sconto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}