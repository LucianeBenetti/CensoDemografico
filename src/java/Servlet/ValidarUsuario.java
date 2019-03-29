package Servlet;

import Classes.Pessoas;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import sun.misc.BASE64Encoder;

public class ValidarUsuario extends HttpServlet {

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
        
        File arquivoUsuarios = new File("C:\\SENAC\\Lista3\\usuariosCadastrados.txt");

        FileInputStream identicarArquivo = new FileInputStream(arquivoUsuarios);
        DataInputStream abrirArquivo = new DataInputStream(identicarArquivo);
        byte[] dados = new byte[identicarArquivo.available()];
        abrirArquivo.read(dados);
        String conteudoArquivo = new String(dados);
        String[] usuarios = conteudoArquivo.split("\n");
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
        
        for (int i = 0; i < usuariosCadastrados.size(); i++) {
            Pessoas pessoa = usuariosCadastrados.get(i);
            String senha =MD5(password);
           
            if (pessoa.getLogin().equals(login) && pessoa.getSenha().equals(senha)) {;
                request.setAttribute("login", login);
                request.setAttribute("senha", (MD5(password)));
                
            } else {
                
                request.getRequestDispatcher("cadastrarUsuarios.jsp").forward(request, response);
                System.out.print("Usuário não cadastrado");
            }
        }
        request.getRequestDispatcher("censoDemografico.jsp").forward(request, response);
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
