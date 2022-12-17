/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan_skripsi;

/*
 *
 * @author  3411201085 Adhani Mulianti
            3411201089 Rayi Syifa Adriana Firmansyah
            3411201090 Adisti Dwi Susanti
            3411201094 Alfin Gerliandeva
 */
public class PetugasTU {
    private static int u_id;
    private static String u_nama_pengguna;
    private static String u_nama_petugas;
     
    public static int getU_id() {
        return u_id;
    }
 
    public static void setU_id(int u_id) {
        PetugasTU.u_id = u_id;
    }
 
    public static String getU_nama_pengguna() {
        return u_nama_pengguna;
    }
 
    public static void setU_nama_pengguna(String u_nama_pengguna) {
         PetugasTU.u_nama_pengguna = u_nama_pengguna;
    }
 
    public static String getU_nama_petugas() {
        return u_nama_petugas;
    }
 
    public static void setU_nama_petugas(String u_nama_petugas) {
        PetugasTU.u_nama_petugas = u_nama_petugas;
    }
   
}