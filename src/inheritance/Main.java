/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author Zephyrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
	Manusia mns1 = new Manusia("Shabrina", "215150600111018", false, true);
    Manusia mns2 = new Manusia("Putri", "215150600111018", true, true);
    Manusia mns3 = new Manusia("Fudali", "215150600111018", true, false);
    ArrayList<Manusia> output = new ArrayList<>();
    output.add(mns1);
    output.add(mns2);
    output.add(mns3);

    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    MahasiswaFilkom mhs1 = new MahasiswaFilkom("Shabrina", "3326134801030063", false, false, "215150600111018", 3.5);
    MahasiswaFilkom mhs2 = new MahasiswaFilkom("putri", "3326134801030063", false, true, "215150600111018", 4.0);
    MahasiswaFilkom mhs3 = new MahasiswaFilkom("fudali", "3326134801030063", false, false, "215150600111018", 3.2);
    ArrayList<MahasiswaFilkom> output1 = new ArrayList<>();
    output1.add(mhs1);
    output1.add(mhs2);
    output1.add(mhs3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");

    Pekerja pkj1 = new Pekerja("shabrina", "3326134801030063", false, true, 8, 30, "2312");
    Pekerja pkj2 = new Pekerja("putri", "3326134801030063", true, false, 9, 28, "2312");
    Pekerja pkj3 = new Pekerja("fudali", "3326134801030063", false, true, 10, 26, "2312");
    ArrayList<Pekerja> output2 = new ArrayList<>();
    output2.add(pkj1);
    output2.add(pkj2);
    output2.add(pkj3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manajer mnj1 = new Manajer("shabrina", "3326134801030063", false, true,9, 25,"3243", 3789);
    Manajer mnj2 = new Manajer("putri", "3326134801030063", false, false,8, 28,"3243", 3789);
    Manajer mnj3 = new Manajer("fudali", "3326134801030063", true, true,6, 25,"3243", 3432);
    ArrayList<Manajer> output3 = new ArrayList<>();
    output3.add(mnj1);
    output3.add(mnj2);
    output3.add(mnj3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAJER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
