
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection myCon = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try{
            myCon =  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            System.out.println("Conexion establecida");

            myStmt = myCon.createStatement();
            myRs = myStmt.executeQuery("select * from employees");
            while(myRs.next()){
               System.out.println(myRs.getString("first_name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al conectar");
        }
    }
}