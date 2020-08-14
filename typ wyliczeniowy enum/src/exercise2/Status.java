package exercise2;

public enum Status {
    NEW, PAID, SHIPPED, DELIVERED, CANCELLED;

    public String toString() {
        String result;
        switch (valueOf(name())) {
            case NEW:
                result = "zamówione";
                break;
            case PAID:
                result = "opłacone";
                break;
            case SHIPPED:
                result = "wysłane";
                break;
            case DELIVERED:
                result = "dostarczone";
                break;
            case CANCELLED:
                result = "anulowane";
                break;
            default:
                result="zagubione";
                break;
        }
        return result;
    }
}
