
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/**
 *
 * @author Deepank-PC
 */
@WebServlet(urlPatterns = {"/goods"})

@MultipartConfig(fileSizeThreshold = 1024*1024*10,maxFileSize = 1024*1024*50,
        maxRequestSize = 1024*1024*100)

public class goods extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          if( request.getParameter("submit1")!=null)
          {
				try {

                String id = request.getParameter("t1");
                String price = request.getParameter("t2");
                Part filePart = request.getPart("t3");
                InputStream ins = null;
                if (filePart != null) {
                    ins = filePart.getInputStream();
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                String sql = "insert into shakestock(id,price,pic)values(?,?,?) ";
                PreparedStatement st = con.prepareStatement(sql);
                st.setInt(1, Integer.parseInt(id));
                st.setString(2, price);
                st.setBlob(3, ins);
                int re = st.executeUpdate();
                if (re >= 0) {
                    out.println("save successfully");
                }
            } catch (Exception ex) {
                out.println("error " + ex);
            }
          }
          else if(request.getParameter("submit2")!=null){
            int id = Integer.parseInt(request.getParameter("t1"));
              try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st=con.createStatement();
                String sql = "delete from shakestock where id='"+id+"'";
                int re = st.executeUpdate(sql);
                if(re>0){
                    out.println("delete sucess");
                }
                else{
                    out.println("no id found in database");
                }  
              }
              catch(Exception ex){
                  out.println("error"+ex);
              }
          }
          else if( request.getParameter("submit3")!=null)
          {
				try {

                String id = request.getParameter("t1");
                String price = request.getParameter("t2");
                Part filePart = request.getPart("t3");
                InputStream ins = null;
                if (filePart != null) {
                    ins = filePart.getInputStream();
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                String sql = "insert into shakestock1(id,price,pic)values(?,?,?) ";
                PreparedStatement st = con.prepareStatement(sql);
                st.setInt(1, Integer.parseInt(id));
                st.setString(2, price);
                st.setBlob(3, ins);
                int re = st.executeUpdate();
                if (re >= 0) {
                    out.println("save successfully in big format");
                }
            } catch (Exception ex) {
                out.println("error " + ex);
            }
          }
          else if(request.getParameter("submit4")!=null){
            int id = Integer.parseInt(request.getParameter("t1"));
              try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computer", "root", "akrati");
                Statement st=con.createStatement();
                String sql = "delete from shakestock1 where id='"+id+"'";
                int re = st.executeUpdate(sql);
                if(re>0){
                    out.println("delete sucess from big");
                }
                else{
                    out.println("no id found in database");
                }  
              }
              catch(Exception ex){
                  out.println("error"+ex);
              }
          }
          
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
