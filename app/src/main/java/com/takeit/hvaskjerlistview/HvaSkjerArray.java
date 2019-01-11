package com.takeit.hvaskjerlistview;

import java.util.ArrayList;

public class HvaSkjerArray {
    public static ArrayList<HvaSkjer> getHvaSkerArrayList() {

        ArrayList<HvaSkjer> hvaSkjerArray = new ArrayList<>();

        hvaSkjerArray.add(new HvaSkjer("Tor 10.01","10:30","Engelsk samtalegruppe","Frivillighetssentralen, Tangen Senter"));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Honnørbridge","Ekelund"));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Tysk samtalegruppe","Frivillighetssentralen, Tangen Senter"));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Boklyst","Tangenten, krange"));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Fransk samtalegruppe","Tangenten, krange"));

        for (int i = 0; i < 100; i++) {
            hvaSkjerArray.add(new HvaSkjer("Ons 14.01","16.00","App programmering","Frivillighetssentralen, Tangen Senter"));
        }
        return hvaSkjerArray;
    }
}
