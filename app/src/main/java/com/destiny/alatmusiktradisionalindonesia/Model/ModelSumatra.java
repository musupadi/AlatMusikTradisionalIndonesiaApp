package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelSumatra {
    public static String[][] data = new String[][]{

            {"Doll",
                    "Doll adalah salah satu alat musik tradisional yang berasal dari Bengkulu. Alat musik ini jika dilihat dari bentuknya, sekilas mirip dengan alat musik perkusi. Namun bunyi yang dihasilkan dari alat musik Doll ini tidaklah sama dengan alat musik perkusi. Alat musik ini terbuat dari kayu atau bonggol kelapa yang terkenal sangat kuat namun ringan.",
                    "https://www.carabermainalatmusik.com/wp-content/uploads/2018/03/doll-bengkulu.jpg"
            },
            {"Gambus",
                    "Gambus adalah alat musik petik seperti mandolin yang berasal dari Timur Tengah. Paling sedikit gambus dipasangi 3 senar sampai paling banyak 12 senar. Gambus dimainkan sambil diiringi gendang. Sebuah orkes memakai alat musik utama berupa gambus dinamakan orkes gambus atau disebut gambus saja.",
                    "https://tataglintasbatas.files.wordpress.com/2018/09/ce456-eb396-oud_turkish.jpg?w=640&h=640"
            },
            {"Rebana",
                    "Musik rebana mempunyai sejarah kemunculan pada masa penyebaran agama Islam oleh Sunan Kalijaga. Terutama dimainkan dalam peringatan Maulid Nabi Muhammad SAW. Karena perkembangan yang cukup menarik, kesenian ini digelar juga diluar acara Maulid Nabi, seperti dalam acara hajatan sunatan dan pernikahan. Alat rebananya sendiri berasal dari daerah Timur Tengah dan dipakai untuk acara kesenian. Kemudian alat musik ini semakin meluas perkembangannya hingga ke Indonesia. Pada musik gambus, kasidah dan hadroh adalah jenis kesenian yang sering menggunakan rebana.",
                    "https://pimg.chirpstory.com/9a7409f24f835d6accf60dc9000b788df422afc8/68747470733a2f2f7062732e7477696d672e636f6d2f6d656469612f43775654356536556b4141586d67702e6a70673a6c61726765?w=1200&h=630&t=c"
            },
            {"Saluang",
                    "Saluang adalah alat musik tradisional khas Minangkabau, Sumatera Barat. Alat musik tiup ini terbuat dari bambu tipis atau talang. Orang Minangkabau percaya bahwa bahan yang paling bagus untuk dibuat Saluang berasal dari talang untuk jemuran kain atau talang yang ditemukan hanyut di sungai. Alat ini termasuk dari golongan alat musik suling, tetapi lebih sederhana pembuatannya, cukup dengan melubangi talang dengan empat lubang. Panjang saluang kira-kira 40-60 cm, dengan diameter 3-4 cm.",
                    "https://3.bp.blogspot.com/-bIuJeFyQWu0/W0r_jl-AzeI/AAAAAAAAEO0/j0reFJRjAcMbIkHo3p4u0Tp1Ei8vnXq1ACLcBGAs/s1600/saluang%2Bdarek.jpg"
            },
            {"Serune Kalee",
                    "Serune Kalee merupakan alat musik tradisional yang berupa terompet khas Aceh dengan dengan struktur bentuk mirip klarinet. Biasanya Serune Kalee dimainkan sebagai instrumen utama dalam sebuah pertunjukan musik tradisi di Aceh, diiringi geundrang, rapai, dan sejumlah instrumen tradisional lainnya. Alat musik ini dikenal terutama terdapat di daerah Pidie, Aceh Utara, Aceh Besar, dan Aceh Barat.",
                    "https://www.carabermainalatmusik.com/wp-content/uploads/2018/03/Serune-Kale-1.jpg"
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
