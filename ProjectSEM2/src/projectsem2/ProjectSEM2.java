package projectsem2;



public class ProjectSEM2 {
     public static  GUI.frmDangNhap frmTC=new GUI.frmDangNhap();
     public static Data.ConnectDB connection = new  Data.ConnectDB ();

    public static void main(String[] args) {
       GUI.frmDangNhap frmDN= new   GUI.frmDangNhap();
  
       frmDN.show();
    }
}