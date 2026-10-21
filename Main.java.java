public class Main {
    public static void main(String[] args) {
        Package standardPackage = new Package(
                "Ahmet Yılmaz", "Atatürk Cad. No:5", "Ankara", "Çankaya", "06100",
                "Mehmet Demir", "İnönü Cad. No:12", "İstanbul", "Kadıköy", "34710",
                10.0, 2.5
        );

        TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Ayşe Kaya", "Cumhuriyet Mah. No:8", "İzmir", "Konak", "35220",
                "Fatma Çelik", "Bağdat Cad. No:44", "İstanbul", "Maltepe", "34840",
                10.0, 2.5, 5.0
        );

        OvernightPackage overnightPackage = new OvernightPackage(
                "Ali Can", "Gazi Bulvarı No:19", "Bursa", "Nilüfer", "16140",
                "Zeynep Şahin", "Mithatpaşa Cad. No:3", "Eskişehir", "Tepebaşı", "26120",
                10.0, 2.5, 1.2
        );

        System.out.printf("Standart Paket Maliyeti: %.2f TL%n", standardPackage.calculateCost());
        System.out.printf("İki Günlük Paket Maliyeti: %.2f TL%n", twoDayPackage.calculateCost());
        System.out.printf("Gece Teslimatı Paket Maliyeti: %.2f TL%n", overnightPackage.calculateCost());
    }
}