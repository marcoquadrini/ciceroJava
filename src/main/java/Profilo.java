public abstract class Profilo {
    private String id;
    private String username;
    private String email;
    private String password;
    /* Metodi generali */
    private void visualizzaProfilo(){

    }
    private void modificaProfilo(){

    }
    private void eliminaProfilo(){

    }
    public void logout(){

    }
    /* Metodi get e set */
    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
