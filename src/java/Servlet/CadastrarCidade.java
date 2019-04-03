package Servlet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarCidade extends HttpServlet {

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
        String novoEstado = request.getParameter("novoEstado");
        String novaCidade = request.getParameter("novaCidade");

        File arquivoEstado = new File("C:\\SENAC\\Lista3\\" + novoEstado + "_" + ".txt");

        FileInputStream identicarArquivo = new FileInputStream(arquivoEstado);
        DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
        byte[] dados = new byte[identicarArquivo.available()];
        abrirArquivo.read(dados);
        String conteudoArquivo = new String(dados);
        String conteudo = "";
        if (conteudoArquivo.contains(new String(dados))) {
            conteudo += conteudoArquivo;
        }

        FileOutputStream encontrarArquivo = new FileOutputStream(arquivoEstado);
        DataOutputStream acessarArquivo = new DataOutputStream(encontrarArquivo);
        acessarArquivo.writeBytes(conteudo + ";" + novaCidade);

        FileWriter cidade = new FileWriter("C:\\SENAC\\Lista3\\" + novaCidade + ".txt");

        File dadosCidade = new File("C:\\SENAC\\Lista3\\" + novaCidade + ".txt");

        FileOutputStream encontrarCidade = new FileOutputStream(dadosCidade);
        DataOutputStream acessarCidade = new DataOutputStream(encontrarCidade);
        acessarCidade.writeBytes ("0" + ";" + "0" + ";"+ "0" + ";"+ "0");
        cidade.close();

        String fullPath = arquivoEstado.getAbsolutePath();
        request.setAttribute("caminho", fullPath);
        request.getRequestDispatcher("censoDemograficoAutenticado.jsp").forward(request, response);
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
