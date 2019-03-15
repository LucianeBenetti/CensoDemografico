package Servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cidades extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String estado = request.getParameter("selecionaEstado");
        System.out.print(estado);
//        String ac = request.getParameter("AC");       
//        String al = request.getParameter("AL"); 
//        String ap = request.getParameter("AP"); 
//        String am = request.getParameter("AM"); 
//        String ba = request.getParameter("BA"); 
//        String ce = request.getParameter("CE"); 
//        String df = request.getParameter("DF"); 
//        String es = request.getParameter("ES"); 
//        String go = request.getParameter("GO"); 
//        String ma = request.getParameter("MA"); 
//        String mt = request.getParameter("MT");
//        String ms = request.getParameter("MS"); 
//        String mg = request.getParameter("MG"); 
//        String pa = request.getParameter("PA"); 
//        String pb = request.getParameter("PB"); 
//        String pr = request.getParameter("PR");
//        String pe = request.getParameter("PE");
//        String pi = request.getParameter("PI");
//        String rj = request.getParameter("RJ");
//        String rn = request.getParameter("RN");
//        String rs = request.getParameter("RS");
//        String ro = request.getParameter("RO"); 
//        String rr = request.getParameter("RR");
//        String sc = request.getParameter("SC");
//        String sp = request.getParameter("SP");
//        String se = request.getParameter("SE");
//        String to = request.getParameter("TO");

       // if (enviar != null) {
//            File arquivoCidades = new File("C:\\SENAC\\Lista3\\alagoas.txt");
//
//            FileInputStream encontrarArquivo = new FileInputStream(arquivoCidades);
//            DataInputStream abrirArquivo = new DataInputStream(encontrarArquivo);
//            byte[] dados = new byte[encontrarArquivo.available()];
//            abrirArquivo.read(dados);
//
//            String conteudoArquivo = new String(dados);
//            String[] c = conteudoArquivo.split(";");
//            ArrayList<String> cidades = new ArrayList<String>();
//            for (int i = 0; i < c.length; i++) {
//                cidades.add(c[i]);
//            }
//
//            System.out.println(cidades);
//            System.out.println("Tamanho: " + cidades.size());
//
//            request.setAttribute("listaCidades", cidades);
//       // }
//
//        request.getRequestDispatcher("censoDemografico.jsp").forward(request, response);

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
