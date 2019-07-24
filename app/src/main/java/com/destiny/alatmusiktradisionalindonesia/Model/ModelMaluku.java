package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelMaluku {
    public static String[][] data = new String[][]{
            {"Arababu",
                    "Arababu adalah alat musik asli Maluku yang memang berbentuk seperti Rebab. Menurut beberapa literatur sejarah, alat musik ini berkembang di Maluku setelah dibawa oleh para pedagang Arab jauh sebelum abad ke-16. Pada awalnya, yang dibawa oleh para pedagang Arab ini adalah sama dengan Rebab yang kini kita kenal dalam paduan instrumen gamelan Jawa, namun alat musik tersebut berkembang dengan pesat diantara penduduk lokal dan mengalami modifikasi hingga menjadi Arababu.",
                    "https://www.indonesiakaya.com/uploads/_images_gallery/Arababu_biasa_dipadukan_dengan_berbagai_instrumen_lain_seperti_tifa_dan_gong.jpg"
            },
            {"Korno",
                    "Alat musik tradisional Korno berasal dari daerah maluku, alat musik tradisional korno dibuat dari rumah siput yang dinamakan fuk-fuk. Sebelum dimainkan sebagai alat musik, Tahur / Korno digunakan untuk memanggil masyarakat sekitar untuk berkumpul membahas masalah atau lainnya, panjang dan banyaknya tiupan dari Tahuri memiliki makna tersendiri, seperti 1 tiupan pendek untuk memanggil 1 tiupan panjang untuk memperingati gelombang dan lainnya.",
                    "https://www.dictio.id/uploads/db3342/original/3X/a/5/a5c6beec94866ee4f9d8f9080df9926c56b1ab7c.jpg"
            },
            {"Rumba",
                    "Rumba merupakan alat musik Maluku yang bentuknya mirip seperti marakas. Cara memainkannya rumba hanya digoyang-goyang saja. Alat musik ini termasuk alat musik jenis perkusi.",
                    "https://www.nesabamedia.com/wp-content/uploads/2019/05/Rumba.jpg"
            },
            {"Totobuang",
                    "Totobuang adalah Alat musik tradisional Maluku yang berupa gong berukuran kecil dan bahannya terbuat dari bahan campuran antara logam dan kuningan.  Jumlah totobung dalam satu rak Ada 12 sampai 14 gong dimana ukuran serta suaranyapun berbeda dan merupakan nada-nada melodis.",
                    "https://4.bp.blogspot.com/-2npdiuj4BI4/W3t4Id8uMoI/AAAAAAAABdw/ASjmOkJ422keRSPiOKnnk5RC3QbYxzmmgCLcBGAs/s1600/Totobuang.jpg"
            }
    };

    public static ArrayList<Model> getListData() {
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



