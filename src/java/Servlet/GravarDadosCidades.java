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
            case "Maceio":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\maceio.txt");
                break;
            case "Macapa":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\macapa.txt");
                break;
            case "Manaus":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\manaus.txt");
                break;
            case "Salvador":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\salvador.txt");
                break;
            case "Fortaleza":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\fortaleza.txt");
                break;
            case "Brasilia":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\brasilia.txt");
                break;
            case "Vitoria":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\vitoria.txt");
                break;
            case "Goiania":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\goiania.txt");
                break;
            case "Sao Luis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\saoLuis.txt");
                break;
            case "Cuiaba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\cuiaba.txt");
                break;
            case "Campo Grande":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\campoGrande.txt");
                break;
            case "Belo Horizonte":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\beloHorizonte.txt");
                break;
            case "Belem":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\belem.txt");
                break;
            case "Joao Pessoa":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\joaoPessoa.txt");
                break;
            case "Curitiba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\curitiba.txt");
                break;
            case "Recife":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\recife.txt");
                break;
            case "Terezina":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\terezina.txt");
                break;
            case "Rio de Janeiro":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rioDeJaneiroCidade.txt");
                break;
            case "Natal":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\natal.txt");
                break;
            case "Porto Alegre":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\portoAlegre.txt");
                break;
            case "Porto Velho":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\portoVelho.txt");
                break;
            case "Boa Vista":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\boaVista.txt");
                break;
            case "Florianopolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\florianopolis.txt");
                break;
            case "Sao Paulo":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\saoPauloCidade.txt");
                break;
            case "Aracaju":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\aracaju.txt");
                break;
            case "Palmas":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\palmas.txt");
                break;
            default:
                System.out.println("Não foi encontrada a cidade!");
        }
        FileOutputStream identicarArquivo = new FileOutputStream(arquivoCidades);
        DataOutputStream abrirArquivo = new DataOutputStream(identicarArquivo);

        abrirArquivo.writeBytes(populacao1 + ";" + area1 + ";" + densidade1 + ";" + pib1);

        switch (nomeCidade2) {
            case "Cruzeiro do Sul":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\cruzeiroDoSul.txt");
                break;
            case "Maragogi":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\maragogi.txt");
                break;
            case "Cutias":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\cutias.txt");
                break;
            case "Parintins":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\parintins.txt");
                break;
            case "Ilheus":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ilheus.txt");
                break;
            case "Sobral":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\sobral.txt");
                break;
            case "Taguatinga":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\taguatinga.txt");
                break;
            case "Guarapari":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\guarapari.txt");
                break;
            case "Luziania":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\luziania.txt");
                break;
            case "Imperatriz":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\imperatriz.txt");
                break;
            case "Sorriso":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\sorriso.txt");
                break;
            case "Dourados":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\dourados.txt");
                break;
            case "Uberaba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\uberaba.txt");
                break;
            case "Santarem":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\santarem.txt");
                break;
            case "Campina Grande":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\campinaGrande.txt");
                break;
            case "Londrina":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\londrina.txt");
                break;
            case "Caruaru":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\caruaru.txt");
                break;
            case "Parnaiba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\parnaiba.txt");
                break;
            case "Angra dos Reis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\angraDosReis.txt");
                break;
            case "Mossoro":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\mossoro.txt");
                break;
            case "Pelotas":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\pelotas.txt");
                break;
            case "Vilhena":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\vilhena.txt");
                break;
            case "Pacaraima":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\pacaraima.txt");
                break;
            case "Chapeco":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\chapeco.txt");
                break;
            case "Ribeirao Preto":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ribeiraoPreto.txt");
                break;
            case "Sao Cristovao":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\saoCristovao.txt");
                break;
            case "Itabaiana":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\itabaiana.txt");
                break;
            case "Gurupi":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\gurupi.txt");
                break;
            default:
                System.out.println("Não foi encontrada a cidade!");
        }
        identicarArquivo = new FileOutputStream(arquivoCidades);
        abrirArquivo = new DataOutputStream(identicarArquivo);

        abrirArquivo.writeBytes(populacao2 + ";" + area2 + ";" + densidade2 + ";" + pib2);

        switch (nomeCidade3) {
            case "Xapuri":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\xapuri.txt");
                break;
            case "Penedo":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\penedo.txt");
                break;
            case "Ferreira Gomes":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ferreiraGomes.txt");
                break;
            case "Tabatinga":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\tabatinga.txt");
                break;
            case "Itabuna":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\itabuna.txt");
                break;
            case "Juazeiro do Norte":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\juazeiroDoNorte.txt");
                break;
            case "Ceilandia":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ceilandia.txt");
                break;
            case "Vila Velha":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\vilaVelha.txt");
                break;
            case "Anapolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\anapolis.txt");
                break;
            case "Balsas":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\balsas.txt");
                break;
            case "Sinop":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\sipo.txt");
                break;
            case "Bonito":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\bonito.txt");
                break;
            case "Uberlandia":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\uberlandia.txt");
                break;
            case "Maraba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\maraba.txt");
                break;
            case "Patos":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\patos.txt");
                break;
            case "Maringa":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\maringa.txt");
                break;
            case "Olinda":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\olinda.txt");
                break;
            case "Picos":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\picos.txt");
                break;
            case "Petropolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\petropolis.txt");
                break;
            case "Caico":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\caico.txt");
                break;
            case "Bage":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\bage.txt");
                break;
            case "Ariquenes":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ariquenes.txt");
                break;
            case "Rorainopolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rorainopolis.txt");
                break;
            case "Blumenau":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\bumenau.txt");
                break;
            case "Campinas":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\campinas.txt");
                break;
            case "Lagarto":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\lagarto.txt");
                break;
            case "Itabaiana":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\itabaiana.txt");
                break;
            case "Araguarina":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\araguarina.txt");
                break;
            default:
                System.out.println("Não foi encontrada a cidade!");
        }
        identicarArquivo = new FileOutputStream(arquivoCidades);
        abrirArquivo = new DataOutputStream(identicarArquivo);

        abrirArquivo.writeBytes(populacao3 + ";" + area3 + ";" + densidade3 + ";" + pib3);

        switch (nomeCidade4) {
            case "Brasileia":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\brasileia.txt");
                break;
            case "Arapiraca":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\arapiraca.txt");
                break;
            case "Itaubal":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\itaubal.txt");
                break;
            case "Tefe":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\tefe.txt");
                break;
            case "Porto Seguro":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\portoSeguro.txt");
                break;
            case "Crato":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\crato.txt");
                break;
            case "Samambaia":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\samambaia.txt");
                break;
            case "Colatina":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\colatina.txt");
                break;
            case "Pirenopolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\pirenopolis.txt");
                break;
            case "Bacabal":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\bacabal.txt");
                break;
            case "Rondonopolis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\rondonopolis.txt");
                break;
            case "Corumba":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\corumba.txt");
                break;
            case "Ouro Preto":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\ouroPreto.txt");
                break;
            case "Castanhal":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\castanhal.txt");
                break;
            case "Santa Rita":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\santaRita.txt");
                break;
            case "Cascavel":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\cascavel.txt");
                break;
            case "Petrolina":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\petrolina.txt");
                break;
            case "Floriano":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\floriano.txt");
                break;
            case "Arraial do Cabo":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\arraialDoCabo.txt");
                break;
            case "Pau dos Ferros":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\pauDosFerros.txt");
                break;
            case "Santa Maria":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\santaMaria.txt");
                break;
            case "Buritis":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\buritis.txt");
                break;
            case "Alto Alegre":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\altoAlegre.txt");
                break;
            case "Joinville":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\joinville.txt");
                break;
            case "Guarulhos":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\guarulhos.txt");
                break;
            case "Itabaiana":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\itabaiana.txt");
                break;
            case "Porto Nacional":
                arquivoCidades = new File("C:\\SENAC\\Lista3\\portoNacional.txt");
                break;
            default:
                System.out.println("Não foi encontrada a cidade!");
        }

        identicarArquivo = new FileOutputStream(arquivoCidades);
        abrirArquivo = new DataOutputStream(identicarArquivo);

        abrirArquivo.writeBytes(populacao4 + ";" + area4 + ";" + densidade4 + ";" + pib4);

        abrirArquivo.close();

        identicarArquivo.close();

        String fullPath = arquivoCidades.getAbsolutePath();
        request.setAttribute("caminho", fullPath);

        request.getRequestDispatcher("censoDemografico.jsp").forward(request, response);

        System.out.println(populacao1);

        System.out.println(populacao2);

        System.out.println(populacao3);

        System.out.println(populacao4);

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
