/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class CadastrarEstado extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String novoEstado = request.getParameter("novoEstado");
        
        File arquivoEstados = new File("C:\\SENAC\\Lista3\\estados.txt");
        
        FileInputStream identicarArquivo = new FileInputStream(arquivoEstados);
        DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
        byte[] dados = new byte[identicarArquivo.available()];
        abrirArquivo.read(dados);
        String conteudoArquivo = new String(dados);
        String conteudo = "";
        if (conteudoArquivo.contains(new String(dados))) {
            conteudo += conteudoArquivo;
        }
        
        String[] estado = conteudo.split(";");
        for (int i = 0; i < estado.length; i++) {
            String validar = estado[i];
            System.out.print(validar);
            
            if (novoEstado.equals(validar)) {
                request.getRequestDispatcher("cadastrarEstado.jsp").forward(request, response);
                
            } else {
                
                FileOutputStream encontrarArquivo = new FileOutputStream(arquivoEstados);
                DataOutputStream acessarArquivo = new DataOutputStream(encontrarArquivo);
                acessarArquivo.writeBytes(conteudo + ";" + novoEstado);
                
                FileWriter arquivo = new FileWriter("C:\\SENAC\\Lista3\\" + novoEstado + "_" + ".txt");
                arquivo.close();
            }
        }
        
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
