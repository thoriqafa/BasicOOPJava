package thoriqafafaisalm_tugas3;

public class Kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    private float bahanBakar;
    

    public Kendaraan() {
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }
    
    public float xy(){
        float x = getJarakTempuh();
        float y = getBahanBakar();
        return x/y;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    
    
    public float totalJarak(float i, float j){
        return i+j;
    }
    
    
    public float efektivitas(){
        return (float) (Math.pow(Math.E, xy())*Math.log10(2));
    }
    
    public String keefektivitasan(){
        if (efektivitas()<=0.5) {
            return "efektif";
        } else if(efektivitas()<0){
            return "tidak efektif";
        }else{
            return "tidak efektif";
        }
    }
    
    public void infoKendaraan(){
        System.out.println("Bahan Bakar\t\t: "+getBahanBakar());
        System.out.println("Jarak Tempuh\t\t: " + getJarakTempuh());
        System.out.println("efektivitas\t\t: "+efektivitas());
        System.out.print("Keefektivitasan\t\t: ");keefektivitasan();
    }
    
}
