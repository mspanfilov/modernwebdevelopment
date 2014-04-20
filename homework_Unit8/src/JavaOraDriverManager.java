import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.util.Properties;


public class JavaOraDriverManager {

    public static void main(String args[]) {

        String url = "jdbc:oracle:thin:@//64.135.72.221:1521/xe";
        Properties props = new Properties();
        props.setProperty("user", "FARATA");
        props.setProperty("password", "farata");


        try {


            // On the server-side getting connectinon should be done by injecting
            // the DataSource object with @Resource annotation
            Connection conn = DriverManager.getConnection(url,props);

            String sql ="select sysdate as currentTime from dual";

            PreparedStatement preStatement = conn.prepareStatement(sql);

            ResultSet result = preStatement.executeQuery();

            while(result.next()){
                System.out.println("Oracle DBMS returned " +
                        result.getString("currentTime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

