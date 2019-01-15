package com.takeit.hvaskjerlistview;

import java.util.ArrayList;

public class HvaSkjerArray {
    public static ArrayList<HvaSkjer> getHvaSkerArrayList() {

        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        ArrayList<HvaSkjer> hvaSkjerArray = new ArrayList<>();

        hvaSkjerArray.add(new HvaSkjer("Tor 10.01","10:30","Engelsk samtalegruppe","Frivillighetssentralen, Tangen Senter", description));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Honnørbridge","Ekelund", description));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Tysk samtalegruppe","Frivillighetssentralen, Tangen Senter", description));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Boklyst","Tangenten, krange", description));
        hvaSkjerArray.add(new HvaSkjer("Man 14.01","19.00","Fransk samtalegruppe","Tangenten, krange", description));

        for (int i = 0; i < 100; i++) {
            hvaSkjerArray.add(new HvaSkjer("Ons 14.01","16.00","App programmering","Frivillighetssentralen, Tangen Senter", description));
        }
        return hvaSkjerArray;
    }
}
