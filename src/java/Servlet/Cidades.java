package Servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        System.out.print(estado);
        File arquivoCidades = null;

        switch (estado) {
            case "AC":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\acre.txt");
                break;
            case "AL":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\alagoas.txt");
                break;
            case "AP":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\amapa.txt");
                break;
            case "AM":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\amazonas.txt");
                break;
            case "BA":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\bahia.txt");
                break;
            case "CE":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ceara.txt");
                break;
            case "DF":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\distritoFederal.txt");
                break;
            case "ES":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\espiritoSanto.txt");
                break;
            case "GO":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\goias.txt");
                break;
            case "MA":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\maranhao.txt");
                break;
            case "MT":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\matoGrosso.txt");
                break;
            case "MS":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\matoGrossoDoSul.txt");
                break;
            case "MG":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\minasGerais.txt");
                break;
            case "PA":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\para.txt");
                break;
            case "PB":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\paraiba.txt");
                break;
            case "PR":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\parana.txt");
                break;
            case "PE":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\pernambuco.txt");
                break;
            case "PI":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\piaui.txt");
                break;
            case "RJ":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rioDeJaneiro.txt");
                break;
            case "RN":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rioGrandeDoNorte.txt");
                break;
            case "RS":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rioGrandeDoSul.txt");
                break;
            case "RO":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rondonia.txt");
                break;
            case "RR":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\roraima.txt");
                break;
            case "SC":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\santaCatarina.txt");
                break;
            case "SP":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\saoPaulo.txt");
                break;
            case "SE":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\sergipe.txt");
                break;
            case "TO":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\tocantins.txt");

            default:
                System.out.println("Por favor. digite um estado!");
        }
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
