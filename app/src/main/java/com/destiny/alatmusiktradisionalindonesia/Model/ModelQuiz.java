package com.destiny.alatmusiktradisionalindonesia.Model;

import java.util.ArrayList;

public class ModelQuiz {
    public static String[][] data = new String[][]{
            {"1",
                    "Alat Musik Dari Pulau Jawa?",
                    "A",
                    "A.Gamelan",
                    "B.Tifa",
                    "C.Sampek",
                    "D.Kurinding",
            },
            {"2",
                    "Alat musik dari Sulawesi?",
                    "B",
                    "A.Tifa",
                    "B.Kolintang",
                    "C.Angklung",
                    "D.Rindik",
            },
            {"3",
                    "Pereret berasal dari daerah?",
                    "A",
                    "A.Bali",
                    "B.Kalimantan",
                    "C.Sulawesi",
                    "D.Maluku",
            },
            {"4",
                    "Sasando berasal dari daerah?",
                    "D",
                    "A.Sumatra",
                    "B.Bali",
                    "C.Jawa",
                    "D.Nusa Tenggara",
            },
            {"5",
                    "Sampek berasal dari daerah?",
                    "C",
                    "A.Maluku",
                    "B.Bali",
                    "C.Kalimantan",
                    "D.Sumatra",
            },
            {"6",
                    "Angklung berasal dari daerah",
                    "C",
                    "A.Sulawesi",
                    "B.Sumatra",
                    "C.Jawa",
                    "D.Kalimantan",
            },
            {"7",
                    "Manakah Alat musik suku Betawi?",
                    "A",
                    "A.Tehyan",
                    "B.Anggklung",
                    "C.Sasando",
                    "D.Rebab",
            },
            {"8",
                    "Serune Kalee Berasal dari Daerah?",
                    "B",
                    "A.Jawa",
                    "B.Sumatra",
                    "C.Kalimantan",
                    "D.Sulawesi",
            },
            {"9",
                    "Alat Musik Gesek Dari Nusa Tenggara?",
                    "D",
                    "A.Terompet Ponorogo",
                    "B.Angklung",
                    "C.Rebana",
                    "D.Heo",
            },
            {"10",
                    "Alat Musik Tiup Dari Bali?",
                    "C",
                    "A.Foy Doa",
                    "B.Ceng Ceng",
                    "C.Pereret",
                    "D.Triton",
            }

    };
    public static ArrayList<Model> getListData(){
        Model models = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new Model();
            models.setNo(aData[0]);
            models.setSoal(aData[1]);
            models.setJawaban(aData[2]);
            models.setJawabana(aData[3]);
            models.setJawabanb(aData[4]);
            models.setJawabanc(aData[5]);
            models.setJawaband(aData[6]);
            list.add(models);
        }
        return list;
    }
}
