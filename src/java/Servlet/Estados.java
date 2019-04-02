package Servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Estados extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String enviar = request.getParameter("conteudo");

        File arquivoEstados = new File("C:\\SENAC\\Lista3\\estados.txt");

        FileInputStream encontrarArquivo = new FileInputStream(arquivoEstados);
        DataInputStream abrirArquivo = new DataInputStream(encontrarArquivo);
        byte[] dados = new byte[encontrarArquivo.available()];
        abrirArquivo.read(dados);

        String conteudoArquivo = new String(dados);
        String[] e = conteudoArquivo.split(";");
        ArrayList<String> estados = new ArrayList<String>();
        for (int i = 0; i < e.length; i++) {
            estados.add(e[i]);
        }

        int tamanho = estados.size();
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) { 
                if (estados.get(j).compareTo(estados.get(j + 1)) > 0) {
                    String auxiliar = estados.get(j);
                    estados.set(j, estados.get(j + 1));
                    estados.set(j + 1, auxiliar);
                }
            }
        }
        request.setAttribute("lista", estados);
       
        String page=request.getSession().getAttribute("user")==null ? "censoDemografico.jsp" : "censoDemograficoAutenticado.jsp";
        request.getRequestDispatcher(page).forward(request, response);
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
