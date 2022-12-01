package test12;

public class User
{
    private String username;
    private String pwd;
    private String eamil;
    private String phonenum;

    public User(String username, String pwd, String eamil, String phonenum)
    {
        this.username = username;
        this.pwd = pwd;
        this.eamil = eamil;
        this.phonenum = phonenum;
    }

    public User()
    {

    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }

    public String getEamil()
    {
        return eamil;
    }

    public void setEamil(String eamil)
    {
        this.eamil = eamil;
    }

    public String getPhonenum()
    {
        return phonenum;
    }

    public void setPhonenum(String phonenum)
    {
        this.phonenum = phonenum;
    }
}
