package uas.if2.pkg10119069.trinovarelrahmadhani.no8;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Tanggal  : Sabtu, 20-02-2021
 * No Soal  : 8
 */
public class Persegi implements BangunDatar{
    private int luas;
    private final int sisi;
    
    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public void hitungLuas()
    {
        luas = sisi * sisi;
        
        System.out.println("Luas Persegi : " + luas);
    }
    
}
