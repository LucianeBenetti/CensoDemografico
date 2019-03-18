/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.DataOutputStream;
import java.io.File;
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
        try (PrintWriter out = response.getWriter()) {

            String nomeCidade1 = request.getParameter("cidade1");
            String populacao1 = request.getParameter("pop1");
            String area1 = request.getParameter("area1");
            String densidade1 = request.getParameter("dens1");
            String pib1 = request.getParameter("pib1");
            
            String nomeCidade2 = request.getParameter("cidade2");
            String populacao2 = request.getParameter("pop2");
            String area2 = request.getParameter("area2");
            String densidade2 = request.getParameter("dens2");
            String pib2 = request.getParameter("pib2");
            
            String nomeCidade3 = request.getParameter("cidade3");
            String populacao3 = request.getParameter("pop3");
            String area3 = request.getParameter("area3");
            String densidade3 = request.getParameter("dens3");
            String pib3 = request.getParameter("pib3");
            
            String nomeCidade4 = request.getParameter("cidade4");
            String populacao4 = request.getParameter("pop4");
            String area4 = request.getParameter("area4");
            String densidade4 = request.getParameter("dens4");
            String pib4 = request.getParameter("pib4");

            File arquivoCidades = null;

            switch (nomeCidade1) {
                case "Rio Branco":
                    arquivoCidades = new File("C:\\SENAC\\Lista3\\rioBranco.txt");
                    break;
                case "Cruzeiro do Sul":
                    arquivoCidades = new File("C:\\SENAC\\Lista3\\cruzeiroDoSul.txt");
                    break;
                case "Xapuri":
                    arquivoCidades = new File("C:\\SENAC\\Lista3\\xapuri.txt");
                    break;
                case "Brasileia":
                    arquivoCidades = new File("C:\\SENAC\\Lista3\\brasileia.txt");
                    break;
                default:
                    System.out.println("Não foi encontrada a cidade!");
            }

            FileOutputStream identicarArquivo = new FileOutputStream(arquivoCidades);
            DataOutputStream abrirArquivo = new DataOutputStream(identicarArquivo);

            abrirArquivo.writeBytes(populacao1 + ";" + area1 + ";" + densidade1 + ";" + pib1);
            abrirArquivo.close();
            identicarArquivo.close();

//            Boolean arquivoGravado = arquivoCidades.exists();

//            if (arquivoGravado = true) {
//                request.setAttribute("arquivoGravado", arquivoGravado);
//            }
//            request.getRequestDispatcher("censoDemografico.jsp").forward(request, response);

            System.out.println(populacao1);

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
