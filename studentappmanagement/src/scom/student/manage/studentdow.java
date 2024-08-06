package scom.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentdow {
    
    public static boolean insertstutodb(student st) {
        boolean success = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = CP.createconn();
            String q = "INSERT INTO student (sname, sphone, scity) VALUES (?, ?, ?)";
            
            pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentname());  // Set parameter 1 (sname)
            pstmt.setString(2, st.getStudentphone()); // Set parameter 2 (sphone)
            pstmt.setString(3, st.getStudentcity());  // Set parameter 3 (scity)
            
            int rowsInserted = pstmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("A new student record was inserted successfully!");
                success = true;
            } else {
                System.out.println("Failed to insert a new student record.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace(); // Print exception details (for debugging)
            // Handle the exception appropriately based on your application's requirements
            // Example: log the exception, throw a custom exception, rollback transaction, etc.
        } finally {
            // Close resources in a finally block to ensure they are released
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log exception when closing resources
            }
        }
        
        return success;
    }
}

