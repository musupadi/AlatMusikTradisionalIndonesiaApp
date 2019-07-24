package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelPapua {
    public static String[][] data = new String[][]{
            {"Pikon",
                    "Pikon merupakan alat musik tradisional Papua yang terbuat dari bambu dan dimainkan dengan cara ditiup. Nama “Pikon” sendiri berasal dari bahasa Baliem yaitu “Pikonane” yang berarti alat musik bunyi. Untuk memainkan pikon, sembari ditiup pemainnya harus menarik tali yang terdapat pada ujungnya untuk menghasilkan nada-nada dasar seperti do, mi, dan sol.",
                    "https://www.indonesiakaya.com/uploads/_images_gallery/Alat_musik_Pikon_biasa_dimainkan_ketika_waktu_bersantai_.jpg"
            },
            {"Tifa",
                    "Tifa merupakan alat musik khas Indonesia bagian Timur, khususnya Maluku dan Papua. Alat musik ini bentuknya menyerupai kend.ang dan terbuat dari kayu yang di lubangi tengahnya. Ada beberapa macam jenis alat musik Tifa seperti Tifa Jekir, Tifa Dasar, Tifa Potong, Tifa Jekir Potong dan Tifa Bas.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/COLLECTIE_TROPENMUSEUM_Enkelvellige_bekervormige_trom_TMnr_18-18.jpg/417px-COLLECTIE_TROPENMUSEUM_Enkelvellige_bekervormige_trom_TMnr_18-18.jpg"
            },
            {"Triton",
                    "Alat musik tiup ini dahulu digunakan untuk memanggil bala bantuan dan berkomunikasi. Namun sekarang, hanya dijadikan sebagai hiburan.",
                    "https://jenisalat.com/wp-content/uploads/2017/12/Alat-Musik-dari-Papua-Triton.jpg"
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
