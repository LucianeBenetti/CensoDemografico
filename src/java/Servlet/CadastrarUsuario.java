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
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.misc.BASE64Encoder;

/**
 *
 * @author 80130917
 */
public class CadastrarUsuario extends HttpServlet {

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

        String login = request.getParameter("nome");
        String password = request.getParameter("senha");
        
        if ((login != null) || (password != null)) {
            
            File arquivoUsuarios = new File("C:\\SENAC\\Lista3\\usuariosCadastrados.txt");

            FileInputStream identicarArquivo = new FileInputStream(arquivoUsuarios);
            DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
            byte[] dados = new byte[identicarArquivo.available()];
            abrirArquivo.read(dados);
            String conteudoArquivo = new String(dados);
            String conteudo = "";
            if (conteudoArquivo.contains(new String(dados))) {
                conteudo += conteudoArquivo;
            }
            
            FileOutputStream encontrarArquivo = new FileOutputStream(arquivoUsuarios);
            DataOutputStream acessarArquivo = new DataOutputStream(encontrarArquivo);
            acessarArquivo.writeBytes(conteudo + login + ";" + MD5(password) + "\r\n");

            String fullPath = arquivoUsuarios.getAbsolutePath();
            request.setAttribute("caminho", fullPath);
        }
        request.getRequestDispatcher("telaDeLogin.jsp").forward(request, response);

    }

    public String MD5(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(senha.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(digest.digest());
        } catch (NoSuchAlgorithmException ns) {
            ns.printStackTrace();
        }
        return senha;
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
