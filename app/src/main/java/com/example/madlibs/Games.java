package com.example.madlibs;

public class Games {


    public static String madLibs(String personName, String personAdj, String profName, String personLastPartner, String lastPartnerAdj, String verb, String labNoun, String adj2) {

        String madLibsText = "Hi, my name is " + personName + " and I am looking for a new, " + personAdj + " lab partner for Mrs. " + profName + "'s biology class.\nMy last lab partner, " + personLastPartner + ", was really " + lastPartnerAdj + " and never " + verb + " our experiments on time.\nSo I asked to switch, and the teacher said if I wanted another " + labNoun + " partner, I had to find one all by myself.\n If you are smart, " + personAdj + " in school, and always turn your " + labNoun + "-work in time, you'd be a/an " + adj2 + " lab partner for me.\nPlease contact me if you're " + personAdj + " about science and love doing scientific " + labNoun + "s.\nIf this describes you, please contact me at scienceluvr1@-" + personAdj + "-mail.com, or just find me by my locker after lunch.";

        return madLibsText;
    }

}