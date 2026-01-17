public class Client extends Person {
    private String clientId;

    public Client(String name, int age, String clientId) {
        super(name, age);
        this.clientId = clientId;
    }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    @Override
    public void info() {
        System.out.println("Name: " + getName() +
                ". Age: " + getAge() +
                ". ClientID: " + clientId);
    }
}
