
package deteksimenopause;

import java.io.*;
class menopause{
    public static String goal[]={"Kesimpulan : Terdapat indikasi menopause, apakah anda ingin :\na. Konsultasi ke dokter \nb. Melakukan perawatan sendiri\n(a/b)","Kesimpulan : Pasien mengalami stres","Kesimpulan : Tidak terdapat indikasi menopause","Pasien dapat berkonsultasi ke dokter spesialis kandungan & kebidanan maupun dokter umum","Pasien dapat melakukan perawatan sendiri dengan tidak merokok, tidak minum alkohol, sering latihan secara teratur, makan makanan sehat dan terkena sinar matahari cukup"};
    public static String analisa(){
        boolean usia, tidakTeratur, psikis,emosiLabil, sensitif;
        //String goal[]={"Kesimpulan : Terdapat indikasi menopause, apakah anda ingin :\na. Konsultasi ke dokter \nb. Melakukan perawatan sendiri\n(a/b)","Kesimpulan : Pasien mengalami stres","Kesimpulan : Tidak terdapat indikasi menopause","Pasien dapat berkonsultasi ke dokter spesialis kandungan & kebidanan maupun dokter umum","Pasien dapat melakukan perawatan sendiri dengan tidak merokok, tidak minum alkohol, sering latihan secara teratur, makan makanan sehat dan terkena sinar matahari cukup"};
        String hasil="";
        String jawaban;
        try{
            BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Apakah usia pasien 40-50 tahun ke atas? (ya/tidak)");
            jawaban=in.readLine();
            usia = jawaban.toLowerCase().equals("y") || jawaban.toLowerCase().equals("yes") || jawaban.toLowerCase().equals("ya");                       
            System.out.println("Apakah keadaan emosi pasien labil? (ya/tidak)");
                jawaban=in.readLine();
                emosiLabil = jawaban.toLowerCase().equals("y") || jawaban.toLowerCase().equals("yes") || jawaban.toLowerCase().equals("ya");
                System.out.println("Apakah pasien semakin merasa sensitif dengan lingkungan sekitar? (ya/tidak)");
                jawaban=in.readLine();
                sensitif = jawaban.toLowerCase().equals("y") || jawaban.toLowerCase().equals("yes") || jawaban.toLowerCase().equals("ya");
                psikis = sensitif==true||emosiLabil==true;
                System.out.println("Apakah siklus haid pasien tidak teratur? (ya/tidak)");
                jawaban=in.readLine();
                tidakTeratur = jawaban.toLowerCase().equals("y") || jawaban.toLowerCase().equals("yes") || jawaban.toLowerCase().equals("ya");
                if (usia == true){
                    if (tidakTeratur==true){
                        if (psikis==true){
                            boolean correctAns=false;
                            while (correctAns==false){
                            System.out.println(goal[0]);
                            jawaban=in.readLine();
                            if(jawaban.toLowerCase().equals("a")){
                                hasil=goal[3];//usia true, tidakTeratur true, psikis true, pilihan a
                                correctAns=true;
                            }
                            else if((jawaban.toLowerCase().equals("b"))){
                                hasil=goal[4];//usia true, tidakTeratur true, psikis true, pilihan b
                                correctAns=true;
                            }
                            else{
                                System.out.println("Pilihan salah");
                            }
                            }
                        }
                        else//usia true, tidakTeratur true, psikis false
                            hasil=goal[1];
                    }
                    else{
                        if (psikis==true)
                            hasil=goal[1];//usia true, tidakTeratur false, psikis true
                        else
                            hasil=goal[2];//usia true, tidakTeratur false, psikis false?
                    }
                }
                else{
                    hasil=goal[2];//usia false
                }
                    
        }
        catch(Exception e){
            System.out.println(e);  
        }
        return hasil;
    
}
}
public class DeteksiMenopause {
    public static void main(String[] args) {
        try{
            BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
            boolean ulang=true;
            while (ulang==true){
            String answer=menopause.analisa();
            System.out.println(answer);
            if ((answer.equals(menopause.goal[2]))||(answer.equals(menopause.goal[3]))||(answer.equals(menopause.goal[4]))){
                System.out.println("Apakah ingin melakukan analisa kembali? (ya/tidak)");
                String jawaban=in.readLine();
                ulang = jawaban.toLowerCase().equals("yes") || jawaban.toLowerCase().equals("ya");
            }
            //in.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
