package DesignPatterns.StructuralDesignPatterns.Facade;

public class OrderDto {
    private String productId;
    private int quantity;
    private String cardDetails;
    private String address;

    public OrderDto(String productId, int quantity, String cardDetails, String address) {
        this.productId = productId;
        this.quantity = quantity;
        this.cardDetails = cardDetails;
        this.address = address;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
