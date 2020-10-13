class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        String join = java.util.stream.Stream.of(firstName, lastName)
                .filter(java.util.function.Predicate.not(String::isEmpty))
                .collect(java.util.stream.Collectors.joining(" "));
        return join.isEmpty() ? "Unknown" : join;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("first");
        user.setLastName("last");
        print(user);

        user = new User();
        user.setFirstName("first");
        print(user);

        user = new User();
        user.setLastName("last");
        print(user);

        user = new User();
        print(user);
    }

    static void print(User user) {
        System.out.printf("user: [%s]\n", user.getFullName());
    }
}