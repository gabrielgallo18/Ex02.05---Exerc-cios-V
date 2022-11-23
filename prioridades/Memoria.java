public class Memoria {
    
    int id_memoria;
    int tempo_carga;
    int total_referencias;
    int ultima_referencia;
    boolean br;
    boolean bm;

    public Memoria(int id, int carga,int ref, int ultima_ref, boolean br, boolean bm){

        this.setId_memoria(id);
        this.setTempo_carga(carga);
        this.setTotal_referencias(ref);
        this.setUltima_referencia(ultima_ref);
        this.setBr(br);
        this.setBm(bm);

    }

    public int getId_memoria() {
        return id_memoria;
    }


    public void setId_memoria(int id_memoria) {
        this.id_memoria = id_memoria;
    }

    public int getTempo_carga() {
        return tempo_carga;
    }


    public void setTempo_carga(int tempo_carga) {
        this.tempo_carga = tempo_carga;
    }


    public int getTotal_referencias() {
        return total_referencias;
    }


    public void setTotal_referencias(int total_referencias) {
        this.total_referencias = total_referencias;
    }


    public int getUltima_referencia() {
        return ultima_referencia;
    }


    public void setUltima_referencia(int ultima_referencia) {
        this.ultima_referencia = ultima_referencia;
    }


    public boolean getBr() {
        return br;
    }


    public void setBr(boolean br) {
        this.br = br;
    }


    public boolean getBm() {
        return bm;
    }


    public void setBm(boolean bm) {
        this.bm = bm;
    }

}
