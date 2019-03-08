package com.sectiontutorials.Database;

import java.sql.*;

public class DataAccess {

    public static void main(String[] args){
        displayJob ();
    }

    static void displayJob(){
        Connection conn = null; // DB 연걸된 상태를 담은 객체
        //Statement stmt = null;
        PreparedStatement pstm = null; //SQL 명령어 나타내는 객체
        ResultSet rset = null; //Query를 날리면(select문을 실행하면) 리턴되는 값을 담을 객체

        try{
            String quary = "select * from employee";

            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement ( quary);
            rset = pstm. executeQuery ();

            //stmt = conn.createStatement ();
            //stmt.executeQuery ( quary );
            // rset = pstm.executeQuery();
            //rset =stmt.getResultSet ();

            while(rset.next()){

                int eid = rset.getInt(1);
                String name = rset.getString(2);
                float commrate = rset.getFloat(3);

                String result = eid+"\t"+name+"\t"+commrate+"\t";
                System.out.println(result);
            }
        } catch (SQLException sqle){
            System.out.println("Error in SQL");
            sqle.printStackTrace();
        } finally {
            //exit DB connection
            try {
                if(rset!= null){
                    rset.close();
                }
                if (pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }

    }
}
