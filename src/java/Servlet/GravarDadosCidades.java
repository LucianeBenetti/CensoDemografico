package Servlet;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GravarDadosCidades extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        for (int i = 0; i < 8; i++) {
            String nomeCidade = request.getParameter("cidade_"+i);
            String populacao = request.getParameter("populacao_"+i);
            String area = request.getParameter("area_"+i);
            String densidade = request.getParameter("densidade_"+i);
            String pib = request.getParameter("pib_"+i);
            System.out.println(nomeCidade);
            
            File arquivoCidades = new File("C:\\SENAC\\Lista3\\" + nomeCidade + ".txt");

            if ((populacao != null) || (area != null) || (densidade != null) || (pib != null)) {

                FileOutputStream identicarArquivo = new FileOutputStream(arquivoCidades);
                DataOutputStream abrirArquivo = new DataOutputStream(identicarArquivo);
                abrirArquivo.writeBytes(populacao + ";" + area + ";" + densidade + ";" + pib);
                

                String fullPath = arquivoCidades.getAbsolutePath();
                request.setAttribute("caminho", fullPath);
            }
        }
        request.getRequestDispatcher("WEB-INF/censoDemograficoAutenticado.jsp").forward(request, response);

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
