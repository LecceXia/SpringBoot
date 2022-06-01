import java.sql.*;
import java.util.Arrays;

public class MyJDBC {
    private static final String SQL_CREATE = "CREATE TABLE InternShipProgram"+"("+"Id serial,"+"Name varchar(200),"+"Course varchar(255),"+"Primary key(id)"+")";

    private static final String SQL_INSERT = "INSERT INTO INTERNSHIPPROGRAM(ID,NAME,COURSE) VALUES(?,?,?)";

    private static final String SQL_UPDATE = "UPDATE InternShipProgram SET COURSE = ? where name = ?";

    public static void main(String[] args){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xjn19961219");
            PreparedStatement psCreate = connection.prepareStatement(SQL_CREATE);
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE)){

            connection.setAutoCommit(false);
            psCreate.execute();

            psInsert.setInt(1,1);
            psInsert.setString(2,"xjn1");
            psInsert.setString(3,"java1");
            psInsert.addBatch();

            psInsert.setInt(1,2);
            psInsert.setString(2,"xjn2");
            psInsert.setString(3,"java2");
            psInsert.addBatch();

            psInsert.setInt(1,3);
            psInsert.setString(2,"xjn3");
            psInsert.setString(3,"java3");
            psInsert.addBatch();

            int[] rows = psInsert.executeBatch();
            System.out.println("Insert");
            System.out.println(Arrays.toString(rows));


            //run losts of update commands
            psUpdate.setString(1,"java full stack1");
            psUpdate.setString(2,"xjn1");
            psUpdate.addBatch();

            psUpdate.setString(1,"java full stack2");
            psUpdate.setString(2,"xjn2");
            psUpdate.addBatch();

            psUpdate.setString(1,"java full stack3");
            psUpdate.setString(2,"xjn3");
            psUpdate.addBatch();

            int[] rows2 = psUpdate.executeBatch();
            System.out.println("Update");
            System.out.println(Arrays.toString(rows2));



            connection.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
