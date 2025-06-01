package model;

import java.io.Serializable;
import java.util.Date;

public class VideogiocoBean extends ProdottoBean implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
        ATTRIBUTI
     */
    private String piattaforma;
    private String descrizione;
    private String condizioni;
    private String numeroGiocatori;
    private Date dataRilascio;
    private String categoria;
    private int etaPegi;

    /*
        COSTRUTTORI
     */
    public VideogiocoBean() {
        super();
    }

    public VideogiocoBean(String barcode, String nome, float prezzo, int sconto, String piattaforma, String descrizione, String condizioni, String numeroGiocatori, Date dataRilascio,
                          String categoria,int etaPegi) {
        super(barcode, nome, prezzo, sconto, "videogioco");
        this.piattaforma = piattaforma;
        this.descrizione = descrizione;
        this.condizioni = condizioni;
        this.numeroGiocatori = numeroGiocatori;
        this.dataRilascio = dataRilascio;
        this.categoria = categoria;
        this.etaPegi = etaPegi;
    }
    /*
        GETTERS
     */
    public String getPiattaforma() {
        return piattaforma;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCondizioni() {
        return condizioni;
    }

    public String getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public Date getDataRilascio() {
        return dataRilascio;
    }

    public int getEtaPegi() {
        return etaPegi;
    }

    public String getCategoria() {
        return categoria;
    }

    /*
        SETTERS
     */
    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCondizioni(String condizioni) {
        this.condizioni = condizioni;
    }

    public void setNumeroGiocatori(String numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public void setDataRilascio(Date dataRilascio) {
        this.dataRilascio = dataRilascio;
    }

    public void setEtaPegi(int etaPegi) {
        this.etaPegi = etaPegi;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}