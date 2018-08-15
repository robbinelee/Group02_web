package cn.gezhi.po;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer employeeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public User() {
    }

    public User(Integer id, String username, String password, Integer employeeid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.employeeid = employeeid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", employeeid=" + employeeid +
                '}';
    }
}