package Servlet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class Cidades extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String estado = request.getParameter("estadoSelecionado");
        File arquivoCidades = new File("C:\\SENAC\\Lista3\\" + estado + ".txt");

        FileInputStream encontrarArquivo = new FileInputStream(arquivoCidades);
        DataInputStream abrirArquivo = new DataInputStream(encontrarArquivo);
        byte[] dados = new byte[encontrarArquivo.available()];
        abrirArquivo.readFully(dados);

        String conteudoArquivo = new String(dados);
        String[] c = conteudoArquivo.split(";");
        ArrayList<String> cidades = new ArrayList<String>();
        for (int i = 0; i < c.length; i++) {
            cidades.add(c[i]);
        }

        int tamanho = cidades.size();
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (cidades.get(j).compareTo(cidades.get(j + 1)) > 0) {
                    String auxiliar = cidades.get(j);
                    cidades.set(j, cidades.get(j + 1));
                    cidades.set(j + 1, auxiliar);
                }
            }
        }

        for (int i = 0; i < cidades.size(); i++) {
            String cidade = cidades.get(i);
            File conteudoCidades = new File("C:\\SENAC\\Lista3\\" + cidade + ".txt");

            FileInputStream arquivo = new FileInputStream(conteudoCidades);
            DataInputStream lerArquivo = new DataInputStream(arquivo);
            byte[] dadosArquivo = new byte[arquivo.available()];
            lerArquivo.readFully(dadosArquivo);
            String conteudo = new String(dadosArquivo);

            String[] conteudoCidade = conteudo.split(";");
            for (int j = 0; j < conteudoCidade.length; j++) {

                request.setAttribute(i + "populacao", conteudoCidade[0]);
                request.setAttribute(i + "area", conteudoCidade[1]);
                request.setAttribute(i + "densidade", conteudoCidade[2]);
                request.setAttribute(i + "pib", conteudoCidade[3]);

            }
            request.setAttribute("conteudo", new Integer(i));
        }

        request.setAttribute("listaCidades", cidades);
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
