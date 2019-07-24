package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelNusaTenggara {
    public static String[][] data = new String[][]{
            {"Foy Doa",
                    "Alat musik Foy Doa Berasal dari Flores, Foy Doa biasanya dimainkan oleh para remaja dalam sebuah permainan rakyat (seperti bentengan, dll) pada malam hari dengan berkumpul berbentuk linkaran. Nada yang dihasilkan dari Foy Doa-pun bisa menghasilkan nada tunggal ataupun nada ganda tergantung dari pemainnya.",
                    "https://1.bp.blogspot.com/-2lRGMsiEW2Y/WUoh6Ct48LI/AAAAAAAABbw/V3qJ1bQ3bm0PPVvdUGR-kcMyE7YAxPmUgCLcBGAs/s320/foy-doa-500x375.jpg"
            },
            {"Foy Pay",
                    "Alat musik tiup dari bambu ini dahulunya berfungsi untuk mengiringi lagu-lagu tandak seperti halnya musik Foy Doa. Dalam perkembangannya waditra ini selalu berpasangan dengan musik Foy Doa. Nada-nada yang diproduksi oleh Foy Pai : do, re, mi, fa, sol.",
                    "https://3.bp.blogspot.com/-Wgr1QFmh_s4/V2daOBrsTXI/AAAAAAAAQDM/d8_6ZEg0y30Ev4tvDUCvuq1fNg-SVV1fwCLcB/s1600/Foy%2BPay.png"
            },
            {"Heo",
                    "Alat musik Heo adalah alat musik tradisional NTT yang termasuk dalam kategori alat musik gesek yaitu cara memainkannya dengan digesek menggunakan busur pada dawainya.",
                    "https://percepat.com/wp-content/uploads/2019/04/Alat-Musik-Heo.jpg"
            },
            {"Knobe Khabetas",
                    "Alat Musik ini sudah ada sejak nenek moyangnya tinggal di dalam gua. Bentuknya pun cukup unik karena mirip busur panah. Seringnya masyarakat memakai Knobe disaat kebun atau saat mengawasi hewan-hewan.",
                    "https://alatmusik.org/wp-content/uploads/2018/01/Alat-Musik-Tradisional-NTT-Knobe-Khabetas.jpg"
            },
            {"Sasando",
                    "Sasando berasal dari Nusa Tenggara Timur yang mempunyai jenis bunyi Chordofon. Cara memainkannya dengan dipetik.",
                    "https://i2.wp.com/satujam.com/wp-content/uploads/2017/01/Alat-Musik-Sasando.jpg?w=603&ssl=1"
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
