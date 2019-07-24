package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelJawa {
    public static String[][] data = new String[][]{
            {"Gamelan",
                    "Gamelan Jawa adalah ensembel musik yang biasanya menonjolkan metalofon, gambang, gendang, dan gong. Musik yang tercipta pada Gamelan Jawa berasal dari paduan bunyi gong, kenong dan alat musik Jawa lainnya. Irama musik umumnya lembut dan mencerminkan keselarasan hidup, sebagaimana prinsip hidup yang dianut pada umumnya oleh masyarakat Jawa.",
                    "https://www.sumber.com/images/jalan-jalan-kuliner/Budaya/Jawa_Tengah/Gamelan_Jawa.jpg"
            },
            {"Bonang",
                    "Bonang adalah salah satu bagian dari seperangkat Gamelan Jawa, Bonang terbagi menjadi dua yaitu Bonang barung dan Bonang penerus.",
                    "http://4.bp.blogspot.com/-TgOxrF-bIqI/VGiNlbQjPtI/AAAAAAAABPc/DYwbULR6a0o/s1600/bonang-barung.jpg"
            },
            {"Angklung",
                    "Angklung adalah alat musik multitonal (bernada ganda) yang secara tradisional berkembang dalam masyarakat Sunda di Pulau Jawa bagian barat. Alat musik ini dibuat dari bambu, dibunyikan dengan cara digoyangkan (bunyi disebabkan oleh benturan badan pipa bambu) sehingga menghasilkan bunyi yang bergetar dalam susunan nada 2, 3, sampai 4 nada dalam setiap ukuran, baik besar maupun kecil.",
                    "https://sc01.alicdn.com/kf/UTB8dGTWdmbIXKJkSaefq6yasXXaa/Malaysia-Bamboo-Made-Angklung.jpg_350x350.jpg"
            },
            {"Karinding",
                    "Karinding merupakan salah satu alat musik tradisional Indonesia yang cara memainkannya disentil oleh ujung telunjuk sambil ditempel di bibir. Alat musik ini termasuk dalam jenis lamelafon atau idiofon. Biasanya dibuat dari bahan pelepah aren atau dari bambu. Dalam penyebutannya Karinding (sunda) Rinding (Jawa) juga masih sajenis dengan génggong (Bali), serta kuriding dari (Kalimantan Selatan).",
                    "https://suarapemimpin5.files.wordpress.com/2016/03/549735_b1b2b781-e3ab-4c9f-a4b6-b2daa07ae4cd.jpg?w=816"
            },
            {"Tehyan",
                    "Suku Betawi di Provinsi D.K.I Jakarta mengenal begitu banyak ragam kesenian. Diantaranya ialah kesenian Kroncong Tugu, Marawis, Gambang Kromong dan Tanjidor. Dari beragam kesenian tersebut, maka kita juga mengenal bermacam alat musik yang dipakai untuk mengiringi kesenian tersebut sebagai sarana pendukung. Alat musik yang menjadi ikon dari kebudayaan Betawi ialah “Tehyan”. Alat musik ini dimainkan dengan cara digesek seperti biola.",
                    "https://www.carabermainalatmusik.com/wp-content/uploads/2018/03/tehyan.jpg"
            },
            {"Terompet Reog",
                    "Di daerah Ponorogo Jawa Timur merupakan asal daerah Terompet Reog. Fungsi dari alat musik ini umumnya dipakai sebagai pengiring saat pertunjukan Reog Ponorogo. Alat musik tradisional tersebut dimainkan dengan cara di tiup karena termasuk dalam jenis alat musik tiup atau aerofon.",
                    "https://budayajawa.id/wp-content/uploads/2017/10/terompet_reog_ok_kw1.jpg"
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
