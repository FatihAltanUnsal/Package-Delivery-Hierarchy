public class OvernightPackage extends Package {
    private double additionalFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        super(senderName, senderAddress, senderCity, senderState, senderZip,
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
              weight, costPerOunce);

        if (additionalFeePerOunce >= 0.0) {
            this.additionalFeePerOunce = additionalFeePerOunce;
        } else {
            throw new IllegalArgumentException("Ons başına ek ücret negatif olamaz.");
        }
    }

    @Override
    public double calculateCost() {
        return getWeight() * (getCostPerOunce() + additionalFeePerOunce);
    }
}