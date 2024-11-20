package P6.P6.src.soal1;

public class DaftarGaji {
    public Pegawai listPegawai[];
    static int index = 0;
    
    DaftarGaji(int jumlah){
        this.listPegawai = new Pegawai[jumlah];
    }

    void addPegawai(Pegawai input){
        for (int i = 0; i < listPegawai.length; i++) {
            if(listPegawai[i] == null){
                listPegawai[i] = input;
                break;
            }
        }
    }

    void printSemuaGaji(){
       for (int i = 0; i < listPegawai.length; i++) {
        if (listPegawai[i] == null) {
            continue;
        }
         System.out.println("Pegawai:");
            System.out.println("NIP: " + listPegawai[i].getNip());
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Alamat: " + listPegawai[i].getAlamat());
            System.out.println("Gaji: " + listPegawai[i].getGaji());
            System.out.println();
            }
       }
    }
