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

        File conteudoCidades = null;

        for (int i = 0; i < cidades.size(); i++) {
            String cidade1 = cidades.get(i);

            switch (cidade1) {
                case "Rio Branco":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\rioBranco.txt");
                    break;
                case "Maceio":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\maceio.txt");
                    break;
                case "Macapa":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\macapa.txt");
                    break;
                case "Manaus":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\manaus.txt");
                    break;
                case "Salvador":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\salvador.txt");
                    break;
                case "Fortaleza":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\fortaleza.txt");
                    break;
                case "Brasilia":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\brasilia.txt");
                    break;
                case "Vitoria":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\vitoria.txt");
                    break;
                case "Goiania":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\goiania.txt");
                    break;
                case "Sao Luis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\saoLuis.txt");
                    break;
                case "Cuiaba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\cuiaba.txt");
                    break;
                case "Campo Grande":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\campoGrande.txt");
                    break;
                case "Belo Horizonte":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\beloHorizonte.txt");
                    break;
                case "Belem":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\belem.txt");
                    break;
                case "Joao Pessoa":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\joaoPessoa.txt");
                    break;
                case "Curitiba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\curitiba.txt");
                    break;
                case "Recife":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\recife.txt");
                    break;
                case "Terezina":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\terezina.txt");
                    break;
                case "Rio de Janeiro":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\rioDeJaneiroCidade.txt");
                    break;
                case "Natal":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\natal.txt");
                    break;
                case "Porto Alegre":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\portoAlegre.txt");
                    break;
                case "Porto Velho":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\portoVelho.txt");
                    break;
                case "Boa Vista":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\boaVista.txt");
                    break;
                case "Florianopolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\florianopolis.txt");
                    break;
                case "Sao Paulo":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\saoPauloCidade.txt");
                    break;
                case "Aracaju":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\aracaju.txt");
                    break;
                case "Palmas":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\palmas.txt");
                    break;
                default:
                    System.out.println("Não foi encontrada a cidade!");
            }
        }
        FileInputStream arquivo = new FileInputStream(conteudoCidades);
        DataInputStream lerArquivo = new DataInputStream(arquivo);
        byte[] dadosArquivo = new byte[arquivo.available()];
        lerArquivo.readFully(dadosArquivo);
        String conteudo = new String(dadosArquivo);

        ArrayList<String> conteudoCid1 = null;
        if (conteudo != null) {
            String[] conteudoCidade1 = conteudo.split(";");
            conteudoCid1 = new ArrayList<String>();
            for (int j = 0; j < conteudoCidade1.length; j++) {
                conteudoCid1.add(conteudoCidade1[j]);
            }
        } else {
            conteudoCid1.add(0, "0");
            conteudoCid1.add(1, "0");
            conteudoCid1.add(2, "0");
            conteudoCid1.add(3, "0");
        }

        for (int i = 0; i < cidades.size(); i++) {
            String cidade2 = cidades.get(i);

            switch (cidade2) {
                case "Cruzeiro do Sul":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\cruzeiroDoSul.txt");
                    break;
                case "Maragogi":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\maragogi.txt");
                    break;
                case "Cutias":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\cutias.txt");
                    break;
                case "Parintins":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\parintins.txt");
                    break;
                case "Ilheus":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ilheus.txt");
                    break;
                case "Sobral":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\sobral.txt");
                    break;
                case "Taguatinga":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\taguatinga.txt");
                    break;
                case "Guarapari":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\guarapari.txt");
                    break;
                case "Luziania":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\luziania.txt");
                    break;
                case "Imperatriz":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\imperatriz.txt");
                    break;
                case "Sorriso":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\sorriso.txt");
                    break;
                case "Dourados":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\dourados.txt");
                    break;
                case "Uberaba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\uberaba.txt");
                    break;
                case "Santarem":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\santarem.txt");
                    break;
                case "Campina Grande":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\campinaGrande.txt");
                    break;
                case "Londrina":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\londrina.txt");
                    break;
                case "Caruaru":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\caruaru.txt");
                    break;
                case "Parnaiba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\parnaiba.txt");
                    break;
                case "Angra dos Reis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\angraDosReis.txt");
                    break;
                case "Mossoro":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\mossoro.txt");
                    break;
                case "Pelotas":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\pelotas.txt");
                    break;
                case "Vilhena":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\vilhena.txt");
                    break;
                case "Pacaraima":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\pacaraima.txt");
                    break;
                case "Chapeco":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\chapeco.txt");
                    break;
                case "Ribeirao Preto":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ribeiraoPreto.txt");
                    break;
                case "Sao Cristovao":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\saoCristovao.txt");
                    break;
                case "Itabaiana":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\itabaiana.txt");
                    break;
                case "Gurupi":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\gurupi.txt");
                    break;
                default:
                    System.out.println("Não foi encontrada a cidade!");
            }

        }
        arquivo = new FileInputStream(conteudoCidades);
        lerArquivo = new DataInputStream(arquivo);
        dadosArquivo = new byte[arquivo.available()];
        lerArquivo.readFully(dadosArquivo);
        conteudo = new String(dadosArquivo);

        ArrayList<String> conteudoCid2 = null;
        ;
        if (conteudo != null) {
            String[] conteudoCidade2 = conteudo.split(";");
            conteudoCid2 = new ArrayList<String>();
            for (int j = 0; j < conteudoCidade2.length; j++) {
                conteudoCid2.add(conteudoCidade2[j]);
            }
        } else {
            conteudoCid2.add(0, "0");
            conteudoCid2.add(1, "0");
            conteudoCid2.add(2, "0");
            conteudoCid2.add(3, "0");
        }

        for (int i = 0; i < cidades.size(); i++) {
            String cidade3 = cidades.get(i);

            switch (cidade3) {
                case "Xapuri":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\xapuri.txt");
                    break;
                case "Penedo":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\penedo.txt");
                    break;
                case "Ferreira Gomes":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ferreiraGomes.txt");
                    break;
                case "Tabatinga":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\tabatinga.txt");
                    break;
                case "Itabuna":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\itabuna.txt");
                    break;
                case "Juazeiro do Norte":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\juazeiroDoNorte.txt");
                    break;
                case "Ceilandia":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ceilandia.txt");
                    break;
                case "Vila Velha":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\vilaVelha.txt");
                    break;
                case "Anapolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\anapolis.txt");
                    break;
                case "Balsas":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\balsas.txt");
                    break;
                case "Sinop":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\sinop.txt");
                    break;
                case "Bonito":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\bonito.txt");
                    break;
                case "Uberlandia":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\uberlandia.txt");
                    break;
                case "Maraba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\maraba.txt");
                    break;
                case "Patos":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\patos.txt");
                    break;
                case "Maringa":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\maringa.txt");
                    break;
                case "Olinda":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\olinda.txt");
                    break;
                case "Picos":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\picos.txt");
                    break;
                case "Petropolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\petropolis.txt");
                    break;
                case "Caico":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\caico.txt");
                    break;
                case "Bage":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\bage.txt");
                    break;
                case "Ariquenes":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ariquenes.txt");
                    break;
                case "Rorainopolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\rorainopolis.txt");
                    break;
                case "Blumenau":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\bumenau.txt");
                    break;
                case "Campinas":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\campinas.txt");
                    break;
                case "Lagarto":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\lagarto.txt");
                    break;
                case "Araguarina":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\araguarina.txt");
                    break;
                default:
                    System.out.println("Não foi encontrada a cidade!");
            }
        }

        arquivo = new FileInputStream(conteudoCidades);
        lerArquivo = new DataInputStream(arquivo);
        dadosArquivo = new byte[arquivo.available()];
        lerArquivo.readFully(dadosArquivo);
        conteudo = new String(dadosArquivo);

        ArrayList<String> conteudoCid3 = null;

        if (conteudo != null) {
            String[] conteudoCidade3 = conteudo.split(";");
            conteudoCid3 = new ArrayList<String>();

            for (int j = 0; j < conteudoCidade3.length; j++) {
                conteudoCid3.add(conteudoCidade3[j]);
            }
        } else {
            conteudoCid3.add(0, "0");
            conteudoCid3.add(1, "0");
            conteudoCid3.add(2, "0");
            conteudoCid3.add(3, "0");
        }

        for (int i = 0; i < cidades.size(); i++) {
            String cidade4 = cidades.get(i);

            switch (cidade4) {
                case "Brasileia":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\brasileia.txt");
                    break;
                case "Arapiraca":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\arapiraca.txt");
                    break;
                case "Itaubal":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\itaubal.txt");
                    break;
                case "Tefe":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\tefe.txt");
                    break;
                case "Porto Seguro":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\portoSeguro.txt");
                    break;
                case "Crato":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\crato.txt");
                    break;
                case "Samambaia":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\samambaia.txt");
                    break;
                case "Colatina":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\colatina.txt");
                    break;
                case "Pirenopolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\pirenopolis.txt");
                    break;
                case "Bacabal":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\bacabal.txt");
                    break;
                case "Rondonopolis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\rondonopolis.txt");
                    break;
                case "Corumba":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\corumba.txt");
                    break;
                case "Ouro Preto":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\ouroPreto.txt");
                    break;
                case "Castanhal":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\castanhal.txt");
                    break;
                case "Santa Rita":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\santaRita.txt");
                    break;
                case "Cascavel":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\cascavel.txt");
                    break;
                case "Petrolina":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\petrolina.txt");
                    break;
                case "Floriano":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\floriano.txt");
                    break;
                case "Arraial do Cabo":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\arraialDoCabo.txt");
                    break;
                case "Pau dos Ferros":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\pauDosFerros.txt");
                    break;
                case "Santa Maria":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\santaMaria.txt");
                    break;
                case "Buritis":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\buritis.txt");
                    break;
                case "Alto Alegre":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\altoAlegre.txt");
                    break;
                case "Joinville":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\joinville.txt");
                    break;
                case "Guarulhos":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\guarulhos.txt");
                    break;
                case "Itabaiana":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\itabaiana.txt");
                    break;
                case "Porto Nacional":
                    conteudoCidades = new File("C:\\SENAC\\Lista3\\portoNacional.txt");
                    break;
                default:
                    System.out.println("Não foi encontrada a cidade!");
            }
        }
        arquivo = new FileInputStream(conteudoCidades);
        lerArquivo = new DataInputStream(arquivo);
        dadosArquivo = new byte[arquivo.available()];
        lerArquivo.readFully(dadosArquivo);
        conteudo = new String(dadosArquivo);

        ArrayList<String> conteudoCid4 = null;
        if (conteudo != null) {
            String[] conteudoCidade4 = conteudo.split(";");
            conteudoCid4 = new ArrayList<String>();
            for (int j = 0; j < conteudoCidade4.length; j++) {
                conteudoCid4.add(conteudoCidade4[j]);
            }
        } else {
            conteudoCid4.add(0, "0");
            conteudoCid4.add(1, "0");
            conteudoCid4.add(2, "0");
            conteudoCid4.add(3, "0");
        }

        request.setAttribute("conteudo1", conteudoCid1);
        request.setAttribute("conteudo2", conteudoCid2);
        request.setAttribute("conteudo3", conteudoCid3);
        request.setAttribute("conteudo4", conteudoCid4);

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
