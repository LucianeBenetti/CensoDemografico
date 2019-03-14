package Servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cidades extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String enviar = request.getParameter("enviarEstado");

        if (enviar != null) {
            File arquivoCidades = new File("C:\\SENAC\\Lista3\\para.txt");

            FileInputStream encontrarArquivo = new FileInputStream(arquivoCidades);
            DataInputStream abrirArquivo = new DataInputStream(encontrarArquivo);
            byte[] dados = new byte[encontrarArquivo.available()];
            abrirArquivo.read(dados);

            String conteudoArquivo = new String(dados);
            String[] c = conteudoArquivo.split(";");
            ArrayList<String> cidades = new ArrayList<String>();
            for (int i = 0; i < c.length; i++) {
                cidades.add(c[i]);
            }

            System.out.println(cidades);
            System.out.println("Tamanho: " + cidades.size());

            request.setAttribute("listaCidades", cidades);
        }

        request.getRequestDispatcher("censoDemografico.jsp").forward(request, response);

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
