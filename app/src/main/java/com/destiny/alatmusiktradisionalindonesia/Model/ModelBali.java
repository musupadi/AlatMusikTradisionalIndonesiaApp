package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelBali {
    public static String[][] data = new String[][]{
            {"Ceng Ceng",
                    "Alat musik ceng-ceng terbuat dari logam (tembaga) dan dimainkan dengan cara diadu / di-benturkan satu sama lainnya. Bentuk ceng-ceng seperti simbal berukuran kecil yang ditidurkan, pemainnya memegang pasangannya dan nanti memukulnya.",
                    "https://4.bp.blogspot.com/-d2b0pvmxw9A/WQMhbJVOKSI/AAAAAAAAChw/v1NI_Yht-TwgF0TvtZbkD-iXAZskmC1UgCLcB/s1600/Alat%2BMusik%2BCeng%2BCeng.jpg"
            },
            {"Pereret",
                    "Pereret adalah alat musik kuno sejenis trompet yang terbuat dari bahan kayu yang dibentuk sedemikian rupa sehingga menjadi trompet",
                    "https://nowbali.co.id/wp-content/uploads/2017/09/Theme-Traditional-Music-Instrument-Pereret.jpg"
            },
            {"Rindik",
                    "Rindik terbuat dari bambu yang bernada selendro dan dimainkan dengan cara dipukul. Alat musik ini biasa dimainkan oleh 2-5 orang pemain, di mana 2 orang menabuh Rindik dan sisanya untuk seruling dan gong pulu.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/52/Rindik_%282689771905%29.jpg"
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
