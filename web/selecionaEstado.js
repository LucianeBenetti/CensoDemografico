function estados (x, y) {
    var cidades = document.getElementById("selecionaEstado");

    var opt0 = document.createElement("option");
    opt0.value = "0";
    opt0.text = "";
    cidades.add(opt0, selecionaEstado.options[0]);

    var opt1 = document.createElement("option");
    opt1.value = "scs";
    opt1.text = "São Caetano do Sul";
    cidades.add(opt1, selecionaEstado.options[1]);

    var opt2 = document.createElement("option");
    opt2.value = "sa";
    opt2.text = "Santo André";
    cidades.add(opt2, selecionaEstado.options[2]);
    
    var opt3 = document.createElement("option");
    opt3.value = "sbc";
    opt3.text = "São Bernardo do Campo";
    cidades.add(opt3, selecionaEstado.options[3]);

};


<form action="#" method="post">
  <p>
    <select id="cboCidades">                   
    </select>
  </p>
  <p>
    <input type="button" id="btnCarregar" value="Carregar combobox" />
  </p>
   
</form>


function selecionarTexto(elementId, cod) {
    var elt = document.getElementById(elementId);
    var opt = elt.getElementsByTagName("option");
    for(var i = 0; i < opt.length; i++) {
      if(opt[i].value == cod) {
        alert(opt[i].text);
        elt.value = cod;
      }
    }
  return null;
}

//
// String estado = request.getParameter("enviarEstado");
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


