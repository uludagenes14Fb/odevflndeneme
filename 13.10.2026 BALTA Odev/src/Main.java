void main() {

    /*
    int vize1 = 60;
    int vize2 = 70;
    int finalnot = 75;

    double ort = (vize1+vize2+finalnot+finalnot)/4;

    System.out.println(ort);
    double olmadan süper bir taktikle ortalama aldım*/

    String takdir = "Takdir Aldın." ;
    String tesekkur = "Teşekkür ALdın." ;
    String gecti = "Geçtin." ;
    String kaldi = "Kaldın." ;

    double vize1 = 60.0;
    double vize2 = 70.0;
    double finalnot = 75.0;

    double ort = (vize1*0.25) + (vize2*0.25) + (finalnot*0.5);

    System.out.println(ort);

    if (ort >= 85) {

        System.out.println(takdir);
    }
    else if (ort >= 75) {

        System.out.println(tesekkur);
    }
    else if (ort >= 50) {

        System.out.println(gecti);
    }
    else {

        System.out.println(kaldi);
    }


    //umarım olmuştur. Kolay gelsin:)
}