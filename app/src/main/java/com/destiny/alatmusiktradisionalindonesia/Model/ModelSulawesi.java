package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelSulawesi {
        public static String[][] data = new String[][]{
                {"Ganda",
                        "Ganda atau juga disebut dengan nama “Kanda” adalah alat musik tradisional Sulawesi. Alat musik ini merupakan jenis alat musik pukul seperti gendang namun berukuran lebih kecil dan lebih ramping dibanding dengan Gendang Jawa. Ganda ini juga memiliki bunyi yang hampir sama dengan gendang kecil yang berasal dari provinsi lainnya. Cara memainkannya cukup dengan memukul bagian kulit di ujung kayunya saja.",
                        "https://3.bp.blogspot.com/-4jAwWpFuuuw/V5XYUnCeU2I/AAAAAAAAQU8/P-r0AMUK8IUcgALGzA-wurz89x_7PD9sgCLcB/s1600/Ganda%2B-%2BKanda.png"
                },
                {"Kolintang",
                        "Kolintang merupakan alat musik khas dari Minahasa (Sulawesi Utara) yang mempunyai bahan dasar yaitu kayu yang jika dipukul dapat mengeluarkan bunyi yang cukup panjang dan dapat mencapai nada-nada tinggi maupun rendah seperti kayu telur, bandaran, wenang, kakinik atau sejenisnya (jenis kayu yang agak ringan tapi cukup padat dan serat kayunya tersusun sedemikian rupa membentuk garis-garis sejajar).",
                        "https://shinetoria.files.wordpress.com/2012/03/melody.jpg?w=300&h=225"
                },
                {"Polopalo",
                        "Polopalo adalah alat musik tradisional khas semenanjung Gorontalo, Provinsi Gorontalo. Polopalo merupakan alat musik jenis idiofon atau golongan alat musik yang sumber bunyinya diproleh dari badannya sendiri. Dalam artian bahwa ketika Polopalo tersebut di pukul atau sebaliknya memperoleh pukulan, bunyinya akan dihasilkan dari proses bergetarnya seluruh tubuh Polopalo tersebut.",
                        "https://gpswisataindonesia.files.wordpress.com/2015/07/1c121-polopalo.gif"
                },
                {"Puwi Puwi",
                        "Alat musik tradisional yang ditiup yang selanjutnya memiliki bentuk yang unik dan berbeda dari yang lain yaitu Puwi-puwi, alat musik ini juga punya nama lain yang biasa disebut dengan puik-puik. Puik-puik atau Puwi-Puwi memiliki bentuk yang mirip sekali dengan terompet atau bisa juga disebut terompet dari Sulawesi Selatan.",
                        "https://alatmusik.org/wp-content/uploads/2018/02/Alat-Musik-Tradisional-yang-ditiup-Sarunai.jpg"
                },
                {"Talindo",
                        "Alat musik tradisional Talindo / Popondi berbentuk busur seperti tanduk kerbau atau tanduk sapi yang bertumpu pada sebuah tempurung kelapa, di ujungnya atas bagian tanduk dipasang 1 buah senar dan dimainkan dengan cara dipetik.",
                        "https://4.bp.blogspot.com/-NjnpO2SSVE0/VPkS7lvEkUI/AAAAAAAAIlY/r-Eq6ts-MP0/w1200-h630-p-k-no-nu/talindo-popondi.jpg"
                }
        };
        public static ArrayList<Model> getListData(){
            Model model = null;
            ArrayList<Model> list = new ArrayList<>();
            for (String[] aData : data) {
                model = new Model();
                model.setAlatMusik(aData[0]);
                model.setDetail(aData[1]);
                model.setGambar(aData[2]);
                list.add(model);
            }
            return list;
        }
}
