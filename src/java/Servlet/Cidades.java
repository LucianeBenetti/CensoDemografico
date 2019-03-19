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
        abrirArquivo.readFully(dados);

        String conteudoArquivo = new String(dados);
        String[] c = conteudoArquivo.split(";");
        ArrayList<String> cidades = new ArrayList<String>();
        for (int i = 0; i < c.length; i++) {
            cidades.add(c[i]);
        }
        
          
      // File conteudoCidades = null;
//        switch (cidades.toString()) {
//            case "Rio Branco":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\rioBranco.txt");
//                break;
//            case "Maceio":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\maceio.txt");
//                break;
//            case "Macapa":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\macapa.txt");
//                break;
//            case "Manaus":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\manaus.txt");
//                break;
//            case "Salvador":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\salvador.txt");
//                break;
//            case "Fortaleza":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\fortaleza.txt");
//                break;
//            case "Brasilia":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\brasilia.txt");
//                break;
//            case "Vitoria":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\vitoria.txt");
//                break;
//            case "Goiania":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\goiania.txt");
//                break;
//            case "Sao Luis":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\saoLuis.txt");
//                break;
//            case "Cuiaba":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\cuiaba.txt");
//                break;
//            case "Campo Grande":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\campoGrande.txt");
//                break;
//            case "Belo Horizonte":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\beloHorizonte.txt");
//                break;
//            case "Belem":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\belem.txt");
//                break;
//            case "Joao Pessoa":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\joaoPessoa.txt");
//                break;
//            case "Curitiba":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\curitiba.txt");
//                break;
//            case "Recife":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\recife.txt");
//                break;
//            case "Terezina":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\terezina.txt");
//                break;
//            case "Rio de Janeiro":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\rioDeJaneiroCidade.txt");
//                break;
//            case "Natal":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\natal.txt");
//                break;
//            case "Porto Alegre":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\portoAlegre.txt");
//                break;
//            case "Porto Velho":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\portoVelho.txt");
//                break;
//            case "Boa Vista":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\boaVista.txt");
//                break;
//            case "Florianopolis":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\florianopolis.txt");
//                break;
//            case "Sao Paulo":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\saoPauloCidade.txt");
//                break;
//            case "Aracaju":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\aracaju.txt");
//                break;
//            case "Palmas":
//                conteudoCidades = new File("C:\\SENAC\\Lista3\\palmas.txt");
//                break;
//            default:
//                System.out.println("Não foi encontrada a cidade!");
//        }
//
//        FileInputStream arquivo = new FileInputStream(conteudoCidades);
//        DataInputStream lerArquivo = new DataInputStream(arquivo);
//        byte[] bytes = new byte[arquivo.available()];
//        lerArquivo.readFully(bytes);
//        String conteudo = new String(bytes);
//        
//        System.out.println(conteudo);

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
