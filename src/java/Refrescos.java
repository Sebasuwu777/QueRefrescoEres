/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chemi
 */
@WebServlet(urlPatterns = {"/Refrescos"})
public class Refrescos extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>!Eres un refresco?</title>"); 
            String refresco = request.getParameter("mes");
            String tip_refresco = null;
            out.println("<style>html{background: #F1FEEC}</style>");
            out.print("<style> .hover-img {\n" +
"  color: #fff;\n" +
"  display: inline-block;\n" +
"  margin: 8px;\n" +
"  left: 25%; \n" +
"  max-width: 700px;\n" +
"  min-width: 600px;\n" +
"  overflow: hidden;\n" +
"  position: relative;\n" +
"  text-align: center;\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".hover-img * {\n" +
"  box-sizing: border-box;\n" +
"  transition: all 0.45s ease;\n" +
"}\n" +
"\n" +
".hover-img:before,\n" +
".hover-img:after {\n" +
"  background-color: rgba(0, 0, 0, 0.5);\n" +
"  border-top: 32px solid rgba(0, 0, 0, 0.5);\n" +
"  border-bottom: 32px solid rgba(0, 0, 0, 0.5);\n" +
"  position: absolute;\n" +
"  top: 0;\n" +
"  bottom: 0;\n" +
"  left: 0;\n" +
"  right: 0;\n" +
"  content: '';\n" +
"  transition: all 0.3s ease;\n" +
"  z-index: 1;\n" +
"  opacity: 0;\n" +
"  transform: scaleY(2);\n" +
"}\n" +
"\n" +
".hover-img img {\n" +
"  vertical-align: top;\n" +
"  max-width: 100%;\n" +
"  backface-visibility: hidden;\n" +
"}\n" +
"\n" +
".hover-img figcaption {\n" +
"  position: absolute;\n" +
"  top: 0;\n" +
"  bottom: 0;\n" +
"  left: 0;\n" +
"  right: 0;\n" +
"  align-items: center;\n" +
"  z-index: 1;\n" +
"  display: flex;\n" +
"  flex-direction: column;\n" +
"  justify-content: center;\n" +
"  line-height: 1.1em;\n" +
"  opacity: 0;\n" +
"  z-index: 2;\n" +
"  transition-delay: 0.1s;\n" +
"  font-size: 24px;\n" +
"  font-family: sans-serif;\n" +
"  font-weight: 400;\n" +
"  letter-spacing: 1px;\n" +
"  text-transform: uppercase;\n" +
"}\n" +
"\n" +
".hover-img:hover:before,\n" +
".hover-img:hover:after {\n" +
"  transform: scale(1);\n" +
"  opacity: 1;\n" +
"}\n" +
"\n" +
".hover-img:hover > img {\n" +
"  opacity: 0.7;\n" +
"}\n" +
"\n" +
".hover-img:hover figcaption {\n" +
"  opacity: 1;\n" +
"}</style>");
            out.println("</head>");
            out.println("<body>");
            if ("Enero".equals(refresco) || "enero".equals(refresco)){
                tip_refresco = "Jarrito";
                out.println("<center><h1>¡"+"Eres un " + tip_refresco +"!:0</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='jarritos.jpg' alt='jarritos'>");
                out.println("</div><figcaption>");
                out.println("<p>- Odias tu vida. \n<br>" +
"- Eres adicto a los juegos de video. \n<br>" +
"- Le agradas a mucha gente. \n<br>" +
"- Todo te da risa.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Febrero".equals(refresco) || "febrero".equals(refresco)){
                tip_refresco = "Delaware Punch";
                out.println("<center><h1>¡"+"Eres un " + tip_refresco +"!:0</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='delaware.jpg' alt='delaware'>");
                out.println("</div><figcaption>");
                out.println("<p>- Casi nadie te conoce. \n<br>" +
"- Eres de la vieja escuela.\n<br>" +
"- Dejas todo al último. \n<br>" +
"- Eres de buenos gustos.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Marzo".equals(refresco) || "marzo".equals(refresco)){
                tip_refresco = "Red Cola";
                out.println("<center><h1>¡"+"Eres una " + tip_refresco +"!:0</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='RedCola.jpg' alt='RedCola'>");
                out.println("</div><figcaption>");
                out.println("<p>- Solo te quieren por interés. \n <br>" +
"- Eres la segunda opción de todos. \n <br>" +
"- No te invitan a fiestas. \n <br>" +
"- Vives debajo de un puente. </p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }

            if ("".equals(refresco))
                out.println("<center><h1>¿Qué esperas para responder?</h1></center>");
            
            out.println("</body>");
            out.println("</html>");
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