class Account {
    final long balance;
    final String ownerName;
    final boolean locked;

    Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}