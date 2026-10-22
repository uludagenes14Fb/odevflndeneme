void main() {

    /*
    int vize1 = 60;
    int vize2 = 70;
    int finalnot = 75;

    double ort = (vize1+vize2+finalnot+finalnot)/4;

    System.out.println(ort);
    double olmadan süper bir taktikle ortalama aldım*/

    double vize1 = 60.0;
    double vize2 = 70.0;
    double finalnot = 75.0;

    double ort = (vize1*0.25) + (vize2*0.25) + (finalnot*0.5);

    System.out.println(ort);

    if (ort >= 85) {

        System.out.println("Takdir Aldın.");
    }
    else if (ort >= 75) {

        System.out.println("Teşekkür ALdın.");
    }
    else if (ort >= 50) {

        System.out.println("Geçtin.");
    }
    else {

        System.out.println("Kaldın");
    }


    //umarım olmuştur. Kolay gelsin:)
}