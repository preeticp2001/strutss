import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    static int ec=0;
    private String fname,lname,email,password;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        if(fname.isEmpty()){
            ec++;
        }
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        if(lname.isEmpty()){
            ec++;
        }
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email==""){
            ec++;
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password==""){
            ec++;
        }
        this.password = password;
    }
    public String execute() throws Exception{
        if(ec==0){
            User.Register(this);
            return "success";
        }
        else{
            return "error";
        }
    }
}
