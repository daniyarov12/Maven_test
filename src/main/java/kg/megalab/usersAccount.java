package kg.megalab;
public class usersaccount {
    private User user;
    private Account account;

    class User {
        private int id;
        private String login;
        private String FullName;
        private String email;
        private String age;
        private String gender;

        public User() {
            this.id = id;
            this.login = login;
            this.FullName = FullName;
            this.email = email;
            this.age = age;
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String FullName) {
            this.FullName = FullName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setFullname(String string) {
        }
    }
}
class Account {
    private int id;
    private String accountNumber;
    private String currency;

    public Account() {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}