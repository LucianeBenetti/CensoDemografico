package Servlet;

import Classes.Pessoas;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.misc.BASE64Encoder;

public class ValidarUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String login = request.getParameter("nome");
        String password = MD5(request.getParameter("senha"));

        File arquivoUsuarios = new File("C:\\SENAC\\Lista3\\usuariosCadastrados.txt");

        FileInputStream identicarArquivo = new FileInputStream(arquivoUsuarios);
        DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
        byte[] dados = new byte[identicarArquivo.available()];
        abrirArquivo.read(dados);
        String conteudoArquivo = new String(dados);
        String[] usuarios = conteudoArquivo.split("\r\n");
        ArrayList<Pessoas> usuariosCadastrados = new ArrayList<Pessoas>();

        for (int i = 0; i < usuarios.length; i++) {
            String usuario = usuarios[i];
            String[] campos = usuario.split(";");
            String log = campos[0];
            String senhas = campos[1];
            Pessoas p = new Pessoas(log, senhas);
            usuariosCadastrados.add(p);
        }

        System.out.println(usuariosCadastrados);

        String log = "";
        String senha = "";
        for (int j = 0; j < usuariosCadastrados.size(); j++) {
            log = usuariosCadastrados.get(j).getLogin();
            senha = usuariosCadastrados.get(j).getSenha();
            //  }      
            System.out.println(log);

            if ((login.equals(log)) && (password.equals(senha))) {
                request.setAttribute("login", login);

                HttpSession session = request.getSession();
                session.setAttribute("user", login);
                session.setMaxInactiveInterval(300);
                request.getRequestDispatcher("censoDemograficoAutenticado.jsp").forward(request, response);
                // request.getRequestDispatcher("WEB-INF/censoDemograficoAutenticado.jsp").forward(request, response);
            }
            //else {
        }
        request.getRequestDispatcher("cadastrarUsuarios.jsp").forward(request, response);

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
