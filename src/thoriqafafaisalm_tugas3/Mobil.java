package thoriqafafaisalm_tugas3;

public class Mobil extends Kendaraan{
    private String namaKendaraan;
    private String typeKendaraan;
    private float kapasitasMesin;
    private float bahanBakar;
    

    public Mobil() {
        super();
    }



    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTypeKendaraan() {
        return typeKendaraan;
    }

    public void setTypeKendaraan(String typeKendaraan) {
        this.typeKendaraan = typeKendaraan;
    }

    public float getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(float kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    @Override
    public void infoKendaraan(){
        System.out.println("==================Mobil==================");
        System.out.println("Id Kendaraan\t\t: "+getIdKendaraan());
        System.out.println("Nama Kendaraan\t\t: "+getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t: "+getTypeKendaraan());
        System.out.println("Nama Kapasitas Mesin\t: "+getKapasitasMesin());
        
    }

    int setIdKendaraan(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
