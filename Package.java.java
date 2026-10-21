public class Package {
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    private double weight; // ons cinsinden
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Paket ağırlığı pozitif olmalıdır.");
        }

        if (costPerOunce > 0.0) {
            this.costPerOunce = costPerOunce;
        } else {
            throw new IllegalArgumentException("Ons başına maliyet pozitif olmalıdır.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}