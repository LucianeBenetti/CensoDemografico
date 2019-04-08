package Servlet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarCidade extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String estadoCadastrarCidade = request.getParameter("estadoCadastrarCidade");
        String novaCidade = request.getParameter("novaCidade");

        File arquivoEstado = new File("C:\\SENAC\\Lista3\\" + estadoCadastrarCidade + "_" + ".txt");

        FileInputStream identicarArquivo = new FileInputStream(arquivoEstado);
        DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
        byte[] dados = new byte[identicarArquivo.available()];
        abrirArquivo.read(dados);
        String conteudoArquivo = new String(dados);
        String conteudo = "";
        if (conteudoArquivo.contains(new String(dados))) {
            conteudo += conteudoArquivo;
        }

//        ArrayList<String> validar = new ArrayList<String>();
//        String[] cidade = conteudo.split(";");
//        for (int i = 0; i < cidade.length; i++) {
//            validar.add(cidade[i]);
//        }
//
//        String validarCidade = "";
//        for (int i = 0; i < validar.size(); i++) {
//            validarCidade = validar.get(i);
//        }
//        if (novaCidade.equals(validarCidade)) {
//            request.getRequestDispatcher("cadastrarCidade.jsp").forward(request, response);
//
//        } else {
            FileOutputStream encontrarArquivo = new FileOutputStream(arquivoEstado);
            DataOutputStream acessarArquivo = new DataOutputStream(encontrarArquivo);
            acessarArquivo.writeBytes(novaCidade + ";" + conteudo);

            FileWriter cidadeNova = new FileWriter("C:\\SENAC\\Lista3\\" + novaCidade + ".txt");

            File dadosCidade = new File("C:\\SENAC\\Lista3\\" + novaCidade + ".txt");

            FileOutputStream encontrarCidade = new FileOutputStream(dadosCidade);
            DataOutputStream acessarCidade = new DataOutputStream(encontrarCidade);
            acessarCidade.writeBytes("0" + ";" + "0" + ";" + "0" + ";" + "0");
            cidadeNova.close();

            String fullPath = arquivoEstado.getAbsolutePath();
            request.setAttribute("caminho", fullPath);

        //}
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
