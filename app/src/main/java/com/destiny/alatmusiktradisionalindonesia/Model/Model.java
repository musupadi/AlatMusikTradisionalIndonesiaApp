package com.destiny.alatmusiktradisionalindonesia.Model;

public class Model {
    String alatMusik,gambar,detail;
    String no,soal,jawaban,jawabana,jawabanb,jawabanc,jawaband;
    public Model(){

    }
    public Model(String no,String soal,String jawaban,String jawabana,String jawabanb,String jawabanc,String jawaband){
        this.no=no;
        this.soal=soal;
        this.jawaban=jawaban;
        this.jawabana=jawabana;
        this.jawabanb=jawabanb;
        this.jawabanc=jawabanc;
        this.jawaband=jawaband;
    }

    public String getAlatMusik() {
        return alatMusik;
    }

    public void setAlatMusik(String alatMusik) {
        this.alatMusik = alatMusik;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public String getJawabana() {
        return jawabana;
    }

    public void setJawabana(String jawabana) {
        this.jawabana = jawabana;
    }

    public String getJawabanb() {
        return jawabanb;
    }

    public void setJawabanb(String jawabanb) {
        this.jawabanb = jawabanb;
    }

    public String getJawabanc() {
        return jawabanc;
    }

    public void setJawabanc(String jawabanc) {
        this.jawabanc = jawabanc;
    }

    public String getJawaband() {
        return jawaband;
    }

    public void setJawaband(String jawaband) {
        this.jawaband = jawaband;
    }
}
